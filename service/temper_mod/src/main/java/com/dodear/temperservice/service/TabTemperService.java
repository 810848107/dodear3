package com.dodear.temperservice.service;

import com.dodear.temperservice.entity.TabTemper;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiXiaohan
 * @since 2021-10-04
 */
public interface TabTemperService extends IService<TabTemper> {

    /**
     * 添加一个心情
     * @return
     */
    Boolean AddOneTemperByUid(TabTemper tabTemper);

    /**
     * 展示所有的心情
     * @return
     */
    List<TabTemper> ShowAllTemperByUid(Integer uid);

    /**
     * 根据心情名称删除一个心情
     * @return
     */
    Boolean DeleOneTemper(Integer uid,String temper);
}
