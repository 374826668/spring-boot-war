package com.peng.springbootwar;

import com.peng.springbootwar.util.filter.CustomFilter;
import com.peng.springbootwar.util.listener.CustomListener;
import com.peng.springbootwar.util.servlet.CustomServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
@ServletComponentScan
@SpringBootApplication
public class SpringBootWarApplication {
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(){
//        return new ServletRegistrationBean(new CustomServlet(),"/peng");
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        return new FilterRegistrationBean(new CustomFilter(),servletRegistrationBean());
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean<CustomListener> servletListenerRegistrationBean(){
//        return new ServletListenerRegistrationBean<CustomListener>(new CustomListener());
//    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWarApplication.class, args);
    }
}
