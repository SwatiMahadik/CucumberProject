Feature: Flipkart login feature
  @smoke
  Scenario:Verify Login functionality
    Given User is already on Login page
    When User enters "9999999999" and "password"
    Then User clicks on Login button
    Then  Verify title as "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
    And verify logo
    #Then logout from browser
    And Close the browser

   @Regression
   Scenario Outline: Data driven testing
     Given User is already on Login page
     When User enters "<username>" and "<password>"
     Then User clicks on Login button
     Then  Verify title as "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
    #Then logout from browser
     And verify logo
     And Close the browser
    Examples:
    |username|password|
    |9285547197   | Swati@120   |
    |9527272171  |    Swati     |
