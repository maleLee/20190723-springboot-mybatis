package com.aaa.lee.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description springboot的启动类
 *      springboot的启动类必须要放在根目录下，不能和任何一个业务逻辑包平级，否则无法进行扫描
 */
@SpringBootApplication
// @MapperScan("com.aaa.lee.springboot.mapper")
public class ApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class, args);

    }

}
