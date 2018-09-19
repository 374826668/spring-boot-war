package com.peng.springbootwar.handlerException;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/19
 * Time: 14:04
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *描述：统一异常处理
 * @author Li.peng
 *@create 2018-09-19 14:04
 */
@ControllerAdvice
public class BizException {
    private Logger logger=LoggerFactory.getLogger(BizException.class);

    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(RuntimeException exception){
        logger.info("自定义处理异常-RuntimeException");
        ModelAndView m=new ModelAndView();
        m.addObject("controllerException",exception.getMessage());
        m.setViewName("error/500");
        return m;
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(Exception exception){
        logger.info("自定义处理异常-Exception");
        ModelAndView m=new ModelAndView();
        m.addObject("controllerException",exception.getMessage());
        m.setViewName("error/500");
        return m;
    }
}
