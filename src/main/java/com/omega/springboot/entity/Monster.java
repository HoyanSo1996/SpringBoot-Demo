package com.omega.springboot.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Class Monster
 *
 * @author KennySo
 * @date 2024/9/27
 */
@Component
@Data
public class Monster {

    @Value("${monster.id}")
    private Integer id;

    @Value("${monster.name}")
    private String name;

    @Value("${monster.skill}")
    private String skill;
}
