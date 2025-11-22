(ns parens-from-the-past.alias
  (:require [clojure.string :as cstr]))

(defn keyword->alias [k]
  (str "{{" (name k) "}}"))

(defn alias-replacer->html [alias-replacer]
  (format "<span style=\"white-space: nowrap;\">%s</span>"
          (cstr/escape alias-replacer {\< "&lt;" \> "&gt;" \& "&amp;"})))

(defn replace-aliases [aliases input]
  (reduce (fn [text [k v]]
            (let [alias-pattern (keyword->alias k)
                  replacement (alias-replacer->html v)]
              (cstr/replace text alias-pattern replacement)))
          input
          aliases))

(def aliases
  {:cpp "C++"
   :c# "C#"})

(defn alias-expand [s]
  (replace-aliases aliases s))

