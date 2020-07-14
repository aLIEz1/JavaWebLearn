package com.lm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author super
 */
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //从请求中获得参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //返回用户名和密码
//        resp.getWriter().println(username +":"+ password);
        resp.sendRedirect("/ServletTest_war//success.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
