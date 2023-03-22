package com.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

//@WebListener
public class MyRequestListener implements ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        ServletRequest servletRequest = srae.getServletRequest();
        System.out.println("attributeAdded:" + srae.getName() + "," + srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        ServletRequest servletRequest = srae.getServletRequest();
        System.out.println("attributeRemoved:" + srae.getName() + "," + srae.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        ServletRequest servletRequest = srae.getServletRequest();
        System.out.println("attributeReplaced:" + srae.getName() + "," + srae.getValue() + ",new value=" + servletRequest.getAttribute(srae.getName()));
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println("request" + servletRequest.hashCode() + "对象销毁了");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println("request" + servletRequest.hashCode() + "对象初始化");
    }
}
