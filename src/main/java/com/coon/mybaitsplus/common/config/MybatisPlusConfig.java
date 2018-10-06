package com.coon.mybaitsplus.common.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  mybatis-plus 逻辑删除开启
 *  Bean配置
 */
@Configuration
public class MybatisPlusConfig {
    /**
     *  mybatis-plus逻辑删除配置Bean
     *
     */
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
}
