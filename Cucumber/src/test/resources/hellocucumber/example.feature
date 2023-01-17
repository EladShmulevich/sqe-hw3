Feature:  user add a product to cart twice, admin changes quantity to one

  Scenario: Successful user adds white shirt size S quantity =2 to the cart
    Given The user on the pres page
    And The user enters Email as "idolou1@gmail.com" and Password as "12345678"
    And the user click sign in
    And the user click myStore
    And the user click on the white shirt
    And the user click increase quantity by one
    And the user click add to cart
    Then a message showing product successfully added to cart appeared


  Scenario: Successful admin change quantity for white S size shirt to 1
    Given The admin on the presta page
    When The admin enters Email as "eladshmu@post.bgu.ac.il" and Password as "12345678"
    And admin click log in
    And admin navigate to catalog
    And admin click on products
    And admin click on white colored shirt quantity field
    And admin clean quantity field of shirt size-S
    And admin changes quantity as "1"
    And admin save the new state
    Then Settings update message appear




