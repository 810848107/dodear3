package com.dodear.servicebase.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("date",new Date(),metaObject);
        this.setFieldValByName("date",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
