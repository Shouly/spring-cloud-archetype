package me.shouly.nacos.demos.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangbing
 * @version v1.0
 * @date 2019/12/11 3:30 下午
 **/
@RefreshScope
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Value("${name}")
    private String name;

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello " + name;
    }

}
