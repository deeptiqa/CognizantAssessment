Feature: Validate New Egg Application

  Scenario:  Validdate Add Items to Cart
    Given user logged into application
    Then Enter "Micro SD Card" in Search text field
    And Enter "San Disk 256GB Ultra" in Search text field
    And user add item to the cart
    And Enter "PS4 games" in Search text field
    And Enter "Uncharted: The Lost Legacy" in Search text field
    And user add item to the cart
    And Enter "Smart Thermostats" in Search text field
    And Enter "INSTEON Thermostat (2441TH)" in Search text field    
    And user add item to the cart
    And Remove Item From Cart and Verify amount calculated
    And user clicks secure checkout
    And user logged out from application
    