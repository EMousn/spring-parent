package com.yaomy.sgrain.returnvalue.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: spring-parent
 * @description: 返回值配置文件类
 * @author: 姚明洋
 * @create: 2020/03/25
 */
@ConfigurationProperties(prefix = "spring.sgrain.return-value")
public class ReturnValueProperties {
    /**
     * 组件开关
     */
    private Boolean enable = Boolean.TRUE;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
