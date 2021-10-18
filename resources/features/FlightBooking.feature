Feature: Buy a ticket on Flight Booking Application and sign up
  @Booking
  Scenario: user is able to buy One Way Ticket
  Given user accessed the flight booking application
  When user sign up and click on flights link
  And user is able to buy a one way ticket and select other details
  And user select departing flight and returning flight and its service class
  And user enter billing address
  Then user should get confirmation page and final price
  Then close the browser