package com.dodear.oss.controller;

import com.dodear.commonutils.Result;

import com.dodear.oss.service.OssService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/ossimg")
@CrossOrigin//跨域
@Api(description = "上传文件模块")
public class OssController {

    @Autowired
    private OssService ossService;


    /**
     * 上传用户头像
     * @param file
     * @return
     */
    @PostMapping("/put")
    @ApiOperation("上传用户头像的方法")
    public Result uploadOssUimgFile(MultipartFile file){
        //获取上传文件 MultipartFile
        String url=ossService.uploadFileSimage(file);

        return Result.ok().data("url",url);
    }

}
