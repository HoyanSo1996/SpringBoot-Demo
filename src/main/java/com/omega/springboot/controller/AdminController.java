package com.omega.springboot.controller;

import com.omega.springboot.entity.Admin;
import com.omega.springboot.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Class LoginController
 *
 * @author KennySo
 * @date 2024/10/11
 */
@Controller
@Slf4j
public class AdminController {

    @PostMapping("/login")
    public String login(Admin admin, HttpServletRequest request) {
        if (StringUtils.hasText(admin.getUsername()) && "123456".equals(admin.getPassword())) {
            // 登录成功
            request.getSession().setAttribute("admin", admin);
            // 使用重定向, 防止表单重复提交
            // 写的 manage.html, 因为这样可以更加明确的表示到哪个页面
            return "redirect:/manage.html";
        } else {
            // 登录失败
            request.setAttribute("msg", "用户名/密码错误");
            return "admin_login";
        }
    }

    @GetMapping("/manage.html")
    public String mainPage(Model model, HttpSession session) {
        log.info("进入 mainPage...");

        if (session.getAttribute("admin") != null) {
            // 验证用户是否有登录过
            ArrayList<User> userList = new ArrayList<>();
            userList.add(new User(1, "关羽~", 20, "gy@sohu.com",  "666666"));
            userList.add(new User(2, "张飞", 30, "zf@sohu.com",  "666666"));
            userList.add(new User(3, "赵云", 22, "zy@sohu.com", "666666"));
            userList.add(new User(4, "马超", 28, "mc@sohu.com", "666666"));
            userList.add(new User(5, "黄忠", 50, "hz@sohu.com", "666666"));
            model.addAttribute("userList", userList);
            // 利用 Thymeleaf 的视图解析器, 请求转发到真正要去的页面 /templates/manage.html
            return "manage";
        } else {
            // 返回登录页, 并给出提示
            model.addAttribute("msg", "您尚未登录/请登录");
            return "admin_login";
        }
    }
}
