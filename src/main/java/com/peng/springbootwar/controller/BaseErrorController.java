package com.peng.springbootwar.controller;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/19
 * Time: 13:27
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *描述：错误信息页面
 * @author Li.peng
 *@create 2018-09-19 13:27
 */
@Controller
@RequestMapping(value = "error")
public class BaseErrorController implements ErrorController {
    private Logger logger=LoggerFactory.getLogger(BaseErrorController.class);
    @Override
    public String getErrorPath() {
        logger.info("出错啦！进入自定义错误控制器");
        return "error/error";
    }

    @RequestMapping
    public String error(){
        return getErrorPath();
    }
}
