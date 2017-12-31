package com.sunny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 在pom.xml中引入freemarker;
 * 2. 在application.properties文件中添加配置信息，开发过程中建议关闭freemarker缓存
 * 3. 编写模板文件，thymealeaf的默认后缀是.html,freemarker的默认后缀是.ftl
 * 4. 编写访问文件的controller
 * ----------------------------------
 * 同时我们知道两个模板引擎是可以共存的：thymealeaf 和  freemarker
 * @author JinDaShuai
 *
 */
@SpringBootApplication
public class SpringBootFreemarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFreemarkerApplication.class, args);
	}
}
