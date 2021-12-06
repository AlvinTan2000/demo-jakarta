package io.openliberty.sample.jakarta.di.error.ext;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;
import jakarta.enterprise.inject.Specializes;

@ApplicationScoped
@Specializes
// Remove extend to get error
public class GreetingA extends GreetingItf{
	public String greet(String name) {
        return "GreetingA, " + name;
    }
}