package io.openliberty.sample.jakarta.di.unsatisfied.empty;

import jakarta.enterprise.context.ApplicationScoped;

// Remove this class to get an unsatisfied error

@ApplicationScoped
public class Greeting implements GreetingItf{
	
	// Remove this to get an unsatisfied error
	public Greeting() {}
		
	public String greet(String name) {
        return "GreetingA, " + name;
    }

}