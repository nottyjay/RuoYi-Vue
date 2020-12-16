package com.ruoyi.system.mybatis.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * 元数据处理
 *
 * @author Nottyjay
 * @date 2020-10-10
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        Timestamp time=new Timestamp(System.currentTimeMillis());
        this.setFieldValByName("createTime", time, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Timestamp time=new Timestamp(System.currentTimeMillis());
        this.setFieldValByName("updateTime", time, metaObject);
    }
}
