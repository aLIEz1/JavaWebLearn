package com.lm;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        System.out.println("进入DispatchServlet");
//        //转发的请求路径
//        RequestDispatcher dispatcher = context.getRequestDispatcher("/getServlet");
//        //调用forward实现请求转发
//        dispatcher.forward(req,resp);
        //合并成一句话
        context.getRequestDispatcher("/getServlet").forward(req,resp);
    }
}
