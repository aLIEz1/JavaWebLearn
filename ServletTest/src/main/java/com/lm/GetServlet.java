package com.lm;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //凌驾于所有servlet之上
        ServletContext context = this.getServletContext();
        //获取初始化参数
        String parameter = context.getInitParameter("jdbcUrl");
        String username = (String) context.getAttribute("username");

        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().println(username + "getContext "+parameter+ "getParameter");
    }
}
