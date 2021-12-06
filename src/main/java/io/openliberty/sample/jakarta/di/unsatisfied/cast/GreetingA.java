package io.openliberty.sample.jakarta.di.unsatisfied.cast;

import io.openliberty.sample.jakarta.di.unsatisfied.cast.GreetingItf;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Typed;

@ApplicationScoped
public class GreetingA extends Greeting implements GreetingItf{

	public String greet(String name) {
        return "GreetingA, " + name;
    }

	@Override
	public String stuff() {
		return "Stff";
	}

}