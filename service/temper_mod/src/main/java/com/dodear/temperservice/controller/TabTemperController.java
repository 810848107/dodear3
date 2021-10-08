package com.dodear.temperservice.controller;


import com.dodear.commonutils.Result;
import com.dodear.temperservice.entity.TabTemper;
import com.dodear.temperservice.service.TabTemperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LiXiaohan
 * @since 2021-10-04
 */
@RestController
@RequestMapping("/temper")
public class TabTemperController {

    @Autowired
    private TabTemperService tabTemperService;

    /**
     * 添加一个心情到数据库
     * @param tabTemper
     * @return
     */
    @PostMapping("/add")
    public Result AddOneTemperByUid(@RequestBody TabTemper tabTemper){
        Boolean flag = tabTemperService.AddOneTemperByUid(tabTemper);
        if (flag) {
            return Result.ok();
        }else {
            return Result.error().message("添加失败");
        }
    }

    /**
     * 展示一个用户的所有心情
     * @param uid
     * @return
     */
    @GetMapping("/show/{uid}")
    public Result ShowAllTemperByUid(@PathVariable Integer uid){
        List<TabTemper> list = tabTemperService.ShowAllTemperByUid(uid);
        return Result.ok().data("tempers",list);
    }

    /**
     * 删除一个用户的一个心情
     * @param uid
     * @param temper
     * @return
     */
    @GetMapping("/dele/{uid}/{temper}")
    public Result DeleOneTemper(@PathVariable Integer uid,@PathVariable String temper){
        Boolean flag = tabTemperService.DeleOneTemper(uid, temper);
        if (flag) {
            return Result.ok();
        }else {

            return Result.error().message("删除失败");
        }

    }

}

