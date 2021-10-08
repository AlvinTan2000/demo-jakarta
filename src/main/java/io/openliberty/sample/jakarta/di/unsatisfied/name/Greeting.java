package io.openliberty.sample.jakarta.di.unsatisfied.name;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Greeting {

	public String greet(String name) {
        return "GreetingA, " + name;
    }

}