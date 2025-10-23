(ns chapter-00-index
  (:require [scicloj.kindly.v4.kind :as kind]))

;; # Parens From The Past

(kind/hiccup
 [:h1 "A Laconic Odyssey"])

(kind/hiccup
 [:table {:style {:width "100%;"}}
  [:tr
   [:td {:style {:width "50%", :padding-right "1em", :align :center}}
    [:img {:src "notebooks/images/logo.png", :alt "Cljonic"
           :style {:display :block, :margin "0 auto", :height "12em"}}]]
   [:td {:style {:width "50%", :padding-left "1em", :vertical-align :middle}}
    [:blockquote
     [:div {:style {:font-size "2em", :font-weight :bold}} "Laconic"]
     [:div "/ləˈkɒnɪk/"]
     [:div {:style {:font-style :italic}} "adjective"]
     [:br]
     [:div "Using very few words; concise to the point of seeming mysterious or rude."]]]]])

(kind/md
 "
**Parens from the Past: A Laconic Odyssey** blends nonfiction narrative with factual technology history, team collaboration drama, and science fiction. It explores computer programming as a powerful mix of mathematics, philosophy, linguistics, technology, and literature, focusing on the Clojure programming language. It traces the influences of early 20th-century research in math and computer science on Rich Hickey's creation of Clojure, and the ongoing developments of the Clojure community. It also highlights the Clojure community's emphasis on inclusion and acceptance of diverse opinions, showcasing how the community produces code that's beautiful, expressive, and valuable, and fosters teams that flourish and grow together.

The story follows a diverse remote team of programmers: Alex, a 70-year-old semi-retired software engineer; Elena, a linguist and ClojureScript expert; Raj, a math whiz enamored with clojure.core.logic; and Kai, a C++ specialist new to Clojure. Together, they develop \"Cljonic,\" a Clojure-inspired C++ library for embedded devices. Beginning with practical techniques like copying for persistent data, the project evolves into futuristic innovation, inspiring the invention of microcontrollers with \"echo memory\" enabled by \"quantum transducers.\"

Amid this technical odyssey, generational and worldview tensions emerge. Alex's faith-based outlook, shaped by decades of personal experience, and reflection on science, history, and philosophy, sparks candid discussions with the other team members, whose academic backgrounds have convinced them that an atheistic, materialistic view is the only evidence-based rational one. As mutual respect grows, these exchanges drive personal evolution, prompting deeper contemplation of hope, purpose, and the philosophical foundation of values like justice, diversity, and individual expression.

This novel attempts to demystify programming in general, encourages readers to experiment with Clojure, and celebrates human creativity alongside respectful, meaningful dialogue.
  ")
