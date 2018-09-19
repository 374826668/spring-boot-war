package com.peng.springbootwar.util.listener;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/19
 * Time: 16:17
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *描述：listener
 * @author Li.peng
 *@create 2018-09-19 16:17
 */
public class CustomListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("contextDestroyed");
    }
}
