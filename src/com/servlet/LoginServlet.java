package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;


public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {





        //        ServletContext context = request.getServletContext();
//        Object filedir = context.getInitParameter("filedir");
//        System.out.println(filedir);
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("utf-8");
//        String userName = request.getParameter("userName");
//        response.setContentType("text/html");// 专门用于设置Content-Type 响应头
//        PrintWriter writer = response.getWriter();
//        writer.println("你好："+userName);
//        writer.flush();
//        writer.close();
//        获取参数
//        Map<String, String[]> parameterMap = request.getParameterMap();
//        for (Map.Entry<String,String[]> map: parameterMap.entrySet()) {
//            System.out.println(map.getKey());
//            String [] values = map.getValue();
//            for(String v:values){
//                System.out.println(v);
//            }
//        }
//        Enumeration<String> headerNames = request.getHeaderNames();
//        while (headerNames.hasMoreElements()){
//            String headername = headerNames.nextElement();
//            System.out.println(headername+":"+request.getHeader(headername));
//        }

//        System.out.println("getRequestURL"+request.getRequestURL());
//        System.out.println("getRequestURI"+request.getRequestURI());
//        System.out.println("getRemoteAddr"+request.getRemoteAddr());
//        System.out.println("getLocalAddr"+request.getLocalAddr());
//        System.out.println("getLocalPort"+request.getLocalPort());

//        File file = new File("login.html");
//        response.addHeader("Content-Disposition","attachment;filename="+new String (file.getName().getBytes("gbk"),"iso-8859-1"));
//        PrintWriter writer = response.getWriter();
//        writer.println("{[a],[b]}");
//        writer.flush();
//        writer.close();

//        response.setStatus(404);
//        response.getWriter().println("hello");
    }
}
