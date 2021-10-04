package com.dodear.oss.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.dodear.oss.service.OssServiceForMp4;
import com.dodear.oss.utils.ConstantPropertiesUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.UUID;

@Service
public class OssServiceForMp4Impl implements OssServiceForMp4 {
    @Override
    public String uploadFileForMP4(MultipartFile file) {
        //获取值
        String endpoint = ConstantPropertiesUtils.END_POINT;
        String accessKeyId = ConstantPropertiesUtils.ACCESS_KEY_ID;
        String accessKeySecret = ConstantPropertiesUtils.ACCESS_KEY_SECRET;
        String bucketName = ConstantPropertiesUtils.BUCKET_NAME;


        try {
            // 创建OSSClient实例。
            OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

            // 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
            InputStream inputStream = file.getInputStream();

            //获取文件名称
            String fileName=file.getOriginalFilename();

            /////图片唯一值
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            fileName = uuid+"--"+fileName;


            //在此决定添加到的文件目录
            fileName="mp4lib/"+fileName;


//            /////把文件按照时间分类(利用依赖工具类)
//            String datePath = new DateTime().toString("yyyy/MM/dd");
//            fileName=datePath+"/"+fileName;

            // 依次填写Bucket名称（例如examplebucket）和Object完整路径（例如exampledir/exampleobject.txt）。Object完整路径中不能包含Bucket名称。
            //第一个：Bucket名称
            //第二个：上传到oss文件路径和文件名称
            //第三个：上传文件输入流
            ossClient.putObject(bucketName,fileName,inputStream);

            // 关闭OSSClient。
            ossClient.shutdown();

            //把上传到阿里云oss路径手动拼接出来
            String url = "https://"+bucketName+"."+endpoint+"/"+fileName;
            return url;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
