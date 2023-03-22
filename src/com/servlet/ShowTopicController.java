package com.servlet;

import com.entity.PageBean;
import com.entity.Topic;
import com.service.TopicService;
import com.service.impl.TopicServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/showTopic")
public class ShowTopicController extends HttpServlet {

    private TopicService service = new TopicServiceImpl();

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        int currentPage, pageSize;
        if (req.getParameter("currentPage") == null) currentPage = 1;
        else currentPage = Integer.parseInt(req.getParameter("currentPage"));
        if (req.getParameter("pageSize") == null) pageSize = 100;
        else pageSize = Integer.parseInt(req.getParameter("pageSize"));

        String title = req.getParameter("title") == null ? "" : req.getParameter("title");

        PageBean<Topic> pageBean = service.findByPage(title, currentPage, pageSize);

        System.out.println(pageBean);

        req.setAttribute("pageBean", pageBean);
        req.setAttribute("title", title);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("showTopic.jsp");
        requestDispatcher.forward(req, res);
    }
}
