package com.peng.springbootwar.restcontroller;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/19
 * Time: 18:15
 */

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 *描述：HelloRestController
 * @author Li.peng
 *@create 2018-09-19 18:15
 */
@RestController
@RequestMapping(value = "/rest")
public class HelloRestController {
//    @CrossOrigin(origins = "http://localhost:1111")//细粒度处理跨域
    @RequestMapping(value = "get", method = RequestMethod.POST)
    public Map<String,Object> get(@RequestParam String name){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("title","hello world");
        map.put("name",name);
        return map;
    }
}
