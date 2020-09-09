Feature: See more references.

Scenario:I as a customer WTBAT see more references than presented on the main page
  Given I access  https://www.hys-enterprise.com/
  And I Scroll down to see ‘See more references’ button.
  When I click on ‘See more references’ button.
  Then  references page is opened (https://www.hys-enterprise.com/references/)

