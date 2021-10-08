package io.openliberty.sample.jakarta.di.unsatisfied.scope;

import jakarta.enterprise.context.ApplicationScoped;

// Change scope to get an error
@ApplicationScoped
public class Greeting {
	
	public String greet(String name) {
        return "GreetingA, " + name;
    }

}