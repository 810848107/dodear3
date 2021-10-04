package com.dodear.recordingservice.controller;


import com.dodear.commonutils.Result;
import com.dodear.recordingservice.entity.TabRecord;

import com.dodear.recordingservice.service.TabRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LiXiaohan
 * @since 2021-10-02
 */
@RestController
@RequestMapping("/recordingservice/tab-record")
public class TabRecordController {

    @Autowired
    private TabRecordService tabRecordService;


    @PostMapping
    public Result AddRecord(@RequestBody TabRecord tabRecord){

        Boolean save = tabRecordService.AddRecord(tabRecord);
        if (save){
            return Result.ok().data("addRecord",tabRecord);
        } else {
            return Result.error().message("录音保存失败");
        }
    }

    @GetMapping
    public Result ShowRecords(){
        List<TabRecord> list = tabRecordService.ShowRecords();

        return Result.ok().data("Records",list);
    }



}

