@JPET_feature
@tc01_Login
Feature: jpet website

@tc01_search
Scenario: seraching for product
Given :open the jpet website
When :enter the item name
Then :Click on search bar
And :close the website

@tc02_invalidsearch
Scenario: Seraching for product
Given :Open the jpet website
When :Enter the item name
Then :click on search bar
And :Close the website

 @tc03_searchbyhint
Scenario: Seraching for product
Given :Open the Jpet website
When :Enter the Item name with hint
Then :click on Search bar
And :Close the Website

@tc04_searchbyproductid
Scenario: Seraching for the Product
Given :Open the JPET Website
When :click on product
Then :click on Searchbar
And :Close The jpetWebsite


@tc05_printtable
Scenario: Prints the details in a table
 
 Given the details of an animal in the homepage
 When the details are matched
 Then the selected animals details are printed
 And details are printed in a table




