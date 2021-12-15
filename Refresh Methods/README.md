## Installation Guide to Run Selenium Project

If you want to run your maven project which consists of Selenium Work, either you can use IntelliJ or use Maven.

Lists:
<li>Intellij</li>

`sudo apt-get -y update`<br>
`sudo snap install intellij-idea-community --classic`<br>
`echo "============= Intellij Installed=================="`<br>
`sudo apt-get -y update`<br>

<li>Java</li>

`sudo apt install default-jre -y`<br>
`echo "============= Java jre Installed =================="`<br>
`sudo apt install default-jdk -y`<br>
`echo "============= Java jdk Installed =================="`<br>
`echo "============= Java Version ===================="`<br>
`java -version`<br>

<li>Maven</li>

`sudo apt update`<br>
`sudo apt install maven`<br>
`echo "============= Maven Installed=================="`<br>
`mvn -version`<br>

<li>Chrome Browser</li>

`sudo apt-get -y update`<br>
`wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb` <br>
`echo "============= Chrome Downloaded=================="` <br>
`sudo apt install ./google-chrome-stable_current_amd64.deb`<br>
`echo "============= Chrome Installed=================="`<br>

<li>FireFox Browser</li>

`sudo apt-get update`<br>
`sudo apt install firefox`<br>
`echo "============= Firefox Installed=================="`<br>


To run the maven project , open the terminal and run these commands where the project is present.<br>
`mvn clean`<br>
`mvn test`<br>

To run the project in intellij just open the project and run the test cases.

## Use of Refresh methods in Selenium


During test automation of web-based application, there comes a need for the page to be refreshed multiple times for all
web elements to be loaded completely.

On the initial page load, some web elements might be loaded while it takes a second page refresh for all web elements to
be loaded.

This can be done using the refresh command provided by Selenium web driver.

Browser refresh operation can be performed using the following ways in Selenium

Here You will find , these four through which you can use the refresh methods and add in your project as per the requirement.<br>
[1] Get method.<br>
[2] Navigate method.<br>
[3] Send Keys method using F5 Key.<br>
[4] Send Keys method using ASCII Code.<br>

### Short Description about this template
This template will helps you to understand and use the concept of Refresh methods in Selenium.

### Steps to run the Refresh Method project
1. Open the project or Download the repository.
2. Open the **RefreshMethods** folder in your IntelliJ or any other IDE which supports maven projects.
3. Run the test files or you can also run maven commands as described above.
