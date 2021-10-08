package io.openliberty.sample.jakarta.di.ambiguous.prio;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;

@ApplicationScoped
@Alternative
@Priority(1)
public class GreetingA implements GreetingItf{

	public String greet(String name) {
        return "GreetingA, " + name;
    }

}