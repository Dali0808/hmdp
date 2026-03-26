package com.hmdp.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient(){
        //1.创建配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.79.129:6379").setPassword("zdl050808");
        //2.添加地址，这里可以添加多个地址，Redisson会自动进行
        return Redisson.create(config);

    }
}
