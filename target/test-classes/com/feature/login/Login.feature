
Feature: Logging into rediff money

  Scenario: Login to rediff money
  
    Given user launch Chrome browser
      And user enters the loginPageUrl in the address bar
      And user enters abc@gmail.com in the username field
      And user enters password123 in the password field
     When user clicks on the login button
     Then user should remain on loginPage