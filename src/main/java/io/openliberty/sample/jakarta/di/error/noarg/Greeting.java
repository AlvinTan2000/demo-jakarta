package io.openliberty.sample.jakarta.di.error.noarg;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;

@ApplicationScoped
public class Greeting{
	
	public Greeting() {
	}

	public Greeting(String name) {
		
	}
	
	public String greet(String name) {
        return "Greeting, " + name;
    }

}