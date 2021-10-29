@Booking
Feature: Buy a ticket on Flight Booking Application and sign up
  Scenario: user is able to buy One Way Ticket
  Given user is on flight booking webpage and filled sign up form
  When user wants to buy a one way ticket and filled other details
  And user select departing flight and returning flight and its service class
  And user enter billing address
  Then user should get confirmation page and final price