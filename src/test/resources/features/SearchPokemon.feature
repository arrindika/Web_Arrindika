Feature: Search Pokemon

  Scenario: Search article about pikachu
    Given User open Pokemon home page
    When User input search "Pikachu (Pokémon)" on home page
    And User click button search on home page
    Then User see article with title "Pikachu (Pokémon)" on article page
    Then User see article with number "#025" on article page

