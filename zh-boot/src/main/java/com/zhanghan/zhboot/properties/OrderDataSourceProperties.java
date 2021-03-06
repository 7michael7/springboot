/*
 * Copyright (c) 2019. zhanghan_java@163.com All Rights Reserved.
 * 项目名称：实战SpringBoot
 * 类名称：OrderDataSourceProperties.java
 * 创建人：张晗
 * 联系方式：zhanghan_java@163.com
 * 开源地址: https://github.com/dangnianchuntian/springboot
 * 博客地址: https://zhanghan.blog.csdn.net
 */

package com.zhanghan.zhboot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@Data
@ConfigurationProperties(prefix = "order.datasource")
public class OrderDataSourceProperties {

    private String url;

    private String username;

    private String password;

    private Integer connectionTimeout;

    private Integer idleTimeout;

    private Integer maxLifetime;

    private Integer maximumPoolSize;

    private Integer minimumIdle;
}
