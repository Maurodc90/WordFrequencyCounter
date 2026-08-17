# Word Frequency Counter

A lightweight Java application that processes text input, calculates the frequency of each unique word using a `HashMap`, and identifies the most frequently occurring word.

## Features

* **Text Normalization:** Converts input text to lowercase and strips all punctuation.
* **Efficient Tracking:** Leverages `HashMap` and `getOrDefault()` for $O(1)$ average-time word counts.
* **Frequency Analysis:** Iterates through the processed dataset to determine the highest-frequency word.

## How It Works

1. **Clean & Tokenize:** The raw string is cleaned using regular expressions (`[^a-zA-Z ]`) and split into an array of words.
2. **Count:** A `HashMap<String, Integer>` stores each word as a key and increments its corresponding value.
3. **Report:** The program prints all word frequencies followed by the top word and its count.

## Prerequisites

* **Java Development Kit (JDK):** Version 8 or higher
* Any IDE (IntelliJ IDEA, Eclipse, VS Code) or Terminal

## Running the Program

1. Clone this repository:
   ```bash
   git clone https://github.com/Maurodc90/WordFrequencyCounter.git
