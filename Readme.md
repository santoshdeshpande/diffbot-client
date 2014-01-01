Diffbot API for Article
========================


This is a sample implementation of the Article API for Diffbot (http://www.diffbot.com). The API can be used for
extracting article information as defined in the API docs here - http://www.diffbot.com/products/automatic/article/

Installation
------------

This is a maven enabled project and so running
    mvn clean install

should build and the jar should be ready for usage.

Usage
-----

```java
DiffbotAPI api = new DiffbotAPI()
Article article = api.fetchArticle(token, url)
```