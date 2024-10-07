package com.omega.springboot.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Class MonsterController
 *
 * @author KennySo
 * @date 2024/10/8
 */
@RestController
@RequestMapping("/monster")
public class MonsterController {

    @GetMapping("query")
    public String queryMonster() {
        return "GET-获取怪物";
    }

    @PostMapping("add")
    public String addMonster() {
        return "POST-保存怪物";
    }

    @PutMapping("modify")
    public String modifyMonster() {
        return "PUT-修改怪物";
    }

    @DeleteMapping("delete")
    public String deleteMonster() {
        return "DELETE-删除怪物";
    }
}
