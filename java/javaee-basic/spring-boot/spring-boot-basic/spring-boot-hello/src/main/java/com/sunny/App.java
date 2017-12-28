package com.sunny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用@SpingBootApplincation指定这是一个spring boot的应用程序
 * @author JinDaShuai -- 金玉宝
 * @version v.0.1
 * @date 2017/12/23
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        // 在main方法进行启动我们的应用程序
    	SpringApplication.run(App.class, args);
    }
}
