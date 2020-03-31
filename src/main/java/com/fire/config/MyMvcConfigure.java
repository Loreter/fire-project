package com.fire.config;

import com.fire.handler.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>
 * MvcConfigure TODO
 * </p>
 *
 * @author: Bruce
 * @date: 2020/3/20
 */

@Configuration
public class MyMvcConfigure implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
    }

    // 注册国际化组件

    /**
     * 注:该bean的ID只能是localeResolver ，不能是其他名字，不然不会被识别
     * @return  LocaleResolver
     */
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
