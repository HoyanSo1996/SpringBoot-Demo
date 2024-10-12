package com.omega.springboot.controller;

import com.omega.springboot.util.WebUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Class UploadController
 *
 * @author KennySo
 * @date 2024/10/12
 */
@Slf4j
@Controller
public class UploadController {

    /**
     * 导航到 upload.html
     */
    @RequestMapping("/upload.html")
    public String uploadPage() {
        return "upload";
    }

    /**
     * 处理 upload 的数据
     */
    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("username") String username,
                       @RequestParam("email") String email,
                       @RequestParam("age") Integer age,
                       @RequestParam("job") String job,
                       @RequestParam("header") MultipartFile header,
                       @RequestParam("pet_photos") MultipartFile[] petPhotos) throws IOException {
        log.info("username = {}, email = {}, age = {}, job = {}", username, email, age, job);

        String path = ResourceUtils.getURL("classpath:").getPath();
        log.info("path = {}", path);
        File file = new File(path + WebUtils.getUploadFileDirectory());
        if (!file.exists()) {
            file.mkdirs();
        }

        if (!header.isEmpty()) {
            String originalFilename = header.getOriginalFilename();
            // 保存到动态创建的目录
            header.transferTo(new File(file.getAbsoluteFile() + "/" + UUID.randomUUID()
                    + "_" + System.currentTimeMillis() + "_" + originalFilename));
        }

        for (MultipartFile petPhoto : petPhotos) {
            if (!petPhoto.isEmpty()) {
                String originalFilename = petPhoto.getOriginalFilename();
                // 保存到动态创建的目录
                petPhoto.transferTo(new File(file.getAbsoluteFile() + "/" + UUID.randomUUID()
                        + "_" + System.currentTimeMillis() + "_" + originalFilename));
            }
        }
        return "upload successfully~";
    }
}
