Feature: search for an item
@search
  Scenario: search for an existing item from the catalog
    Given I am on the landing page
    When I search for a "dress"
    Then the number of results is set as expected
