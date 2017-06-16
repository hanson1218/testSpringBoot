package com.test.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.springBoot.Entity.User;

@RestController
@RequestMapping("/springboot")
public class ConfigController {

  @Autowired
  User user;
  
  /**
   * 在spring boot中默认会加载 
    classpath:/,classpath:/config/,file:./,file:./config/ 路径下以application命名的property或yaml文件；
          参数spring.config.location设置配置文件存放位置
            参数spring.config.name设置配置文件名称
     yml层级配置时，不能用制表符
   * @return
   */
  @RequestMapping(value = "/config", method = RequestMethod.GET)
  public String sayWorld() {
      return "Hello " + user.getName()+".age:"+user.getAge();
  }
}
