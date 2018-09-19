package com.peng.springbootwar.util.filter;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/19
 * Time: 16:01
 */

import javax.servlet.*;
import java.io.IOException;

/**
 *描述：filter
 * @author Li.peng
 *@create 2018-09-19 16:01
 */
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("do filter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter");
    }
}
