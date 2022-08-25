# How to run test

Use **TestDropDown.java** for running test
```
src/test/java/steps/TestDropDown.java

```


# About project

* Project is written with java + selenium.
* For annotations is used **org.junit.jupiter**.
* For properties is used **aeonbits.owner**. URL & dropDownPath are stored in the properties.
* For webdriver is used **io.github.bonigarcia**.
* There are 3 possible browsers to test: chrome, firefox, edge. The browser settings are in **config.properties**
```
src/test/resources/config.properties

```
* There are 2 base classes for page and test classes:
```
src/test/java/BasePage.java

```
```
src/test/java/BaseTest.java

```
* Page is described with DropdownPage.java
```
src/test/java/DropdownPage.java

```
