package com.dodear.temperservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dodear.temperservice.entity.TabTemper;
import com.dodear.temperservice.mapper.TabTemperMapper;
import com.dodear.temperservice.service.TabTemperService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiXiaohan
 * @since 2021-10-04
 */
@Service
public class TabTemperServiceImpl extends ServiceImpl<TabTemperMapper, TabTemper> implements TabTemperService {

    @Autowired
    private TabTemperService tabTemperService;

    @Override
    public Boolean AddOneTemperByUid(TabTemper tabTemper) {
        QueryWrapper<TabTemper> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(TabTemper::getUid,tabTemper.getUid());
        wrapper.lambda().eq(TabTemper::getTemperdemo,tabTemper.getTemperdemo());
        TabTemper one = tabTemperService.getOne(wrapper);
        if (one!=null){
            return false;
        }else {
            tabTemperService.save(tabTemper);
            return true;
        }

    }

    @Override
    public List<TabTemper> ShowAllTemperByUid(Integer uid) {
        QueryWrapper<TabTemper> wrapper =new QueryWrapper<>();
        wrapper.lambda().eq(TabTemper::getUid,uid);
        List<TabTemper> list = tabTemperService.list(wrapper);
        return list;
    }

    @Override
    public Boolean DeleOneTemper(Integer uid,String temper) {
        QueryWrapper<TabTemper> wrapper= new QueryWrapper<>();
        wrapper.lambda().eq(TabTemper::getUid,uid);
        wrapper.lambda().eq(TabTemper::getTemperdemo,temper);
        TabTemper one = tabTemperService.getOne(wrapper);
        if (one!=null){
            tabTemperService.remove(wrapper);
            return true;
        }else {
            return false;
        }

    }
}
