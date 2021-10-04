
package com.dodear.oss.service;

import org.springframework.web.multipart.MultipartFile;

public interface OssServiceForMp4 {
    /**
     * 上传录音
     * @param file
     * @return
     */
    String uploadFileForMP4(MultipartFile file);
}
