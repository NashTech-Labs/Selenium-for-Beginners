
# What is iframe ?

An iframe is the  short form of  inline frame,It  is an HTML element that contains another HTML document within it. The iframe element is specified with the iframe tag. It may be placed anywhere in an HTML document, and thus anywhere on a web page. By doing this, you can display a secondary webpage on your main page.

Iframes are most often used to display external web documents on a page. You can embed maps, PDFs, videos, or other resources such as an advertisement into a Web page.

# How to know a web page have an iframe

There are two ways to identify a web page has iframe :

1. The first way is inspect the page by ctrl+shift+I or right click from mouse and select Inspect option and search for `iframe-tags`. If the web page find any iframe tags, it means the web page includes iframes.


2. The second way is Right-click on the specific element and check all the options. If you find an option like This Frame, view Frame source or Reload Frame, it means the web page includes iframes.

# Methods to handle iframe in selenium

We can handle an iframe in selenium by 3 ways: 

1. By Index.
2. By Name or ID.
3. By Web Elements.

for more details you can refer this blog: 

`https://blog.knoldus.com/how-to-handle-iframe-in-selenium-webdriver/`

Note:

If the web page have only one iframe then prefer  by index value.
If single web page have  many iframe  then use By Name or Id if it is unique then it is best and use second way
otherwise you use By Web Elements and surely it will give uniquely.

In the link `https://developer.mozilla.org/en-US/docs/Learn/HTML/Multimedia_and_embedding/Other_embedding_technologies`

There only one iframe so i used By Index value in the switchTo method.
We can also use by Web element or name and id but in above page iframe attribute name and id was not unique so in the comment part of code you can see i am using By Web Element also.
 


# Short Description about this template

This template will help to handle iframe in selenium when you are doing any automation part and the automated particular element are in the iframe tag.

# Steps for Execution 

1. Clone or Download the repository in your System

2. Open the project in any IDE which run maven project.

3. Go to project and run `HandleiframeTest` file.
















