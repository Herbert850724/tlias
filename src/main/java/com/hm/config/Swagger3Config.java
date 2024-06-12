package com.hm.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger3Config {

    @Bean
    public GroupedOpenApi deptApi(){
        return GroupedOpenApi.builder().group("部門模型").pathsToMatch("/depts/**").build();
    }

    @Bean
    public GroupedOpenApi empApi(){
        return GroupedOpenApi.builder().group("員工模型").pathsToMatch("/emps/**").build();
    }

    @Bean
    public OpenAPI docsOpenApi(){
        return new OpenAPI()
                .info(new Info().title("學習系統")
                        .description("通用設計")
                        .version("v1.0"));
    }
}
