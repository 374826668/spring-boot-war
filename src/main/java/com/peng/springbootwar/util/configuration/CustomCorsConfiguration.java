package com.peng.springbootwar.util.configuration;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/19
 * Time: 17:46
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *描述：configuration
 * @author Li.peng
 *@create 2018-09-19 17:46
 */
@Configuration
public class CustomCorsConfiguration {

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/rest/**").allowedOrigins("http://localhost:1111");
                //http://localhost:1111   前端可以访问地址
                //addMapping 后端接口过滤
            }
        };
    }
}
