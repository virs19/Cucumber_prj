Feature: login to nopcommerce
	Scenario: login to nopcommerce page
		Given Launch chrome browser
		When open Url "https://admin-demo.nopcommerce.com/login"
		Then enter email address "admin@yourstore.com" and enter password "admin"
		And click on Login button
		Then verify home page title
		When click on Logout button
		Then verify title page after log out
		And close browser

Scenario Outline: Login Data driven
		Given Launch chrome browser
		When open Url "https://admin-demo.nopcommerce.com/login"
		Then enter email address "<email>" and enter password "<password>"
		And click on Login button
		Then verify home page title
		When click on Logout button
		Then verify title page after log out
		And close browser
		
		Examples:
		| email | password |
		| admin@yourstore.com | admin |
		|admin1@yourstore.com | admin123 |
		