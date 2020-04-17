# Search Engine

A Java based Web Search Engine that:

* Crawl websites ( [Geeks for Geeks](https://www.geeksforgeeks.org/java/), [JavatPoint](https://www.javatpoint.com/java-tutorial), [TutorialsPoint](https://www.tutorialspoint.com/java/index.htm), [Oracle](https://docs.oracle.com/javase/tutorial/), [Guru99](https://www.guru99.com/java-tutorial.html), [Beginners Book](https://beginnersbook.com/java-tutorial-for-beginners-with-examples/) ) to fetch the data. 
* Finds keywords using [KMP](https://en.wikipedia.org/wiki/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm) string matching algorithm
* Searching patterns in database using InvertedIndex
* Rank the web pages using word frequencies 
* Finds patterns using regular expressions
* Converts HTML web pages to text format
* Analyzes the frequencies of words using hash tables

## Project Structure

```
search-engine
|   README.md
|   .classpath    
|   .project
|   .gitignore
|
└───src
|   └───searchEngine
|   |   |   Controller.java -> Main File
|   |   |   Crawler.java
|   |   |   EditDistance.java
|   |   |   Helper.java
|   |   |   In.java
|   |   |   InvertedIndex.java
|   |   |   KMP.java
|   |   |   Menu.java
|   |   |   SpellCheck.java
|   |   |   StdOut.java
|
└───bin
|   └───searchEngine
|   |   |   Controller.class
|   |   |   Crawler.class
|   |   |   EditDistance.class
|   |   |   Helper.class
|   |   |   In.class
|   |   |   InvertedIndex.class
|   |   |   KMP.class
|   |   |   Menu.class
|   |   |   SpellCheck.class
|   |   |   StdOut.class
|
|
└───WebContent
|
└───WebPages
```
