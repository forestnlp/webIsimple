package com.servlet;

import com.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/loginCheckController.do")
public class LoginCheckController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 判断是否登录
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        Object listener = session.getAttribute("listener");// 获得对应的监听器
        String message ="";
        if(null != user){
            message="您已经登录过";
            message+=","+((User)user).getUsername();
        }else{
            message="您还未登录";
        }
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println(message);
    }
}
