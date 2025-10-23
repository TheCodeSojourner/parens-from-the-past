(ns parens-from-the-past.render
  (:require [babashka.fs :as fs]
            [scicloj.clay.v2.api :as clay]
            [scicloj.kindly.v4.kind :as kind]))

(defn make-novel []
  (clay/make! {:source-path (->> "notebooks"
                                 (fs/list-dir)
                                 (filter fs/regular-file?)
                                 (mapv fs/file-name)
                                 (filter (fn [file-name] (= "clj" (fs/extension file-name))))
                                 (sort))}))

(comment
  (make-novel)

  (clay/make! {:source-path (->> "notebooks"
                                 (fs/list-dir)
                                 (filter fs/regular-file?)
                                 (mapv fs/file-name)
                                 (filter (fn [file-name] (= "clj" (fs/extension file-name))))
                                 (sort))})

  (->> "notebooks"
       (fs/list-dir)
       (filter fs/regular-file?)
       (mapv fs/file-name)
       (filter (fn [file-name] (= "clj" (fs/extension file-name))))
       (sort))

  (kind/hiccup
   [:img {:src "notebooks/images/logo.png"
          :style {:display "block", :margin "0 auto", :width "80%"}}])

  ;
  )
