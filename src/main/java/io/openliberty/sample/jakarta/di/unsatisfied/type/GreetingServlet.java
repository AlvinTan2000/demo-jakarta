package io.openliberty.sample.jakarta.di.unsatisfied.type;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "diUnType", urlPatterns = { "/diUnType" })
public class GreetingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
        
    @Inject
    private GreetingItf greeting;


    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String greetingString = greeting.greet("Bob");
    	
        res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(greetingString);
	}
    
}
