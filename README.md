# Parens From The Past: A Laconic Odyssey

 <div style="width: 100%">
   <img src="notebooks/images/logo.png" alt="Cljonic" style="display: block; margin: 2em auto; height: 12em;">
   <blockquote>
     <div style="font-size: 2em; font-weight: bold;">Laconic</div>
     <div>/ləˈkɒnɪk/</div>
     <div style="font-style: italic;">adjective</div>
     <br>
     <div>Expressing much in few words; brief and pithy; concise to the point of seeming mysterious.</div>
   </blockquote>
 </div>  

## Overview

**Parens from the Past: A Laconic Odyssey** is a novel that seeks to demystify programming and encourage readers to explore Clojure, and celebrates human creativity through respectful and meaningful dialogue.

## Technology

### Writing the Novel

One of the goals of the novel is to "Clojure All The Things," which expresses the idea of pushing the use of Clojure, including its dialects and tools (e.g., babashka, Clay, Hiccup, Calva), as far as possible. This philosophy draws inspiration from the C++ community's slogan "constexpr All The Things," emphasizing maximal use of compile-time computation, adapted here to maximize Clojure's development effectiveness.

The novel is authored using **Clojure**, a functional programming language known for its laconic nature. It employs a **literate programming** approach, pioneered by Donald Knuth, where narrative text and code are interwoven seamlessly in notebook files.

- **Clay**: A Clojure library for creating literate-programming-style notebooks and documents. The content resides in the `notebooks/` directory as `.clj` files, blending prose with executable Clojure code to illustrate concepts dynamically. [GitHub](https://github.com/scicloj/clay) | [Documentation](https://scicloj.github.io/clay/)

### Rendering the Novel
The notebooks are rendered into a static website using [Quarto](https://quarto.org/), a multi-format publishing system, via Clay. A **Babashka** script is used to provide automation tasks.

- **Clay Configuration** (`clay.edn`): 
  - Processes notebooks from `notebooks/` into Quarto Markdown (`.qmd`) files.
  - Outputs HTML to the `docs/` directory.
- **Babashka Tasks** (`bb.edn`): 
  - In a terminal, execute `bb tasks` to get a list of available tasks.
  - Task: `browse` will open the `firefox` browser with the `index.html` page created by the `render` task.
  - Task: `render` will use `clay` to render the novel to `quarto` static HTML.

This setup allows the novel to be read as an interactive, web-based book, with multiple chapters each in its own `.html` file. The rendering emphasizes readability while preserving the educational and philosophical essence of the content.

### Tooling
- **Babashka**: A native Clojure interpreter for scripting with fast startup.
- **Calva**: A Clojure extension for VS Code, providing REPL integration and code editing support.
- **Calva Power Tools**: Extensions enhancing Calva's capabilities for advanced Clojure development.
- **Cline**: An AI assistant extension for VS Code, aiding in software development tasks with natural language understanding capabilities.
