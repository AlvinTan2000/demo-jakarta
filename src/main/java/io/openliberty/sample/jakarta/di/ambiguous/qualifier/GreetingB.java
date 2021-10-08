package io.openliberty.sample.jakarta.di.ambiguous.qualifier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

// Change to @GreetingAQualifier to create ambiguous error
@GreetingBQualifier
@ApplicationScoped
public class GreetingB implements GreetingItf{

    public String greet(String name) {
        return "GreetingB, " + name;
    }

}