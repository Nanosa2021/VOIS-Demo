@ignore
Feature: API Testing Scenarios

Scenario: Create new user
  Given a rest api "APIURL"
  And a header
    | Content-Type  | application/json|
  When create new user "1" and "foo" and "bar"
  Then the response code is 201

  Scenario: Retrieve all users
    Given a rest api "APIURL"
    And a header
      | Content-Type  | application/json|
    When retrieving All Users GET /posts
    Then total number of users should be 100

  Scenario: Retrieve Specific User
    Given a rest api "APIURL"
    And a header
      | Content-Type  | application/json|
    When retrieving Specific User GET /posts/35
    Then user Title should be id nihil consequatur molestias animi provident
    And user Body should be nisi error delectus possimus ut eligendi vitae placeat eos harum cupiditate facilis reprehenderit voluptatem beatae modi ducimus quo illum voluptas eligendi et nobis quia fugit



