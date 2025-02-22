package io.openliberty.sample.jakarta.di.unsatisfied.empty;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import jakarta.enterprise.inject.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@WebServlet(name = "diUnEmp", urlPatterns = { "/diUnEmp" })
public class GreetingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
        
    @Inject 
    private GreetingItf greeting;

    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// use @Inject greeting
        String greetingString = greeting.greet("Bob");
        
        res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(greetingString);
	}
    
}
