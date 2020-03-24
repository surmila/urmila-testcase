package com.stepdefination;


	import com.pages.invalidsearch_page;

import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class invalidsearch_steps {
	invalidsearch_page jpin=new invalidsearch_page();


	@Given("^:Open the jpet website$")
	public void open_the_jpet_website() {
		jpin.url();
		
	    
	}

	@When("^:Enter the item name$")
	public void enter_the_item_name()  {
		jpin.JpetSearch();
	    
	}

	@Then("^:click on search bar$")
	public void click_on_search_bar() {
		jpin.click();
		
	    
	}

	@Then("^:Close the website$")
	public void close_the_website() {
		System.out.println("There is no such item");
		jpin.close();
		
	   
	}





	}


