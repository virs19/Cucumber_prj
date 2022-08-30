Feature: Customers

Scenario: Add a new customer
Given Launch chrome browser
When open Url "https://admin-demo.nopcommerce.com/login"
Then enter email address "admin@yourstore.com" and enter password "admin"
And click on Login button
Then User can view Dashboard
When User click on customer menu
And select customermenu item
And  click on add new button
Then Customer can view add new customer page
When user enter customer info
And click on save button
Then User can view confirmation message "The new customer has been added successfully"
And close browser


