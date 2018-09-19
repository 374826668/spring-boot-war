package com.peng.springbootwar.util.servlet;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/19
 * Time: 14:49
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *描述：servlet
 * @author Li.peng
 *@create 2018-09-19 14:49
 */
public class CustomServlet extends HttpServlet {
    private static final long serialVersionUID = -7157745530239369401L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet get method");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet post method");
        resp.getWriter().write("hello world");
    }
}
