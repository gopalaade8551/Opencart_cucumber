Feature: Login
Background: Steps common for all the scenarios
Given User should lauch the chrome Browser
When user enter the url as "https://tutorialsninja.com/demo/"
Then user should see the "Your Store" as title
When user click on "MyAccount" And click on Login
Then user should see the "Account Login" as Title

@Sanity @Regression
Scenario:succesful login with valid credentials

When user enters the valid email as "gopalade8551@gmail.com" And password as "abcABC" And click on Login
Then user should see the "My Account"
Then Close the browser

@Regression
Scenario Outline: Successful login with valid credentials with DDT
When user enters the valid email as "<email>" And password as "<passwd>" And click on Login
Then user should see the "My Account"

Then Close the browser

Examples:
|email|passwd|
|gopalade8551@gmail.com|abcABC|
|pavanonlinetraining@gmail.com|test@123|
|gopalade8551@gmail.com|abcABC|


#tags="@sanity" //will run scenarios which is tagged with sanity and does not matter if it has other tags as well
#tags="@sanity or @Regression //will run those scenarios which are tagged with sanity or regression
#tags="@sanity and @Regression //will run those scenarioes which are tagged with both sanity and regression
#tags="@sanity and not @regression //will run those scenarios which is tagged with sanity not regression







