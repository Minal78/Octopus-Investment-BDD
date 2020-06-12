Feature: Octopus Investments

  @Smoke
  Scenario Outline: Verify search tab is working as aspected
    Given user is on the main page
    When user click on the search bar
    And user enter "<text>" in search field
    Then user should able to see name "<text>" at result

    Examples:
      | text     |
      | career   |
      | contacts |

  @Sanity
  Scenario: Verify all the top bar options are clickalbe
    Given user is on main page
    When user click on what we offer
    And user click on About us
    And user click on Resources
    And user click on Webinar
    And user click on  contact
    Then user should able to get appropriate page


  @Sanity
  Scenario: Brochures page navigation
    Given user is on the main page
    When user click on the Brouchures option
    Then user should able to navigate to the Resources center


  @Manual
  Scenario: Register as Adviser
    Given user is on the main page
    When user click on login tab
    And user click on login to octopus portal
    And user click on register button
    And user tick on investor button
    And user enter port id
    And user enter lastname
    And user enter dateOfBirth
    And user click on create on account tab
    Then user should able to see popup message

  @Manual
  Scenario:Register as Investor
    Given user is on the main page
    When user click on login tab
    And user click on login to octopus portal
    And user click on register button
    And user tick on Investor button
    And user enter portfolio number
    And user enter the last name
    And user enter the date of the birth
    And user enter the month of the birth
    And user enter the year of the birth
    And user click on create on account tab
    Then user should successfully register as Inventor

  @Manual
  Scenario: Login as Advisor or Investor
    Given user is on main page
    When user click on login tab
    And user enter valid email address
    And user enter valid password
    And user click on next button
    Then user should successfully land on next page

    @Manual

    Scenario: Verify leadership team image and information are visible
      Given user is on main page
      When user click on find out more on Ruth Handcock
      Then user should navigate to About Ruth Handcock






