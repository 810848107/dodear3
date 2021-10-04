package com.dodear.recordingservice.service.impl;

import com.dodear.commonutils.Result;
import com.dodear.recordingservice.entity.TabRecord;
import com.dodear.recordingservice.mapper.TabRecordMapper;
import com.dodear.recordingservice.service.TabRecordService;
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
 * @since 2021-10-02
 */
@Service
public class TabRecordServiceImpl extends ServiceImpl<TabRecordMapper, TabRecord> implements TabRecordService {

    @Autowired
    private TabRecordService tabRecordService;
    public Boolean AddRecord(TabRecord tabRecord){
        boolean save = tabRecordService.save(tabRecord);
        return save;
    }

    @Override
    public List<TabRecord> ShowRecords() {
        List<TabRecord> list = tabRecordService.list(null);
        return list;
    }

}
