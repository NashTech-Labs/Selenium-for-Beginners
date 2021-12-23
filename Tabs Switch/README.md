# Short Description about this template

This template will help you to perform tab switching in selenium when you are doing any automation part and the  particular automated element are in the another tab.

---
# Why do we need tab switching in selenium

A web page contains many links, If we are doing any automation work and the particular automated elements are in the another tab so firstly we need to switch to the another tab and perform some action that you want .

In the selenium there are 2 ways to switch the tab:
<li>Handling Tabs In Selenium Using The Window Handler Method.</li>
<li>Handling Tabs In Selenium Using The Action Class.</li>
<br>

You can see in the test file `TabswitchTest`.<br><br>

Here using Action class for tab switching in the line `driver.switchTo().window(newTb.get(1));`  
<br>
Here we are pass value 1 so the value 1 refers the one tab switch from the current tab, 
if you want to switch second tab from current tab then value will be 2 and if you want to switch to the current/parent tab 
then value will be 0 as seen in the file `TabswitchforcurrenttabTest`.

So this template will open the knoldus blogs page and perform some action like enter email address into another tab by using 
Action class method.

For more details you can go through this link :
https://blog.knoldus.com/windows-handling-using-selenium-webdriver/
---
# Steps for Execution 

1. Clone or Download the repository in your System

2. Open the project in any IDE which run maven project.

3. Go to project and run Test files.
















