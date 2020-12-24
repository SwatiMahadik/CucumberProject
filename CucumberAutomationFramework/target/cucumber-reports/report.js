$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Flipkart login feature",
  "description": "",
  "id": "flipkart-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6677068700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Login functionality",
  "description": "",
  "id": "flipkart-login-feature;verify-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is already on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"9284457197\" and \"Swati@120\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify title as \"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books \u0026 More. Best Offers!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify logo",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Then logout from browser"
    }
  ],
  "line": 10,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Loginstepdefinition.user_is_already_on_Login_page()"
});
formatter.result({
  "duration": 272010700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9284457197",
      "offset": 13
    },
    {
      "val": "Swati@120",
      "offset": 30
    }
  ],
  "location": "Loginstepdefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 116833200,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 45990500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books \u0026 More. Best Offers!",
      "offset": 17
    }
  ],
  "location": "Loginstepdefinition.verify_title_as(String)"
});
formatter.result({
  "duration": 5434100,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.verify_logo()"
});
formatter.result({
  "duration": 36808100,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 850878200,
  "status": "passed"
});
});