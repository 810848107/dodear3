package com.dodear.userservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dodear.userservice.entity.TabUser;
import com.dodear.userservice.mapper.TabUserMapper;
import com.dodear.userservice.service.TabUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiXiaohan
 * @since 2021-10-01
 */
@Service
public class TabUserServiceImpl extends ServiceImpl<TabUserMapper, TabUser> implements TabUserService {

    @Autowired
    private TabUserService tabUserService;

    @Override
    public TabUser FindOneByTel(String tel) {
        QueryWrapper<TabUser> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(TabUser::getUtel,tel);
        TabUser tabUser = tabUserService.getOne(wrapper);
        return tabUser;
    }

    @Override
    public Boolean AddOneUser(TabUser tabUser) {
        boolean flag = tabUserService.save(tabUser);
        return flag;
    }
}
