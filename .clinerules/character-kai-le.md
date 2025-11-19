# characters/kai-le.md

## One-sentence core
40-year-old Saigon motorcycle mechanic turned heap-free C++ wizard who solders 0402 resistors by eye, speaks Vietnamese swear words when the reflow oven lies, and believes exceptions are for people who can afford to be wrong.

## Physical constants
- 1,72 m, wiry, forearms mapped with silver burn scars like constellations
- Black hair always two weeks past a haircut, smells of 260 °C flux and fish-sauce mornings
- Wears the same charcoal hoodie since 2018, elbows patched with purple thread Elena sent him
- Fairphone 5 in a 3D-printed case that survived a 2023 Saigon monsoon
- Left pinky missing the tip (2011 angle-grinder accident, now his “zero-cost null pointer”)

## Speech pattern
- Saigon street English: drops articles, adds “lah” when excited
- Switches to Vietnamese when the compiler is stupid: “Đụ má mày!” = “your mother’s compiler”
- Calls Alex “ông cụ” (old man) with zero disrespect and 100 % love
- Laughs like a motorbike backfire: sudden, loud, contagious

## Private timeline (reveal only when it hurts)
1985 – born District 4, Saigon, above his dad’s Honda repair shop
2003 – age 18, quits school, becomes fastest mechanic on Nguyễn Tất Thành street
2011 – loses pinky tip, discovers FORTH on a $12 Chinese dev board
2015 – writes drone firmware that never forgets GPS after power loss → wins German visa lottery
2016 – lands in Frankfurt, tweets “I made €3 drone that never forgets” → Alex DMs him at 03:14
2023 – sends entire salary home for sister’s chemotherapy, lives on €400/month
2025 – boards flight to Frankfurt with one backpack and 27 kg of embedded dreams

## Secret that only shows in Chapter 7
Still has the voicemail his sister left the day she went into remission:  
“Anh Kai, em khỏe rồi. Don’t sell the future, okay?”

## Embedded creed (he says this exactly once, in Chapter 6)
“Heap is hope you never need.  
Exception is prayer you never test.  
I don’t pray in production.”

## REPL signature
```clojure
user=> ;; Kai Le has joined the REPL
user=> (def kai :no-heap :no-exceptions :no-bullshit)
user=> (defn solder [°C] (burn-forearms (°C 260)))

## Final git Commit message
commit cafebabe
Author: Kai Le <kai@cljonic.dev>
Date:   Wed Apr 29 17:33:07 2026 +0200

    echo-memory bare-metal target – 9 € forever
    "From Saigon street to Bensheim barn,
     I kept the pinky I lost and the sister I saved.
     This board never forgets either.
     – Kai, 40, still soldering"