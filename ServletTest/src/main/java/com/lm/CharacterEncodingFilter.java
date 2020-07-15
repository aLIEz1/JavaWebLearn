package com.lm;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author super
 */
public class CharacterEncodingFilter implements Filter {

    /**
     * 初始化
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter启动。。。");
    }

    /**
     * 执行filter过滤器
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("text/html;charset=UTF-8");
        System.out.println("doFilter执行前。。。");
        //请求交接给下个servlet或者filter，将请求转交、通行
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("doFilter执行后。。。");

    }

    /**
     * 销毁
     */
    @Override
    public void destroy() {
        System.out.println("Filter销毁。。。");
    }
}
