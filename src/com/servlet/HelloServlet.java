package com.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "hello",urlPatterns = "/hello",
        initParams = {
                @WebInitParam(name = "brand",value = "kkk"),
                @WebInitParam(name = "screen",value = "ddd"),
        },
        loadOnStartup = 1
)
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        Object filedir = context.getInitParameter("filedir");
        System.out.println(filedir);

        ServletConfig servletConfig = this.getServletConfig();
        System.out.println(servletConfig.getInitParameter("brand"));
        System.out.println(servletConfig.getInitParameter("screen"));

    }
}
