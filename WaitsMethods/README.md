## What is Wait in Selenium?
Waits in Selenium is one of the important pieces of code that executes a test case. It runs on certain commands called scripts that make a page load through it. 

Selenium Waits makes the pages less vigorous and reliable. It provides various types of wait options adequate and suitable under favorable conditions. 

This ensures you don't mess up and get ended into failed scripts while performing automation testing with it.

Elaborately, Selenium Waits helps the user to troubleshoot various issues while page redirection across different web pages. 

It is achieved by refreshing the entire web page and reloading it with new elements.

---

## Why we use waits methods in Selenium

When a web page loads on a browser, various web elements (buttons, links, images) that someone wants to interact with may load at various intervals.

In automated Selenium testing, this causes some trouble when identifying certain elements. If an element is not located then the “ElementNotVisibleException” appears. Selenium Wait commands help resolve this issue.

Waits are in the selenium web driver to resolve the synchronization problem. Synchronization problem occurs when two things do not have the same speed.
<br>
<li>Software under test / Application under test [not having constant speed]
<li>Selenium [constant speed]
<br><br>
Suppose you enter a username password and if you click on the login button then it takes a little time to load the next page. But if the selenium is not waiting and firing the next command. 
<br><br>
In this case, you will get a message  "<b>NoSuchElementException</b>”.
<br><br>
We can say this problem is a synchronization problem and to overcome this we have selenium wait commands in the selenium web driver.

This can be done using the refresh command provided by Selenium web driver.

---
## Types of Waits in Selenium

Waits operation can be performed using the following ways in Selenium.
<br><br>
Here You will find , these four through which you can use the waits methods and add in your project as per the requirement.<br><br>
[1] pageLoadTimeOut<br>
[2] ImplicitWait<br>
[3] Explicit Wait<br>
[4] FluentWait<br>
---
### Short Description 
This project will help you to understand all types of waits methods used in Selenium and can be implemented  directly.

---
####1. pageLoadTimeOut method
Page Load Timeout is responsible for setting the wait time for a page to load. Page Load Timeout returns a Timeouts interface and has 2 parameters:

Time – timeout <br>
Unit – time unit such as milliseconds, seconds, etc.

####Syntax:
- driver – is an object for the WebDriver interface
- manage – returns an Options interface
- timeouts – returns the interface for managing driver timeouts
---

####2. ImplicitWait method
Implicit Wait determines the amount of time a driver should wait for an element. If a program has multiple elements with a driver instance then Selenium waits for each element. 
<br><br>
When we want to state a maximum wait time, which is generally common for most of the web elements on your web-based application. 
<br><br>
Based on those conditions as a developer of your web driver test cases, we have to arrive at a value for the maximum implicit wait time, such that our test cases do not take much time to execute and at the same time do not get timed out very frequently.
<br><br>
Selenium will only wait if the element is not immediately present. 
---
####3.ExplicitWait method

Explicit Wait is used on 1 element at a time. Selenium pauses execution until time has expired or an expected condition is met using the WebDriverWait class.
<br><br>
We can simply say the explicit wait is conditional wait. Explicit wait tells the web driver to wait for certain conditions before it exceeds maximum time.
---
####4.FluentWait method

Fluent Wait in Selenium marks the maximum amount of time for Selenium WebDriver to wait for a certain condition (web element) becomes visible. It also defines how frequently WebDriver will check if the condition appears before throwing the “ElementNotVisibleException”.
<br><br>
To put it simply, Fluent Wait looks for a web element repeatedly at regular intervals until timeout happens or until the object is found.
<br><br>
Fluent Wait commands are most useful when interacting with web elements that can take longer durations to load.
<br><br>
While using Fluent Wait, it is possible to set a default polling period as needed. The user can configure the wait to ignore any exceptions during the polling period.
<br><br>
Fluent waits are also sometimes called smart waits because they don’t wait out the entire duration defined in the code. Instead, the test continues to execute as soon as the element is detected – as soon as the condition specified in .until(YourCondition) method becomes true.
<br><br>
**Syntax:**
```
Wait wait = new FluentWait(WebDriver reference)
.withTimeout(timeout, SECONDS)
.pollingEvery(timeout, SECONDS)
.ignoring(Exception.class);

WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
public WebElement applyy(WebDriver driver) {
return driver.findElement(By.id("foo"));
}
});
```
---
### <u>Steps to run the Waits Method in the Project</u>
1. Open the project or Download the repository.
2. Open the **WaitsMethods** folder in your IntelliJ or any other IDE which supports maven projects.
3. Run the test files.
4. Run any of the individual file which is stored in `src>test>java`.