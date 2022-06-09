Feature: sort by price

  @sortBy
  Scenario: Option to sort by price is avaible
    Given I made a research of existing item
    When I click on sort by  and chose "sort by price(lowest to highest)
    Then I have the result for the search sorted by price(lowest to highest)