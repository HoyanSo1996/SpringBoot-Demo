package com.omega.springboot.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Class Monster
 *
 * @author KennySo
 * @date 2024/9/27
 */
@Component
@ConfigurationProperties(prefix = "monster2")
@Data
public class Monster2 {

    private Integer id;

    private String name;

    private String skill;
}
