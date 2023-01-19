Feature: Search functionality
  As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.

  Background: I am on saucedemo page
    Given I am on saucedemo page

  Scenario: User navigates saucedemo page and complete the item purchas
    When I login with credential username "standard_user" and password "secret_sauce"
    And I click on Login button
    And I filter the products by Price "high to low"
    And I select cheapest & costliest products and add to basket
    And I open shopping cart
    And I go to checkout
    And I enter details firstname "Gary", lastName "Barlow" and zipPostalCode "AB12 2JU"
    And I click on continue button
    And I click on finish button
    Then I should be able to see message 'Thank you for your order'
