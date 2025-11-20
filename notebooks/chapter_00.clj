^{:kindly/hide-code true}
(ns chapter-00
  (:require [scicloj.kindly.v4.kind :as kind]))

;; # Parens From The Past

(kind/hiccup
 [:h1 "A Laconic Odyssey"])

(kind/md
 "> *To all the mathematicians, scientists, computer programmers, managers, family members, and friends who have inspired, mentored, helped, and encouraged me throughout my career.*

> *A special thanks to Rich Hickey and the entire Clojure community for their astounding accomplishments and their commitment to inclusivity.*")

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
     [:div "Expressing much in few words; brief and pithy; concise to the point of seeming mysterious."]]]]])

(kind/md
 "
**Parens from the Past: A Laconic Odyssey** blends nonfiction narrative with factual technology history, dramatic team collaboration, and science fiction. It explores computer programming as a powerful mix of mathematics, philosophy, linguistics, technology, and literature, focusing on the Clojure programming language. It traces the influences of early 20th-century research in mathematics and computer science on Rich Hickey's creation of Clojure, and the ongoing growth and developments of the Clojure community. It also highlights the Clojure community's emphasis on inclusion and acceptance of diverse opinions, showcasing how the community produces code that's beautiful, expressive, and valuable, and fosters teams that flourish and grow together.

The story follows a diverse team of makers/programmers: 
  
* Alex, a 70-year-old semi-retired Clojure software engineer; 
* Elena, a linguist, and programmer familiar with Babashka, a Clojure scripting engine, and ClojureScript, a Clojure to JavaScript generator; 
* Raj, a quantum physicist with minimal Clojure experience; 
* and Kai, an embedded C++ specialist new to Clojure. 
  
Together, they develop \"Cljonic,\" a Clojure-inspired C++ library for embedded systems development. Following Clojure's lead, they begin with pragmatic techniques like a copy-on-write implementation of Clojure's persistent data structures. From there, Cljonic evolves into futuristic innovation, inspiring the invention of microcontrollers with \"echo memory\" enabled by Raj's new Physics discovery called \"quantum transducers.\"

Amid this technical odyssey, generational and worldview tensions emerge. Alex's faith-based outlook, shaped by decades of personal experience, and reflection on science, history, and philosophy, sparks candid, but succinct, discussions with the other team members, whose academic backgrounds, and misconceptions about Alex's faith, have convinced them that an atheistic, materialistic perspective is the only rational worldview. As mutual respect grows, these exchanges drive personal evolution, prompting deeper contemplation of hope, purpose, and the philosophical foundation of values like justice, diversity, and individual expression.

This novel attempts to demystify programming in general, encourages readers to experiment with Clojure, and celebrates human creativity in the context of respectful, meaningful dialogue.
  ")
