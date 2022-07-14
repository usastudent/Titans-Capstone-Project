Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter userName 'tekk@gmail.com' and password '56789'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @Register
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website      | taxID  | paymentMethod | payeeName |
      | TEK     | tekschool.us | 123456 | Cheque        | TEK User  |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @EditPayment
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate information link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName        | abaNumber | swiftCode | accountName | accountNumber |
      | Bank of America |      1234 |      0567 | KH.Student  |       1000000 |
    And User click on Continue button
    Then User should see a success message

  @EditAccount
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email        | telephone  |
      | Ali       | Haidari  | tekk@gmail.com | 9161234567 |
    And User click on continue button
    Then User should see a message 'Success: Your account has been successfully updated.'
