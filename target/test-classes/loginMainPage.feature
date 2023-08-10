Feature: User on website swaglab

  Scenario Outline: login main page
    When User go to web Swaglab
    And User enter <username> username and <password> password
    Then User click button login

	Examples:
	| username | password |
	| "standard_esur" | "secret_sauce" |
	| "standard_user" | "sauce_secret" |
	| "standard_user" | "secret_sauce" |
