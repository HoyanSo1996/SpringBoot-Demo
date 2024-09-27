package com.omega.springboot.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Class Monster
 *
 * @author KennySo
 * @date 2024/9/27
 */
//@Component
@ConfigurationProperties(prefix = "monster3")
@Data
public class Monster3 {

    private Integer id;

    private String name;

    private String skill;
}
