package com.peng.springbootwar.restcontroller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
    private Logger logger=LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("index")
    public String index(ModelMap map) {
        map.put("title","index欢迎页面");
        logger.info("index页面");
        return "index";
    }

    @RequestMapping("exception")
    public String exception(ModelMap map) {
        throw new RuntimeException("测试异常");
    }


}
