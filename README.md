# Parens From The Past: A Laconic Odyssey

<table style="width: 100%;">
  <tr>
    <td style="width: 50%; padding-right: 1em; text-align: center;">
      <img src="notebooks/images/logo.png" alt="Cljonic" style="display: block; margin: 0 auto; height: 12em;">
    </td>
    <td style="width: 50%; padding-left: 1em; vertical-align: middle;">
      <blockquote>
        <div style="font-size: 2em; font-weight: bold;">Laconic</div>
        <div>/ləˈkɒnɪk/</div>
        <div style="font-style: italic;">adjective</div>
        <br>
        <div>Using very few words; concise to the point of seeming mysterious or rude.</div>
      </blockquote>
    </td>
  </tr>
</table>

## Overview

**Parens from the Past: A Laconic Odyssey** is a novel that attempts to demystify programming in general, encourages readers to experiment with the Clojure programming language, and celebrates human creativity alongside respectful, meaningful dialogue.

## Technology

### Writing the Novel

One of the goals of the novel is to "Clojure All The Things," which expresses the idea of pushing the use of Clojure, including its dialects and tools (e.g., babashka, Clay, Hiccup, Calva), as far as possible. This philosophy draws inspiration from the C++ community's slogan "constexpr All The Things," emphasizing maximal use of compile-time computation, adapted here to maximize Clojure's development effectiveness.

The novel is authored using **Clojure**, a functional programming language known for its laconic nature. It employs a **literate programming** approach, pioneered by Donald Knuth, where narrative text and code are interwoven seamlessly in notebook files.

- **Clay**: A Clojure library for creating literate-programming-style notebooks and documents. The content resides in the `notebooks/` directory as `.clj` files, blending prose with executable Clojure code to illustrate concepts dynamically. [GitHub](https://github.com/scicloj/clay) | [Documentation](https://scicloj.github.io/clay/)

### Rendering the Novel
The notebooks are rendered into a static website using [Quarto](https://quarto.org/), a multi-format publishing system, via Clay.

- **Clay Configuration** (`clay.edn`): 
  - Processes notebooks from `notebooks/` into Quarto Markdown (`.qmd`) files.
  - Outputs HTML to the `docs/` directory.

This setup allows the novel to be read as an interactive, web-based book, with multiple chapters each in its own `.html` file. The rendering emphasizes readability while preserving the educational and philosophical essence of the content.

### Tooling
- **Calva**: A Clojure extension for VS Code, providing REPL integration and code editing support.
- **Calva Power Tools**: Extensions enhancing Calva's capabilities for advanced Clojure development.
- **Cline**: An AI assistant extension for VS Code, aiding in software development tasks with natural language understanding capabilities.
