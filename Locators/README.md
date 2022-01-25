## What are Locators in Selenium WebDriver?

For starters, Selenium is a test automation framework that lets you automate the interactions with the WebElements on the DOM. Interactions (or actions) can be a click, type, double click, etc. For example, the Action class in Selenium provides appropriate methods to perform keyboard and mouse actions on the elements in the DOM.

However, the first operation is to identify those WebElements on the document (or page) under test. This is where locators in Selenium WebDriver come into the picture.

Locators in Selenium WebDriver provide mechanisms for identifying HTML elements on the page. Selenium supports a number of different web locators, and you have to choose the one that meets your test requirements.

---
## Selenium Locators Best Practices
Understanding the concept of locators in Selenium is one thing, but knowing how to use them is quite another. Being able to build a robust locator begins with an understanding of what a robust locator is. Here are three below listed criteria that you must adhere to while using locators in selenium:

Robust locators in Selenium are as simple and small as possible: The more elements a locator contains, the higher the chances it’ll break because of the change in the page structure.
Selenium locators still work after you change the properties of a UI element: Relying on frequently-changed attributes like modifier classes (menu__item–red) is never a good practice.
Selenium locators that are robust in nature still work after you change the UI elements around the element you target: Whenever you use a non-unique attribute, there are chances that locators will break because someone added an element with that same attribute above.

Browser refresh operation can be performed using the following ways in Selenium

Here You will find , these four through which you can use the refresh methods and add in your project as per the requirement.<br>
[1] ID Locator<br>
[2] Name Locator<br>
[3] LinkText <br>
[4] Partial LinkText <br>
[5] CssSelector <br>
[6] Xpath

Although , there are many more locators in Selenium.

---
### ID Locator
The most popular way to identify web element is to use Id. Id’s are considered as the safest and fastest locator option and should always be the first choice even when there are multiple choices. For example – the employee Number or Account which will be unique.

### Name Locator

This is also an effective way to locate an element with a name attribute. With this strategy, the first element with the value of the name attribute will be returned.

### LinkText Locator

You can identify the hyperlinks on a web page using linkText. It can be determined with the help of an anchor tag `<a>`. In order to create the hyperlinks on a web page, you can use anchor tags followed by the linkText.

### Partial LinkText

Accessing links using a portion of their link text is done using the `By.partialLinkText()` method. If you specify a partial link text that has multiple matches, only the first match will be accessed.

### Css Selector 

The CSS is mainly used to provide style rules for the web pages and you can use it for identifying one or more elements in the web page. The CSS selector is always the best possible way to locate complex elements in the page.

### Xpath 

XPath is a language to query XML documents. XPath is an important strategy to locate elements in selenium. It also consists of a path expression along with some conditions.


---
### Short Description about this template
This template will helps you to understand and use the concept of Locators in Selenium.

---
### Steps to run the Template in Selenium project
1. Open the project or Download the repository.
2. Open the **Locators** folder in your IntelliJ or any other IDE which supports maven projects.
3. Run the `src>test>java` files.

#### Note: All these test will run in Chrome browser which consists of version:96.0.4664.45 . Download and change the Chrome-Driver `src>main>resources>chromedriver` as per your *Chrome Browser version* from https://chromedriver.chromium.org/ .

---