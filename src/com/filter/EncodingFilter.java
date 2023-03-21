package com.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncodingFilter implements Filter {
    private String charset;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(charset);
        // 放行
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        charset = filterConfig.getInitParameter("charset");
    }

    @Override
    public void destroy() {
    }
}
