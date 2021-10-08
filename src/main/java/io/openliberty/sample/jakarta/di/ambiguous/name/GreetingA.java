package io.openliberty.sample.jakarta.di.ambiguous.name;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("GreetingAName")
public class GreetingA implements GreetingItf{

	public String greet(String name) {
        return "GreetingA, " + name;
    }

}