package com.lm;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @author super
 */
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("GBK");
        resp.setCharacterEncoding("GBK");
        PrintWriter out = resp.getWriter();
        //返回的数组说明cookie可能存在多个
        Cookie[] cookies = req.getCookies();
        if (cookies == null) {
            out.write("这是你第一次访问网站");
        } else {
            out.write("你上一次访问的时间是：");
            for (Cookie cookie : cookies) {
                if ("lastLoginTime".equals(cookie.getName())) {
                    long lastLoginTime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastLoginTime);
                    out.write(date.toLocaleString());
                }
            }
        }
        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis() + "");
        //设置cookie有效期为一天
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);
    }

}
