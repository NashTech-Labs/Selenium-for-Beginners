
# What is Drag and Drop Action?
This is an action performed with a mouse when a user moves (drags) a web element and then places (drops) it into an alternate area.

E.g. This is a very common action used in Windows Explorer while moving any file from one folder to another. Here, the user selects any file in the folder, drags it to the desired folder and just drops it.



To perform the drag-drop action through a Selenium script there are two ways.
here are the methods Actions class provides for Drag-Drop action:

1. dragAndDrop(WebElementsource, WebElement target)
You can see in the test file `DragandDropTest`passed source and destination by Id locator .<br><br>

2. dragAndDropBy(WebElementsource, int xOffset, int yOffset)
  In this method we passed some integar value you can see in the test file `DragandDrop_offSetTest`passed source and destination and xOffset represent as horizontal movement
   yOffset represent as vertical movement.<br><br>


---
# Short Description about this template

This template will help you to use how to automate the drag and drop feature in Selenium.

---

# Steps for Execution 

1. Clone or Download the repository in your System

2. Open the project in any IDE which run maven project.

3. Go to project and run Test files.
















