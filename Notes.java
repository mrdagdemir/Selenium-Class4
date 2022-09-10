package com.syntax.class04;

public class Notes {
    /*
    Selenium Class 4

CSS Selectors (Cascading Style sheet)
it is another way of locating elements on the web page

Syntax:
tagname[attribute = 'attribute value']

e.g. input[value = 'LOGIN']

CSS does not give us an opportunity to locate the elements by its text

Shortcuts for CSS:
Shortcut for the className --> "."

Syntax: tagname.classNameValue
        input.button

Shortcut for ID --> "#"
Syntax: tagname#idValue
        input#txtPassword

contains() method in css:
* symbol represents contains method
tagname[attribute *= 'partial attribute value']
input[placeholder *= 'phone']

starts-with method in css:
^ (Circumflex) symbol represents starts-with method
tagname[attribute ^= 'starting attribute value']
input[aria-label ^= 'Pass']

ends-with method in css:
$ symbol represents ends-with method in css
tagname[attribute $= 'ending attribute value']
a[href $= 'login']

Xpath vs CSS
-- CSS cannot locate the elements by text whereas xpath can
-- css has shortcuts
-- xpath does not have ends-with method
-- css is faster than xpath in locating elements
-- css has more simple syntax than xpath


WebElement Commands:
consists of several methods where we can perform an action and get the element state
on the webpage

isEnabled() --> boolean
isDisplayed() --> boolean
isSelected() -- boolean
clear() -- void
getText() --> String
getAttribute() --> String
submit() --> void


Task
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed. if condition

TC 1: Amazon link count:
Open chrome browser
Go to “https://www.amazon.com/”
Get all links
Get number of links that has text
Print to console only the links that has text

HW 2
HRMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.

     */
}
