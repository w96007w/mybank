package com.example.demo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

public class TestStep {
	@Given("I am on $host")
    public void getHostPage(String host){
        System.out.println("----------------------"+host);
    }
 
    @Then("print $hello")
    public void hello(String hello){
        System.out.println("----------------------"+hello);
    }
}
