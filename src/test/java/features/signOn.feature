Feature: navigate to signOn button & go to signOn page

@signOn
Scenario: Option to signOn when user is on the landing page
Given I am on the home page
When I click on the signOn button
And I enter an valid email data "saidoundjahid@gmail.com"
And click on create an account button
And user select Title and fill in registration data "djahid" and "saidoun" and "saidoundjahid@gmail.com" and "123456"
  #This one about date :> blocked
  #And select date of birth "01/10/1995"
And enter "djahid" and "saidoun" and "sogeti" and "18, BessenveldStraat" and "Diegem"
And select "alabama" in state
And enter "1830" in zipcode field
And select "United States" in country list
And enter "23254628" in phone field and "alias" in alias field
And click on "register button" at the end of the page
Then user is successfully registered and his data are validated