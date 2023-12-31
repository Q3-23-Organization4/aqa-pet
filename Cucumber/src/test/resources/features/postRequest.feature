Feature: Create Pet and get info about pets on PetStore
  As a user of PetStore API
  I want to create a new pet

  Scenario: Create a new pet with valid data
    Given I have valid pet data
      | id | name  | status    |
      | 1  | Buddy | available |
      | 2  | Bob   | available |

    When I send a POST request to the "/pet" endpoint
    Then the response status code should be 200


  Scenario: Retrieve an existing pet by ID
    Given there is an existing pet with ID 123
    When I send a GET request to the "/pet/123" endpoint
    Then the response status code should be 200





