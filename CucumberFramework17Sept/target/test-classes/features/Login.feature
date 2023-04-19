Feature: Login Functionality

#-------------------------------------------------------------------------
Scenario Outline: Verify user is able to logged in account with valid details

Given user is on home page 
When Clicked on My account and login link 
Then user navigates to account login 
When User enter email as "<email>" and password as "<Password>" and clicked on login 
Then logged in sucessfully

Examples:
|email|Password|
|david@test1.com|Test@1234|


#-------------------------------------------------------------------------
Scenario Outline: Verify user unable to login with invalid details

Given user is on home page 
When Clicked on My account and login link 
Then user navigates to account login
When User enter email as "<email>" and password as "<Password>" and clicked on login 
Then not logged in as user details are not available 

Examples:
|email|Password|
|david@test1.com|Test@1239|

