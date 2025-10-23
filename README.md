# Parens From The Past: A Laconic Odyssey

## Overview

**Parens from the Past: A Laconic Odyssey** is a novel that attempts to demystify programming in general, encourages readers to experiment with Clojure, and celebrates human creativity alongside respectful, meaningful dialogue.

## Technology

### Writing the Novel

One of the goals of the novel is to "Clojure All The Things," which expresses the idea of pushing the use of Clojure, including its dialects and tools (e.g., babashka, Clay, Hiccup, Calva), as far as possible. This philosophy draws inspiration from the C++ community's slogan "constexpr All The Things," emphasizing maximal use of compile-time computation, adapted here to maximize Clojure's expressive power.

The novel is authored using **Clojure**, a functional programming language known for its laconic nature. It employs a **literate programming** approach, pioneered by Donald Knuth, where narrative text and code are interwoven seamlessly in notebook files.

- **Clay**: A Clojure library for creating literate-programming-style notebooks and documents. The content resides in the `notebooks/` directory as `.clj` files, blending prose with executable Clojure code to illustrate concepts dynamically. [GitHub](https://github.com/scicloj/clay) | [Documentation](https://scicloj.github.io/clay/)

### Rendering the Novel
The notebooks are rendered into a static website using **Quarto**, a multi-format publishing system.

- **Clay Configuration** (`clay.edn`): 
  - Processes notebooks from `notebooks/` into Quarto Markdown (`.qmd`) files.
  - Outputs HTML to the `parens-from-the-past/` directory.
  - Features: Hides code blocks by default for a narrative focus.

This setup allows the novel to be read as an interactive, web-based book, with multiple chapters each generating corresponding `.html` files. The rendering emphasizes readability while preserving the educational and philosophical essence of the content.

### Tooling
- **Calva**: A Clojure extension for VS Code, providing REPL integration and code editing support.
- **Calva Power Tools**: Extensions enhancing Calva's capabilities for advanced Clojure development.
