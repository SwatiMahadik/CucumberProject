Feature: Flipkart search product feature

  Background: Common features
    Given User is already on Login page
    When User enters "9284457197" and "Swati@120"
    Then User clicks on Login button

   @sanity
  Scenario:Verify Search product functionality
    When user search for product "camera"
    #Then logout from browser
    And Close the browser
  @sanity
  Scenario:Verify cart functionality

    When clicks on cart
    #Then logout from browser
    And Close the browser