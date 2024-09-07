Feature: Wish List

@Sanity
Scenario: Validate adding a product to Wish List page from the Product that is displayed in the Related Products section of Product Display page

Given User should lauch the chrome Browser
When user enter the url as "https://tutorialsninja.com/demo//"
Then user should see the "Your Store" as title
When user click on "MyAccount" And click on Login
Then user should see the "Account Login" as Title
When user enters the valid email as "gopalade8551@gmail.com" And password as "abcABC" And click on Login
Then user should see the "My Account" 
When user enters the item name in  search textbox   and click on search button
Then user should see list of items
When user click on "Add to Wish List" option on any product
Then user should see the "Success: You have added Product Name to your wish list! "  Message
When user click on "Wish list" Link in the message
Then user should see the product in the "My Wish list page"
And Close the browser