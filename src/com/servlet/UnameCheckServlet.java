package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Ma HaiYang
 * @Description: MircoMessage:Mark_7001
 */
@WebServlet("/unameCheckServlet.do")
public class UnameCheckServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String info="";
        if("admin".equals(uname)){
            info="用户名已经占用";
        }else{
            info="用户名可用";
        }
        // 向浏览器响应数据
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().print(info);
    }
}
