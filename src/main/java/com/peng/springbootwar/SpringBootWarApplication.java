package com.peng.springbootwar;

import com.peng.springbootwar.util.filter.CustomFilter;
import com.peng.springbootwar.util.listener.CustomListener;
import com.peng.springbootwar.util.servlet.CustomServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.*;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

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

    /**
     * 文件上传配置
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
    //文件最大
        factory.setMaxFileSize("700MB"); //KB,MB   10240KB
    // 设置总上传数据总大小
        factory.setMaxRequestSize("1000MB");
        return factory.createMultipartConfig();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWarApplication.class, args);
    }
}
