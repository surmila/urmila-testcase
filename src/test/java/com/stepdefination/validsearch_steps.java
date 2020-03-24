package com.stepdefination;

import com.pages.validsearch_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class validsearch_steps {
	validsearch_page jps=new validsearch_page();
	@Given("^:open the jpet website$")
	public void open_the_jpet_website() {
	   jps.url();
	}

	@When("^:enter the item name$")
	public void enter_the_item_name() {
	    jps.JpetSearch();
	}

	@Then("^:Click on search bar$")
	public void click_on_search_bar()  {
		jps.click();
		
	   
	}

	@Then("^:close the website$")
	public void close_the_website()  {
	   jps.close();
	}


}
