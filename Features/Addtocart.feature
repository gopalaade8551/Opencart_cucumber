Feature: Add to Cart

@Sanity
Scenario: user should add the item into his cart

Given User should lauch the chrome Browser
When user enter the url as "https://tutorialsninja.com/demo//"
Then user should see the "Your Store" as title
When user click on "MyAccount" And click on Login
Then user should see the "Account Login" as Title
When user enters the valid email as "gopalade8551@gmail.com" And password as "abcABC" And click on Login
Then user should see the "My Account" 
When user enters the item name in  search textbox   and click on search button
Then user should see list of items
When user click on addtocart on any item 
Then user should see the " Success: You have added iMac to your shopping cart!" Message 
When user click on "Checkout" Then user should see his added items
Then close the browser
