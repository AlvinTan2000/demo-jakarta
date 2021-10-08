package io.openliberty.sample.jakarta.di.ambiguous.prio;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;

// Add @Priority(1) to get ambiguous error
@Alternative
@ApplicationScoped
public class GreetingB implements GreetingItf{

    public String greet(String name) {
        return "GreetingB, " + name;
    }

}