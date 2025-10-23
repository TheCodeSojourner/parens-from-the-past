;; novel.clj
;; A Literate Clojure Novel: "Parens from the Past"
;; 
;; This is an interactive Clay document weaving a tale of a Clojure programmer's
;; journey through code, memory, and a vision for the future. Narrative unfolds
;; in Markdown comments, with executable Clojure snippets demonstrating concepts
;; from the story. Render with Clay for live evaluation and visualization.
;; 
;; To use: Save as novel.clj, require [scicloj.clay.v2.main], and call (clay/make! {:source-path "novel.clj"}).
;; Outputs to HTML with interactive code results.
;; 
;; Chapter 1: The First Paren
;; 
;; In the dim glow of a single monitor, Alex hunched over their keyboard, the cursor
;; blinking like a hesitant heartbeat. It was 2015, and Clojure had just slithered into
;; their life—a serpent of parentheses promising simplicity amid the chaos of enterprise Java.
;; "Why fight the mutable beast," Alex muttered, "when you can dance with immutability?"
;; 
;; That night, the first REPL session: a whisper of rebellion.

(ns novel.ch1
  (:require
   [scicloj.kindly.v4.api :as kindly]
   [scicloj.kindly.v4.kind :as kind]
   [clojure.string :as str]
   [clojure.repl :refer [doc]]))

;; Alex's first foray: Defining a simple function to count ways to make change,
;; echoing the ghosts of SICP. The code hummed, unyielding, a portal to recursive elegance.

(defn count-change [amount coin-denoms]
  (cond
    (zero? amount) 1
    (empty? coin-denoms) 0
    :else (+ (count-change amount (rest coin-denoms))
             (count-change (- amount (first coin-denoms)) coin-denoms))))

(kind/md "### First Execution: Making 100 Cents")
;; Watch the recursion unfold—pure, persistent, no side effects to haunt you.

(count-change 100 [1 5 10 25])

;; The result flickered: 242. Alex leaned back, a grin cracking the fatigue.
;; "This is it," they thought. "Data as code, code as data. No more classes clashing like
;; drunk uncles at a wedding." But the vision stretched further—a world where Clojure's
;; concision slashed the bloat of legacy systems, where lines of code bowed to expressiveness.
;; 
;; Yet doubt crept in. "Will this scale? Can parens topple empires of OOP drudgery?"

;; A snippet from Alex's notebook: Visualizing the cost of verbosity.
;; Imagine a chart comparing LOC in Java vs. Clojure for the same task.

(require '[scicloj.tableplot.v1.hanami :as hanami]
         '[tablecloth.api :as tc]
         '[scicloj.metamorph.ml.toydata :as toydata])

(def loc-comparison
  (tc/dataset
   {:language ["Java" "C++" "TypeScript" "C#" "Clojure"]
    :lines-of-code [800 600 500 450 150]
    :maintenance-cost [80 70 60 65 20]}))

(kind/md "### The Expressiveness Edge")
;; A bar chart: Clojure's brevity as a beacon for sustainable software.

(-> loc-comparison
    (hanami/plot hanami/bar-chart
                 {:=x :language
                  :=y :lines-of-code
                  :=color :language
                  :=color-type :nominal}))

;; As the bars towered—Java's monolith dwarfing Clojure's lithe form—Alex dreamed bigger.
;; A future where embedded systems, starved of heap and exceptions, embraced persistent data
;; structures. "Cljonic," they scribbled, a fusion of Clojure's soul with C++'s grit.
;; 
;; But the past pulled back. A bug in a namespace require: the dreaded "No such namespace."
;; Alex's hands flew—adding [xxx.yyy] to :require, reloading the world.

;; Simulate the fix: Metadata on a map, a Clojure quirk turned plot device.
;; In the story, this saves a project's soul, revealing hidden data.

(def project-config
  ^{:author "Alex"
    :version "1.0"
    :vision "Immutable futures"}
  {:db {:host "localhost"}
   :api {:port 8080}})

(meta project-config)

;; The metadata glowed: a personal stamp on the ether. "This is power," Alex realized.
;; Not just config, but a declaration. The novel's heart beat here—in code that remembers,
;; in visions that compile.
;; 
;; End of Chapter 1. To continue, extend this namespace or link to ch2.clj.
;; Interactive twist: Rerun (count-change 100 [50 25 10 5 1]) and watch the ways multiply—like ideas in a REPL.

;; Teaser for Chapter 2: Agents in the Wild
;; Async state, uncoordinated but harmonious. Clojure's agents as metaphors for life's parallel paths.
;; 
;; (def counter (agent 0))
;; (send-off counter inc) ; A future vision, dispatched.