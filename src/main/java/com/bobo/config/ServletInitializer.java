package com.bobo.config;

import com.bobo.BoBoApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 生成war包使用外部Tomcat启动时注入启动类
 *
 * @author lilibo
 * @date 2019/9/11
 */
public class ServletInitializer extends SpringBootServletInitializer {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BoBoApplication.class);
    }
}
