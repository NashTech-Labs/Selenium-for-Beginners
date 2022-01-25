## Alerts in Selenium
Alert is a message/notification box that notifies the user about some information or asks for permission to perform a certain kind of operation. It may be used for warning purposes as well.

---
## Use of Alerts in Selenium
Handling alerts manually is a tedious task. To reduce human intervention and ease this task, Selenium provides a wide range of functionalities and methods to handle alerts.

The following methods are useful to handle alerts in selenium:

1. Void dismiss(): This method is used when the ‘Cancel’ button is clicked in the alert box.

`driver.switchTo().alert().dismiss();`
2. Void accept(): This method is used to click on the ‘OK’ button of the alert.

`driver.switchTo().alert().accept();`
3. String getText(): This method is used to capture the alert message.

`driver.switchTo().alert().getText();`
4. Void sendKeys(String stringToSend): This method is used to send data to the alert box.

`driver.switchTo().alert().sendKeys("Text");`

---
### Short Description about this template
This template will make you to understand the concept of *Alerts and Prompts* in Selenium.

---
### Steps to run the Template in Selenium project
1. Open the project or Download the repository.
2. Open the **Alerts and Prompt** folder in your IntelliJ or any other IDE which supports maven projects.
3. Run the `src>test>java` files.

#### Note: All these test will run in Chrome browser which consists of version:96.0.4664.45 . Download and change the Chrome-Driver `src>main>resources>chromedriver` as per your *Chrome Browser version* from https://chromedriver.chromium.org/ . 

---