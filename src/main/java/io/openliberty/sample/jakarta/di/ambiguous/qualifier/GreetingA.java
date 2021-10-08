package io.openliberty.sample.jakarta.di.ambiguous.qualifier;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@GreetingAQualifier
public class GreetingA implements GreetingItf{

	public String greet(String name) {
        return "GreetingA, " + name;
    }

}