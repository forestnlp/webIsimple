package com.servlet;

import com.entity.User;
import com.listener.MySessionBindingListener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="loginController",urlPatterns = "/loginController.do")
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User(username,password);
        System.out.println(user.getUsername()+" login success");
        HttpSession session = req.getSession();
        session.setAttribute("user",user);
        session.setAttribute("listener",new MySessionBindingListener());
        session.setMaxInactiveInterval(100);
        resp.sendRedirect("welcome.jsp");
    }
}
