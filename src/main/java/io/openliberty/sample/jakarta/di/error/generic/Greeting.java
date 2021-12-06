package io.openliberty.sample.jakarta.di.error.generic;

import jakarta.inject.Inject;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.event.ObservesAsync;

@Dependent
public class Greeting<T> {

	
	public String greeting(String name) {
        return "Greeting, " + name;
	}
		
}
