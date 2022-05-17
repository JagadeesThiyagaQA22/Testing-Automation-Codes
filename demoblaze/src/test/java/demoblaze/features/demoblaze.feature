Feature: Online Shopping Functionality 

@smoke 
Scenario Outline: User Login The application 
	Given User Enter The Invalid "<username>" Username 
	When User Enter The Invalid "<password>" Password 
	Then User Validate the Inavlid Credentials 
	
	Examples: 
		| username | password | 
		| valid    | invalid  | 
		| invalid  | valid    | 
		| invalid  | invalid  | 
		
		@Regression 
		Scenario: User Login The Application 
			Given User Enter the Valid Username 
			When User Enter The Valid Password 
			Then User Validate The Credentials 
			
		@Regression 
		Scenario: HomePage User Views The Products What They Want 
			And User View The Mobile 
			And User View The Another Product 
			And User Scroll The Page Down 
			And User Click The Next Page 
			And User Click The Previous Page 
			And User Scroll The Page Up 
			
		@Regression 
		Scenario: User Buying The The New Product 
			And User Choose the Product 
			And User Click The Add Cart Button 
			And User Click The Cart Page 
			And User Click The Place Order Button 
			And User Enter The Order Details 
