package com.test.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Configuration : 表示Application作为sprig配置文件存在 
 * @EnableAutoConfiguration: 启动spring boot内置的自动配置 
 * @ComponentScan : 扫描bean，路径为Application类所在package以及package下的子路径
 * 所以这个类要位于最外层package最好
 * @author scli
 *
 */
@SpringBootApplication
public class Start {
  public static void main(String[] args) {
    SpringApplication.run(Start.class, args);
}
}
