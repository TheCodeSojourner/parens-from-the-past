^{:kindly/hide-code true}
(ns chapter-00
  (:require [scicloj.kindly.v4.kind :as kind]))

;; # Parens From The Past

(kind/hiccup
 [:div
  [:h1 "A Laconic Odyssey"]
  [:blockquote
   [:div {:style {:font-size "2em", :font-weight :bold}} "Laconic"]
   [:div "/ləˈkɒnɪk/"]
   [:div {:style {:font-style :italic}} "adjective"]
   [:br]
   [:div "Expressing much in few words; brief and pithy; concise to the point of seeming mysterious."]]
  [:img {:src "notebooks/images/logo.png", :alt "Cljonic"
         :style {:display :block, :margin-left :auto, :margin-right :auto, :height :auto, :width "50%"}}]])

(kind/md
 "

 > *To all the mathematicians, scientists, programmers, managers, teachers, family members, and friends who have inspired, mentored, supported, and encouraged me throughout my career.*

> *Special thanks to Rich Hickey, the Clojure core team, and the entire Clojure community for their remarkable accomplishments and their steadfast commitment to respect, inclusivity, and kindness.*  

**Parens From The Past: A Laconic Odyssey** explores the ideas that shaped modern computer programming, from early breakthroughs in mathematics and computer science to the creation of the Clojure language and the vibrant community it inspired, and on to imaginative discoveries in physics and electronics. Blending narrative, history, and inspiration, it reveals a world where thoughtful dialogue, diverse voices, and enduring code drive progress. This is a story about how ideas travel, how communities grow, and how great software and hardware emerge when people are free to learn, collaborate, and flourish together.

The story follows a diverse team of makers and programmers: 
  
* **Alex**, a 70-year-old semi-retired Clojure software engineer. 
* **Elena**, a linguist and programmer experienced with Babashka, a Clojure scripting engine, and ClojureScript, a Clojure-to-JavaScript compiler. 
* **Raj**, a quantum physicist with limited experience in Clojure. 
* **Kai**, an embedded C++ specialist who is new to Clojure.
  
Together, they develop **Cljonic** (/klə-jŏn'ĭk/), a Clojure-inspired C++ library for embedded systems. Following Clojure's lead, they begin with pragmatic techniques, such as a copy-on-write implementation of Clojure's persistent data structures. From there, **Cljonic** evolves into a platform for futuristic innovation, inspiring the creation of microcontrollers with **echo memory**, made possible by Raj's groundbreaking discovery in physics, which he calls **quantum transducers**.

Amid this technical odyssey from science fact to science fiction, generational and worldview tensions arise. Shaped by decades of research, experience, and contemplation of science, history, and philosophy, Alex’s faith-based outlook occasionally prompts candid, respectful, and succinct conversations with teammates, which are usually sparked by their first taking snarky shots at him. Their personal and academic backgrounds, combined with assumptions about Alex's beliefs, lead them to see their atheistic, materialistic perspective as the only rational worldview. Guided by the core values of the Clojure community, mutual appreciation for diverse perspectives gradually develops within the team, and these exchanges foster personal growth, prompting deeper reflection on hope, purpose, and the philosophical foundations of values such as justice, diversity, respect, and individual expression.
  
This novel seeks to demystify programming and encourage readers to explore Clojure, and celebrates human creativity through respectful and meaningful dialogue.
")
