Feature: Verify adactin details

  Scenario Outline: Verifying adactin login with invalid credentials
    Given User is on the adactin page
    When User should login "<username>","<password>"
    And User should enter Search Hotel "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
    And User should enter Select Hotel click radiobutton,Continue button
    And User should enter Book A Hotel "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Select Month>","<Select Year>","<CVV Number>"
    And User should click Book Now
		Then user should cancel booking

    Examples: 
    |username   |password  |Location |Hotels        |Room Type			|Number of Rooms|Check In Date|Check Out Date|Adults per Room|Children per Room|First Name|Last Name|Billing Address|Credit Card No  |Credit Card Type|Select Month|Select Year|CVV Number|
    |dineshmrd33|8825621661|New York |Hotel Sunshine|Deluxe   			|1 - One        |28/12/2021   |29/12/2021    |1 - One        |1 - One          |Dinesh    |cv       |Vellore        |2344567665587776|VISA            |June        |2022       |124       |
    