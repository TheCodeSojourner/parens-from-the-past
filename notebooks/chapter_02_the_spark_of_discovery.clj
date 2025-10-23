(ns chapter-02-the-spark-of-discovery
  (:require [scicloj.kindly.v4.kind :as kind]))

(kind/hiccup
 [:div {:style
        {:background-color "#eeddcc"}}
  [:p "The Spark Of Discovery"]])

(kind/md
 "
# Chapter 2 — Getting Started

Welcome to our book. This chapter introduces the main ideas.

We can embed live code examples:
")

(kind/code
 "(map inc [1 2 3 4])")

(kind/md
 "
And plot some data:
")

