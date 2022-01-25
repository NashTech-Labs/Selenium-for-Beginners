## What is Select in Selenium
The 'Select' class in Selenium WebDriver is used for selecting and deselecting option in a dropdown. The objects of Select type can be initialized by passing the dropdown webElement as parameter to its constructor.


---
## Select in Selenium Uses
**How to select an option from drop-down menu?**

WebDriver provides three ways to select an option from the drop-down menu.

1. selectByIndex - It is used to select an option based on its index, beginning with 0.
`dropdown.selectByIndex(5);`
2. selectByValue - It is used to select an option based on its 'value' attribute.
`dropdown.selectByValue("Database");`
3. selectByVisibleText - It is used to select an option based on the text over the option.
`dropdown.selectByVisibleText("Database Testing");`
---
### What are CheckBoxes in Selenium

The checkbox is a GUI element that allows the user to make certain choices for the given options. Users may get a list of choices, and the checkbox records the choices made by the user. The checkbox allows users to select either single or multiple choices out of the given list.

---
### Methods used in CheckBoxes

We have used two methods :

* isSelected(): This method determines whether the checkbox is selected or not. If the checkbox is selected, then this method returns true otherwise false.
* click(): This method selects the locator. In this case, it is selecting the "Senior Citizen" checkbox.
---

### Short Description about this template
This template will make you to understand the concept of *DropDown and CheckBoxes* in Selenium.

---
### Steps to run the template in Selenium project
1. Open the project or Download the repository.
2. Open the **DropDown and CheckBoxes** folder in your IntelliJ or any other IDE which supports maven projects.
3. Run the `src>test>java` files.

#### Note: All these test will run in Chrome browser which consists of version:96.0.4664.45 . Download and change the Chrome-Driver `src>main>resources>chromedriver` as per your *Chrome Browser version* from https://chromedriver.chromium.org/ . 

---