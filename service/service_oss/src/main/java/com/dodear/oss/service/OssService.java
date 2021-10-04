package com.dodear.oss.service;


import org.springframework.web.multipart.MultipartFile;

public interface OssService {
    /**
     * 上传用户头像
     * @param file
     * @return
     */
    String uploadFileSimage(MultipartFile file);


}
