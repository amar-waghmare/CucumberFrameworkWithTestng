Feature: Buy Product Functionality

#-----------------------------------
Scenario: Verify user is able to buy product from homepage flow as Guest

Given user is on home page 
When user clicks on product 
And enter quantity "5" and click on add to cart
And click on Shopping cart link 
And click on checkout 
And fill all user details those are compulsory 
And click on confirm order 
Then user is able to buy product and shows "Your order has been placed!"
