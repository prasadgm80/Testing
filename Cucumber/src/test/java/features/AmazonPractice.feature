Feature: Testing Amazon website End to End

@Amazon1
Scenario: Navigate to Amazon Website
Given Enter Amazon Websites with proper link
When Search product "Shoes"
Then Select product with name "Shoes Stand"

@Amazon
Scenario: Choose product and add to cart
Given Enter Amazon Websites with proper link
When Search product "Shoes"
Then Select product with name "Shoes Stand"
And Click on the product
And add to cart
And go to cart
