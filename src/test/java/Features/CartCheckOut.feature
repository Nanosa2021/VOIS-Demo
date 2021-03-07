Feature: CartCheckOut

    Scenario Outline: Cart Checkout scenario
      Given The user has launched the automation Practise application
      When the user click on Sign in
      And the user enters the configured Email Address <Email Address>
      And the user enters the configured password <Password>
      And the user clicks on signIn
      And the user logged in successfully
      And the user selects <Sub Category> Subcategory in <Category> Category
      And the user selects the <Product> product
      And the user selects <Color> color and <Size> size
      And the user click on add to cart
      And the user proceed to <CheckOutPag1> checkout
      And the user proceed to <CheckOutPag2> checkout
      And the user proceed to <CheckOutPag3> checkout
      And the user agree to the terms and conditions
      And the user proceed to <CheckOutPag4> checkout
      And the user selects payment option <PaymentOption>
      And the user confirms the order
      Then order should be confirmed
      And order is placed on order history page <Product> and <Color> and <Size> and <Quantity> and <total price> are displayed correctly
      Examples:
      | Email Address       | Sub Category   | Category   | Product |  Password | Color    | Size  | CheckOutPag1 | CheckOutPag2 | CheckOutPag3 | CheckOutPag4    | PaymentOption    | Quantity     | total price  |
      |nancy.omed@yahoo.com| Blouses       | Women      | Blouse  |  12345    |  White   | M    |first         | second       | third        | forth           | bankwire          | quantity     | total price  |


