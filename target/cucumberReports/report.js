$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountCreation.feature");
formatter.feature({
  "line": 1,
  "name": "CreateAccount",
  "description": "",
  "id": "createaccount",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "The user is able to create an account then login successfully",
  "description": "",
  "id": "createaccount;the-user-is-able-to-create-an-account-then-login-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "The user has launched the automation Practise application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user click on Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user create an account with the email \u003cEmail Address\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the email is verified successfully",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user clicks on create an account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user enters the title \u003cTitle\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user enters first name \u003cFirst Name\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user enters last name \u003cLast Name\u003e",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# email is already retrieved from the previous screen"
    }
  ],
  "line": 13,
  "name": "the user enters password \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user enters date of birth as \u003cDay\u003e and \u003cMonth\u003e and \u003cYear\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user enters the address details as \u003cCompany\u003e and \u003cFinal Address\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the user enters city \u003cCity\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user enters state \u003cState\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "the user enters postal code \u003cPostal Code\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the user enters country \u003cCountry\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "the user enters mobile phone \u003cMobile Phone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the user assigns an address alias for future reference \u003cAddress Alias\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the user clicks on Register",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Account is Created Successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "createaccount;the-user-is-able-to-create-an-account-then-login-successfully;",
  "rows": [
    {
      "cells": [
        "Email Address",
        "Title",
        "First Name",
        "Last Name",
        "Password",
        "Day",
        "Month",
        "Year",
        "Company",
        "Final Address",
        "City",
        "State",
        "Postal Code",
        "Country",
        "Mobile Phone",
        "Address Alias"
      ],
      "line": 25,
      "id": "createaccount;the-user-is-able-to-create-an-account-then-login-successfully;;1"
    },
    {
      "cells": [
        "nancy.omed@yahoo.com",
        "MR",
        "Nancy",
        "Hanna",
        "12345",
        "12",
        "11",
        "1995",
        "Comp1",
        "Fin Address",
        "Cairo",
        "New York",
        "12345",
        "United States",
        "0123233",
        "Add Elias"
      ],
      "line": 26,
      "id": "createaccount;the-user-is-able-to-create-an-account-then-login-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "The user is able to create an account then login successfully",
  "description": "",
  "id": "createaccount;the-user-is-able-to-create-an-account-then-login-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "The user has launched the automation Practise application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user click on Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user create an account with the email nancy.omed@yahoo.com",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the email is verified successfully",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user clicks on create an account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user enters the title MR",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user enters first name Nancy",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user enters last name Hanna",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# email is already retrieved from the previous screen"
    }
  ],
  "line": 13,
  "name": "the user enters password 12345",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user enters date of birth as 12 and 11 and 1995",
  "matchedColumns": [
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user enters the address details as Comp1 and Fin Address",
  "matchedColumns": [
    8,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the user enters city Cairo",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user enters state New York",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "the user enters postal code 12345",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the user enters country United States",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "the user enters mobile phone 0123233",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the user assigns an address alias for future reference Add Elias",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the user clicks on Register",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Account is Created Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "PageNavigationPageSteps.theUserHasLaunchedTheAutomationPractiseApplication()"
});
formatter.result({
  "duration": 15654463243,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.theUserClicksOnSignIn()"
});
formatter.result({
  "duration": 6504277531,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nancy.omed@yahoo.com",
      "offset": 42
    }
  ],
  "location": "SignInPageSteps.theUserCreatesAnAccountWithTheEmail(String)"
});
formatter.result({
  "duration": 764046319,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageSteps.theEmailIsVerifiedSuccessfully()"
});
formatter.result({
  "duration": 224617986,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageSteps.theUserClicksOnCreateAnAccount()"
});
formatter.result({
  "duration": 234475592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MR",
      "offset": 26
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersTheTitle(String)"
});
formatter.result({
  "duration": 2080336655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nancy",
      "offset": 27
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersFirstName(String)"
});
formatter.result({
  "duration": 972653058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hanna",
      "offset": 26
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersLastName(String)"
});
formatter.result({
  "duration": 306529623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 25
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersPassword(String)"
});
formatter.result({
  "duration": 372773509,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 33
    },
    {
      "val": "11",
      "offset": 40
    },
    {
      "val": "1995",
      "offset": 47
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersPassword(String,String,String)"
});
formatter.result({
  "duration": 654362930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comp1",
      "offset": 39
    },
    {
      "val": "Fin Address",
      "offset": 49
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersPassword(String,String)"
});
formatter.result({
  "duration": 523884071,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cairo",
      "offset": 21
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersCity(String)"
});
formatter.result({
  "duration": 180914022,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 22
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersState(String)"
});
formatter.result({
  "duration": 189912132,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 28
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersPostalCode(String)"
});
formatter.result({
  "duration": 225103210,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United States",
      "offset": 24
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersCountry(String)"
});
formatter.result({
  "duration": 129250411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0123233",
      "offset": 29
    }
  ],
  "location": "CreateAccountPageSteps.theUserEntersHomePhone(String)"
});
formatter.result({
  "duration": 182403511,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add Elias",
      "offset": 55
    }
  ],
  "location": "CreateAccountPageSteps.theUserAssignAddressAlias(String)"
});
formatter.result({
  "duration": 641509248,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.theUserClicksOnRegister()"
});
formatter.result({
  "duration": 5064291210,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.AccountIsCreatedSuccessfully()"
});
formatter.result({
  "duration": 266349136,
  "status": "passed"
});
formatter.uri("CartCheckOut.feature");
formatter.feature({
  "line": 1,
  "name": "CartCheckOut",
  "description": "",
  "id": "cartcheckout",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Cart Checkout scenario",
  "description": "",
  "id": "cartcheckout;cart-checkout-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "The user has launched the automation Practise application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user click on Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user enters the configured Email Address \u003cEmail Address\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user enters the configured password \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user clicks on signIn",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user logged in successfully",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user selects \u003cSub Category\u003e Subcategory in \u003cCategory\u003e Category",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user selects the \u003cProduct\u003e product",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the user selects \u003cColor\u003e color and \u003cSize\u003e size",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the user click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user proceed to \u003cCheckOutPag1\u003e checkout",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user proceed to \u003cCheckOutPag2\u003e checkout",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the user proceed to \u003cCheckOutPag3\u003e checkout",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user agree to the terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "the user proceed to \u003cCheckOutPag4\u003e checkout",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the user selects payment option \u003cPaymentOption\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "the user confirms the order",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "order should be confirmed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "order is placed on order history page \u003cProduct\u003e and \u003cColor\u003e and \u003cSize\u003e and \u003cQuantity\u003e and \u003ctotal price\u003e are displayed correctly",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "cartcheckout;cart-checkout-scenario;",
  "rows": [
    {
      "cells": [
        "Email Address",
        "Sub Category",
        "Category",
        "Product",
        "Password",
        "Color",
        "Size",
        "CheckOutPag1",
        "CheckOutPag2",
        "CheckOutPag3",
        "CheckOutPag4",
        "PaymentOption",
        "Quantity",
        "total price"
      ],
      "line": 24,
      "id": "cartcheckout;cart-checkout-scenario;;1"
    },
    {
      "cells": [
        "nancy.omed@yahoo.com",
        "Blouses",
        "Women",
        "Blouse",
        "12345",
        "White",
        "M",
        "first",
        "second",
        "third",
        "forth",
        "bankwire",
        "quantity",
        "total price"
      ],
      "line": 25,
      "id": "cartcheckout;cart-checkout-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "Cart Checkout scenario",
  "description": "",
  "id": "cartcheckout;cart-checkout-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "The user has launched the automation Practise application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user click on Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user enters the configured Email Address nancy.omed@yahoo.com",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user enters the configured password 12345",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user clicks on signIn",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user logged in successfully",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user selects Blouses Subcategory in Women Category",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user selects the Blouse product",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the user selects White color and M size",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the user click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user proceed to first checkout",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user proceed to second checkout",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the user proceed to third checkout",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user agree to the terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "the user proceed to forth checkout",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the user selects payment option bankwire",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "the user confirms the order",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "order should be confirmed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "order is placed on order history page Blouse and White and M and quantity and total price are displayed correctly",
  "matchedColumns": [
    3,
    5,
    6,
    12,
    13
  ],
  "keyword": "And "
});
formatter.match({
  "location": "PageNavigationPageSteps.theUserHasLaunchedTheAutomationPractiseApplication()"
});
formatter.result({
  "duration": 11519352529,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.theUserClicksOnSignIn()"
});
formatter.result({
  "duration": 6079206999,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nancy.omed@yahoo.com",
      "offset": 45
    }
  ],
  "location": "SignInPageSteps.theUserEntersTheConfiguredEmailAddress(String)"
});
formatter.result({
  "duration": 664867627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 40
    }
  ],
  "location": "SignInPageSteps.theUserEntersTheConfiguredPassword(String)"
});
formatter.result({
  "duration": 291154449,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageSteps.theUserClicksOnSignIn()"
});
formatter.result({
  "duration": 5665767020,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageSteps.theUserLoggedInSuccessfully()"
});
formatter.result({
  "duration": 123184922,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouses",
      "offset": 17
    },
    {
      "val": "Women",
      "offset": 40
    }
  ],
  "location": "MainMenuPageSteps.selectSubCategory(String,String)"
});
formatter.result({
  "duration": 3658519820,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 21
    }
  ],
  "location": "ProductPageSteps.theUserSelectsProduct(String)"
});
formatter.result({
  "duration": 541208500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "White",
      "offset": 17
    },
    {
      "val": "M",
      "offset": 33
    }
  ],
  "location": "CartPageSteps.theUserSelectsColorAndSize(String,String)"
});
formatter.result({
  "duration": 4649434317,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.addToCart()"
});
formatter.result({
  "duration": 443767800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "first",
      "offset": 20
    }
  ],
  "location": "PageNavigationPageSteps.theUserProceedToFirstCheckOut(String)"
});
formatter.result({
  "duration": 5670568342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "second",
      "offset": 20
    }
  ],
  "location": "PageNavigationPageSteps.theUserProceedToFirstCheckOut(String)"
});
formatter.result({
  "duration": 3192717463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "third",
      "offset": 20
    }
  ],
  "location": "PageNavigationPageSteps.theUserProceedToFirstCheckOut(String)"
});
formatter.result({
  "duration": 2502700649,
  "status": "passed"
});
formatter.match({
  "location": "PageNavigationPageSteps.agreeTotheTermsAndConditions()"
});
formatter.result({
  "duration": 233533262,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "forth",
      "offset": 20
    }
  ],
  "location": "PageNavigationPageSteps.theUserProceedToFirstCheckOut(String)"
});
formatter.result({
  "duration": 3960077515,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bankwire",
      "offset": 32
    }
  ],
  "location": "PaymentPageSteps.selectsPaymentOption(String)"
});
formatter.result({
  "duration": 3705419346,
  "status": "passed"
});
formatter.match({
  "location": "PageNavigationPageSteps.theUserConfirmsTheOrder()"
});
formatter.result({
  "duration": 6946818022,
  "status": "passed"
});
formatter.match({
  "location": "PageNavigationPageSteps.orderConfirmation()"
});
formatter.result({
  "duration": 95177970,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 38
    },
    {
      "val": "White",
      "offset": 49
    },
    {
      "val": "M",
      "offset": 59
    },
    {
      "val": "quantity",
      "offset": 65
    },
    {
      "val": "total price",
      "offset": 78
    }
  ],
  "location": "OrderHistoryPageSteps.orderIsPlacedOnOrderHistoryPage(String,String,String,String,String)"
});
formatter.result({
  "duration": 6768207768,
  "status": "passed"
});
});