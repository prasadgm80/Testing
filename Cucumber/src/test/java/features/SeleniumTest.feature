Feature: Testing Selenium flow for Rahul ShettyAcademy.com

@Selenium
Scenario: Searching vegetable name and validating it
Given User is navigated to website
When User searched for vegetable "Cucumber"
Then Results "Cucumber" are displayed

@Selenium
Scenario: Searching vegetable name and Adding it to cart
Given User is navigated to website
When User searched for vegetable "Brinjal"
And item is added to cart
And proceed to checkout
Then verify "Brinjal" is populated

