package com.lm;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author super
 */
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest)servletRequest;
        HttpServletResponse response= (HttpServletResponse) servletResponse;
        if (request.getSession().getAttribute("USER_SESSION")==null) {
            response.sendRedirect("/login.jsp");
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
