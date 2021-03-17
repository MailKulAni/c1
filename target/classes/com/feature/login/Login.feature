
Feature: Logging into rediff money

  Scenario: Login to rediff money
  
    Given user launch Firefox browser
      And user enters the loginPageUrl in the address bar
      And user enters abc@gmail.com in the username field
      And enters the pwd as password123 in the password field
     When user clicks on the login button
     Then user should remain on loginPage