package com.all.boot7incepetor.filter;

import javax.servlet.*;
import java.io.IOException;

public class myFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("实现了过滤");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
