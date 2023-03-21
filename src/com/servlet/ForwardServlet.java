package com.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "forward",urlPatterns = "/forward")
public class ForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("/forward2");
        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/private.jsp");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/private.html");
        requestDispatcher.forward(req,resp);
    }
}
