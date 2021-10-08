package io.openliberty.sample.jakarta.di.ambiguous.qualifier;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "diAmbQual", urlPatterns = { "/diAmbQual" })
public class GreetingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
        
    // Remove @Qualifier to get unsatisfied errors 
    @GreetingAQualifier
    @Inject 
    private GreetingItf greeting;


    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String greetingString = greeting.greet("Bob");
        
        res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(greetingString);
	}
    
}
