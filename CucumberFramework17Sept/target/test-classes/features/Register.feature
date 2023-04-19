Feature: Register Functionality

#-----------------------------------------------------------------------
Scenario: Verify user is able to create account with valid details

Given user is on home page 
When user clicks on My account and register link 
Then user navigates to Register Account
When user enter firstname and lastname and email and telephone and password and and confirm password and check marked Privacy Policy and clicked on continue
|david|test2|david@test2.com|1234758965|Test@1234|Test@1234|
Then account created successfully and shows "Your Account Has Been Created!"

#----------------------------------------------------------------------
Scenario: Verify user unable to create account with invalid details - Tried with existing email

Given user is on home page 
When user clicks on My account and register link 
Then user navigates to Register Account
When user enter firstname and lastname and email and telephone and password and and confirm password and check marked Privacy Policy and clicked on continue
|david|test1|david@test1.com|1234758965|Test@1234|Test@1234|
Then account not created and showing user already have account