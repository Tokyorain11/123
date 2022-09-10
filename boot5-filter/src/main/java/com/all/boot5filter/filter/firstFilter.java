package com.all.boot5filter.filter;

import javax.servlet.*;
import java.io.IOException;

public class firstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行了filter方法");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
