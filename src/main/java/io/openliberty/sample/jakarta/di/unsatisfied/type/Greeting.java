package io.openliberty.sample.jakarta.di.unsatisfied.type;

import io.openliberty.sample.jakarta.di.unsatisfied.type.GreetingItf;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Typed;

// Change to Greeting.class to get unsatisfied error
@Typed(GreetingItf.class)
@ApplicationScoped
public class Greeting implements GreetingItf{

	public String greet(String name) {
        return "GreetingA, " + name;
    }

}