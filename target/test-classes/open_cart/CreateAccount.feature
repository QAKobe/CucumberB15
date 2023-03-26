@smoke
Feature: Checkout account creation functionality
  Scenario: User should be able to create an account
    When User navigates to webpage user should be able to see the webpage logo "Your Store"
    Then User clicks on my account and clicks on register
    And User creates an account by providing "test" as a firstName
    Then User provides "Smith" as a lastName
    When User provides "yuyuy@hotmail.com" as an email
    Then user provides "3123332211" as a telephone number
    And User provides password and confirms the password
    Then User choose to check no on Subscribe radio button
    And User check agree radio button and clicks Continue button
    Then User validates that account is created successfully message "Your Account Has Been Created!"