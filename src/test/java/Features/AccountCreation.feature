Feature: CreateAccount

    Scenario Outline: The user is able to create an account then login successfully
      Given The user has launched the automation Practise application
      When the user click on Sign in
      And the user create an account with the email <Email Address>
      And the email is verified successfully
      And the user clicks on create an account
      And the user enters the title <Title>
      And the user enters first name <First Name>
      And the user enters last name <Last Name>
     # email is already retrieved from the previous screen
      And the user enters password <Password>
      And the user enters date of birth as <Day> and <Month> and <Year>
      And the user enters the address details as <Company> and <Final Address>
      And the user enters city <City>
      And the user enters state <State>
      And the user enters postal code <Postal Code>
      And the user enters country <Country>
      And the user enters mobile phone <Mobile Phone>
      And the user assigns an address alias for future reference <Address Alias>
      And the user clicks on Register
      Then Account is Created Successfully
      Examples:
      | Email Address       | Title   | First Name | Last Name |  Password | Day | Month | Year | Company | Final Address | City    | State    | Postal Code| Country         |Mobile Phone | Address Alias |
      |nancy.omed@yahoo.com| MR      | Nancy      | Hanna      |  12345   |  12 | 11    |1995  | Comp1   | Fin Address   | Cairo   | New York | 12345      | United States   | 0123233   |  Add Elias    |


