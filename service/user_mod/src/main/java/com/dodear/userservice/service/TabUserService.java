package com.dodear.userservice.service;

import com.dodear.userservice.entity.TabUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiXiaohan
 * @since 2021-10-01
 */
public interface TabUserService extends IService<TabUser> {

    TabUser FindOneByTel(String tel);

    Boolean AddOneUser(TabUser tabUser);

}
