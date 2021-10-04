package com.dodear.recordingservice.service;

import com.dodear.commonutils.Result;
import com.dodear.recordingservice.entity.TabRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiXiaohan
 * @since 2021-10-02
 */
public interface TabRecordService extends IService<TabRecord> {

    /**
     * 向数据库添加新录音
     * @param tabRecord
     * @return
     */
    Boolean AddRecord(TabRecord tabRecord);

    List<TabRecord> ShowRecords();
}
