## What are Actions in Selenium
Actions class is an ability provided by Selenium for handling keyboard and mouse events. 
In Selenium WebDriver, handling these events includes operations such as drag and drop, 
clicking on multiple elements with the control key, among others. <br><br>
These operations are performed using the advanced user interactions API. 
It mainly consists of Actions that are needed while performing these operations.

---
## Selenium Actions Best Practices

To test an application, one needs to perform a number of user actions on it. To perform any operations on the web application such as double-click, selecting drop-down boxes, etc. the actions class is required.

**Mouse Actions in Selenium:**

* doubleClick(): Performs double click on the element
* clickAndHold(): Performs long click on the mouse without releasing it
* dragAndDrop(): Drags the element from one point and drops to another
* moveToElement(): Shifts the mouse pointer to the center of the element
* contextClick(): Performs right-click on the mouse

**Keyboard Actions in Selenium:**

* sendKeys(): Sends a series of keys to the element
* keyUp(): Performs key release
* keyDown(): Performs keypress without release

---
### Short Description about this template
This template will make you to understand the concept of *Action class* in Selenium.

---
### Steps to run the Template in Selenium project
1. Open the project or Download the repository.
2. Open the **Actions** folder in your IntelliJ or any other IDE which supports maven projects.
3. Run the `src>test>java` files.

#### Note: All these test will run in Chrome browser which consists of version:96.0.4664.45 . Download and change the Chrome-Driver `src>main>resources>chromedriver` as per your *Chrome Browser version* from https://chromedriver.chromium.org/ . 

---