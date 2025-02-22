Feature: Verify item can be added to Cart

  Scenario: Verify item can be added to Cart
    Given Open browser
    And Navigate to ebay.com
    When Search for 'book'
    And Click on the first book in the list
    And Click on 'Add to cart'
    Then Verify the cart has been updated and displays the number of items in the cart
