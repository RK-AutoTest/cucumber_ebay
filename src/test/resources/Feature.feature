Feature: eBay Search Box and Search Button
  Scenario: Testing functionality of eBay "Search box" and "Search" button
    Given User is on the eBay homepage
    When User clicks on the input field and enters data "<Data>"
    Then User clicks on the search button

    Examples:
      | Data   |
      | Laptop |
  Scenario: Scrolling down to click onbeauty product
  Given user scroll down to page.
  When element gets visible user clicks on the element beauty.