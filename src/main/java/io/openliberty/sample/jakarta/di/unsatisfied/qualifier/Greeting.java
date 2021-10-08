package io.openliberty.sample.jakarta.di.unsatisfied.qualifier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

// Remove the qualifier to cause unsatisfied dependency errors
@GreetingQual
@ApplicationScoped
public class Greeting {

	public String greet(String name) {
        return "GreetingA, " + name;
    }

}