package io.openliberty.sample.jakarta.di.error.ext;

import jakarta.enterprise.context.ApplicationScoped;

// Remove annotation to get error
@ApplicationScoped
public class GreetingItf {

	public String greet(String name) {
        return "Greeting, " + name;
    }	
}
