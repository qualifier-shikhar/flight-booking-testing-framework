Feature: Flight Selection Feature

    Scenario: user filled flight selection details in flight selection page
    Given   user is on the registration webpage
    When    user filled up registration details and hit submit
    Then    user gets registration confirmation page
    Then    user gets flights link to get to flight details page
    Then    user is on the flight details webpage
    When    user filled up flight details
    Then    user clicks continue button
    Then    user selects departure and return flight
    Then    user select continue button
