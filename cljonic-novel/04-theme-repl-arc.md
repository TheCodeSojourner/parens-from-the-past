# 04-REPL-ARC.md

The REPL is the fifth character.  
It starts as four separate terminals and ends as one shared conversation that spans fifty years of computing history.

## Rules (never break)
- Every chapter ends with a literal REPL transcript in a single, shared session called `user=>`
- The session begins in Chapter 1 with Elena’s first line
- New contributors are announced exactly once:  
  `;; Raj Patel has joined the REPL`  
  `;; Kai Le has joined the REPL`
- Every historical vignette is echoed into the REPL by the person who loves it most
- The final line of Chapter 12 is typed by Dennis Ritchie in 2011 and echoed in 2027
- The cursor never blinks out until the very last page

## Chapter-by-chapter REPL transcript (exact text — copy-paste into every chapter end)

```clojure
;; Chapter 1 – Elena boots the session
user=> (def cljonic "Clojure’s laconic gift to embedded developers")
#'user/cljonic

;; Chapter 2 – Raj joins
user=> ;; Raj Patel has joined the REPL
user=> (defn smoke [] (blow-up-microcontroller))
#'user/smoke

;; Chapter 3 – FORTH night
user=> (def forth> :typewriter :1970)
#'user/forth>
user=> (forth> : remember  swap drop ; )

;; Chapter 4 – APL night
user=> (def apl> :ibm-golfball :1966)
#'user/apl>
user=> (apl> ⍳10)   ;; 1 2 3 4 5 6 7 8 9 10

;; Chapter 5 – Kai joins
user=> ;; Kai Le has joined the REPL
user=> (def qubit-0 (braid :majorana 32))
#'user/qubit-0

;; Chapter 6 – 100 M updates
user=> (dotimes [i 100000000] (def state (assoc state i i)))
; 0.84 seconds later
user=> (count state)
100000000

;; Chapter 7 – billion-dollar night
user=> (defn sell-the-future [] €1.2e9)
user=> (defn keep-the-conversation [] #{:past :present :future})
user=> (keep-the-conversation)
#{:past :present :future}

;; Chapter 8 – Auerbach lambda
user=> (swarm/broadcast :draw 'lambda)
; 42 seconds after power-off
user=> (echo/last-frame)
λ

;; Chapter 9 – patent war
user=> (publish/mask-layout :cc0)
; 03:14:07
user=> "The universe did it first."

;; Chapter 10 – Cljonic 1.0
user=> (release 1.0)
; GitHub status: purple
user=> (def generations 2_147_483_648)
#'user/generations