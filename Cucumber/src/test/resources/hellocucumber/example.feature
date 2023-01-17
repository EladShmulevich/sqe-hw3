Feature: A set of scenarios for testing the "example" module

#  Scenario: Testing how a case where a user adds a product to the cart
#    Given The user on the pres page
#    And The user enters Email as "idolou1@gmail.com" and Password as "12345678"
#    And the user click sign in
#    And the user click myshop

  Scenario: Successful admin login
    Given The admin on the pres page
    When The admin enters Email as "eladshmu@post.bgu.ac.il" and Password as "12345678"
    And  click log in
    ######
    And admin navigate to catalog
    And  click log in
    And admin changes quantity as "1"



#    Then admin on home page
#    And the user click sign in
#    And the user click myshop

#  Scenario: Admin change white shirt quentity to 1
#    Given admin on home page
#    And admin navigate to catalog
#    And  click log in
#    And admin changes quantity as "1"




