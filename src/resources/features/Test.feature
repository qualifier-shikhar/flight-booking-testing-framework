Feature: Buy a ticket on Flight Booking Application and sign up
  @BookingTest
  Scenario: user is able to buy One Way Ticket Test
  Given user is on flight booking webpage and filled sign up form Test
  When user wants to buy a one way ticket and filled other details Test
  And user select departing flight and returning flight and its service class Test
  And user enter billing address Test
  Then user should get confirmation page and final price Test