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
    public Boolean AddOneTemperByUid(Integer uid,String temper) {
        QueryWrapper<TabTemper> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(TabTemper::getUid,uid);
        TabTemper tabtemper = tabTemperService.getOne(wrapper);



//        tabTemperService.update(tabtemper,)

        return null;
    }

    @Override
    public List<TabTemper> ShowAllTemper() {
        List<TabTemper> list = tabTemperService.list(null);
        return list;
    }

    @Override
    public Boolean DeleOneTemper(String temper) {
        List<TabTemper> list = tabTemperService.list(null);
        QueryWrapper<TabTemper> wrapper= new QueryWrapper<>();
        for (TabTemper tabTemper : list) {
            if (temper.equals(tabTemper.getT1())) {
                wrapper.lambda().eq(TabTemper::getT1,temper);
            }
            else if (temper.equals(tabTemper.getT2())){
                wrapper.lambda().eq(TabTemper::getT2,temper);
            }
            else if (temper.equals(tabTemper.getT3())){
                wrapper.lambda().eq(TabTemper::getT3,temper);
            }
            else if (temper.equals(tabTemper.getT4())){
                wrapper.lambda().eq(TabTemper::getT4,temper);
            }
            else if (temper.equals(tabTemper.getT5())){
                wrapper.lambda().eq(TabTemper::getT5,temper);
            }
            else if (temper.equals(tabTemper.getT6())){
                wrapper.lambda().eq(TabTemper::getT6,temper);
            }
            else if (temper.equals(tabTemper.getT7())){
                wrapper.lambda().eq(TabTemper::getT7,temper);
            }
            else if (temper.equals(tabTemper.getT8())){
                wrapper.lambda().eq(TabTemper::getT8,temper);
            }
        }
        boolean flag = tabTemperService.remove(wrapper);
        return flag;
    }
}
