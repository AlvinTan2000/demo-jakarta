package io.openliberty.sample.jakarta.di.ambiguous.alt;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingA implements GreetingItf{

	public String greet(String name) {
        return "GreetingA, " + name;
    }

}