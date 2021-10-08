package com.dodear.oss.controller;

import com.dodear.commonutils.Result;
import com.dodear.oss.service.OssServiceForMp4;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/ossmp4")
@CrossOrigin//跨域
@Api(description = "上传文件模块")
public class OssController {

    @Autowired
    private OssServiceForMp4 ossServiceForMp4;

    /**
     * 上传用户录音到oss
     * @param file
     * @param request
     * @param response
     * @return
     * @throws ServletException
     * @throws IOException
     */
    @PostMapping("/put")
    @ApiOperation("上传用户录音的方法")
    public Result uploadFileForMP4(MultipartFile file, HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        //获取上传文件 MultipartFile
        String url=ossServiceForMp4.uploadFileForMP4(file);
        return Result.ok().data("url",url);
    }
}
