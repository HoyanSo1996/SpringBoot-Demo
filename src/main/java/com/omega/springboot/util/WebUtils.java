package com.omega.springboot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class WebUtils
 *
 * @author KennySo
 * @date 2024/10/12
 */
public class WebUtils {

    public static String UPLOAD_FILE_DIRECTORY = "static/images/upload/";

    public static String getUploadFileDirectory() {
        return UPLOAD_FILE_DIRECTORY + new SimpleDateFormat("yyyy/MM/dd").format(new Date()) + "/";
    }
}
