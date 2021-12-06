package io.openliberty.sample.jakarta.di.unsatisfied.cast;

import io.openliberty.sample.jakarta.di.unsatisfied.type.GreetingItf;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Typed;


public class Greeting {

	public String greet(String name) {
        return "Greeting, " + name;
    }

}