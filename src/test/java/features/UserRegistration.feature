Feature: User Registration
   I want to check that the user can register in parabank website.
   
	Scenario Outline: User Registration
	Given the user in the home page
	When I click on register link
	And I entered "<firstname>" , "<lastname>" , "<Address>" , "<City>" , "<State>" , "<Zip Code>" , "<Phone Number >" , "<SSN>"  , "<Username>" ,"<Password>"
	Then The registration page displayed successfully
 
 	Examples:
 	 |firstname | lastname | Address | City | State | Zip Code | Phone Number| SSN | Username | Password |
 	 |ismail | saleh | 4 st Maadi | Cairo | CA | 1234 | 1151279461 | 1234 | ismailSaleh | 123456 |
 	 
 	  