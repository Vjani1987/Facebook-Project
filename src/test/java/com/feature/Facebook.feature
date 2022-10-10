Feature: Facebook Application
Scenario: Login Functionality
Given user Launch The Url 
When user Print The Text In The Login Page
When user Enter The Username 
And user enter The Incorrect Password
And user Click The Login Button 
And user Take Screenshot of The Current WebPage
And user navigate To The Login Page

Scenario: SignUp Functionality
Given user Launch The Url
When user Click The Create New account Button And It Navigates To The Next Page
And user Enter The FirstName In The FirstName Field
And user Enter The SurName In The SurName Field
And user Enter The Mobile Number In The MobileNumberField
And user Enter the NewPassword In The Password Field
And user Select Day From DropDown
And user Select Month From dropDown
And user Select Year From DropDown
And user Choose Gender From Options
And user signUp And It Navigates To Another Page
And user Takes ScreenShot Of The Current WebPage
Then user Navigate To The Login Page
