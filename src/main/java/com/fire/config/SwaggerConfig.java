package com.fire.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * SwaggerConfig TODO Swagger配置类
 * </p>
 *
 * @author: Bruce
 * @date: 2020/3/23
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 创建API应用
     *
     *  通过 apiInfo() 增加API相关信息
     *  通过 select() 函数返回一个 ApiSelectorBuilder 实例，用来控制哪些接口暴露给Swagger来展现
     *  apis 制定扫描包路径来定义指定要建立的API的目录
     * @return
     */
    @Bean
    public Docket createRestApi(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(""))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建API的基本信息（这些基本信息是会展示在文档页面中）
     * 访问地址
     * @return
     */

    private ApiInfo apiInfo() {
        Contact contact = new Contact("百度","http://www.baidu.com","530724846@qq.com");
        return new ApiInfoBuilder()
                .title("Spring Boot集成Swagger2")
                .description("更多请关注http://www.baidu.com")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact(contact)
                .version("1.0")
                .build();

    }
}
