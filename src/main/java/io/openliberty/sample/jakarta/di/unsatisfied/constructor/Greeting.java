package io.openliberty.sample.jakarta.di.unsatisfied.constructor;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Greeting {
	
	// Remove this to get an unsatisfied error
	public Greeting() {}
		
	public Greeting (String name) {
		
	}
	
	public String greet(String name) {
        return "GreetingA, " + name;
    }

}