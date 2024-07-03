@Login


  Feature: Login


    Scenario Outline: Check succesful login with "<username>" and "<password>>
      Given User is in "" page
      When User fills username input field with ""
      And User fills password input field with ""
      And Click to login button
      Then User should be navigated to homepage
      Examples:
        | username        | password    |
        | Səbiş@gmail.com | salam Səbiş |



