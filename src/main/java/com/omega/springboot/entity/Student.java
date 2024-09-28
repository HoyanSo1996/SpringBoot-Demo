package com.omega.springboot.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Class Student
 *
 * @author KennySo
 * @date 2024/9/28
 */
@Component
@ConfigurationProperties(prefix = "student")
@Data
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private Boolean isMarried;
    private Date birth;
    private String[] skills;
    private List<String> hobbies;
    private Set<Double> salaries;
    private Car car;
    private Map<String, Object> houses;
    private Map<String, List<Car>> cars;
}
