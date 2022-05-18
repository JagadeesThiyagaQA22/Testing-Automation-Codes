# Project Mainly Integrated with Maven For the pom.xml file,
  Here Added the Dependency like info.cukes Java,Junit,Core Directly Configured to Classes.
  
# Maintained Three Files are Feature file, Stepdefinition, Runner Class.   
Inside the Feature File, the Test Script writen in Plain Gherkin English,
Where Using KeyWords Likes Scenario,Background,Scenario Outline
Scenario- Written Overall Functionality Of Perticular Module
   Given - Described the User Access for Perticular Function,
   When  - Described the User Done Actions,
   And   - Described the User Done Additional Actions
   Then  - User Validation, 
   But   - User Try to Push Negative Activities.
      
Scenario Outline- Written Overall Functionality Of Perticular Module 
( Same Like Scenario but, Using Only for Validation Testing Purpose Of Login Credentials )
   Given - Described the User Access for Perticular Function,"<username>"
   When  - Described the User Done Actions,"<password>"
   And   - Described the User Done Additional Actions
   Then  - User Validation, 
   But   - User Try to Push Negative Activities.     
  | username | password |
  | Valid    | Invalid  |
  | Invalid  | Valid    |
  | invalid  | invalid  |
  | valid    | valid    |
  

