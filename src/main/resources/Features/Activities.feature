Feature:Activities

  Scenario Outline:test
    When user click on sign in button
    And User enter '<Email>' and click on Continue button
    And User enter'<Password>' and click on sign in button
    Then User Logged in
    When User open “All” menu from the left side
    And  User click on “video games” then choose “all video games”
    And User  add filter “free shipping”  click on from the filter menu on the left side & add the filter of condition “ new”
    And User  open the sort menu in the right side then sort by price: high to low
    And User add all products below that its cost below 15k EGP, if no product below 15k EGP move to next page
    And User make sure that all products is already added to carts
    When User add '<fullName>' '<mobile>' '<street>' '<buildNum>' and choose cash as a payment method


    Examples:Email,Password and address examples
      | Email                 | Password   | fullName   | mobile      | street    | buildNum |
      | QaEngneer02@gmail.com | WalQA_123@ | Walaa Omar | 01222222222 | streeeeet | 1234     |

