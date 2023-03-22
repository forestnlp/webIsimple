package com.servlet;

import com.entity.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

@WebServlet("/testServlet.do")
public class TestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user1 =new User("晓明1","123");
        User user2 =new User("晓明2","123");
        User user3 =new User("晓明3","123");
        User user4 =new User("晓明4","123");
        User user5 =new User("晓明5","123");
        ArrayList<User> list =new ArrayList<>();
        Collections.addAll(list,user1,user2,user3,user4,user5);
        // 响应普通文本数据
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        GsonBuilder gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss");
        Gson gson = gsonBuilder.create();
        String str = gson.toJson(list);
        System.out.println(str);
        resp.getWriter().print(str);
    }
}
