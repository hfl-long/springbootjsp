package com.hfl;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:黄飞龙
 * @Date: Created in 23:20 2017/5/18
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(Map<String,Object> map){
        map.put("name","hfl");
        return "index";
    }
}
