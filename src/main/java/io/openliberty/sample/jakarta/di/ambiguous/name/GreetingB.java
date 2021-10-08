package io.openliberty.sample.jakarta.di.ambiguous.name;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

// Change to @Named("GreetingAName") to create ambiguous name error
@Named("GreetingBName")
@ApplicationScoped
public class GreetingB implements GreetingItf{

    public String greet(String name) {
        return "GreetingB, " + name;
    }

}