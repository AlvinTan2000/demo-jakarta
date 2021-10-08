package io.openliberty.sample.jakarta.di.ambiguous.alt;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;

// Remove to get ambiguous error
@Alternative
@ApplicationScoped
public class GreetingB implements GreetingItf{

    public String greet(String name) {
        return "GreetingB, " + name;
    }

}