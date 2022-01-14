package com.qf.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.mapper.CheckItemMapper;
import com.qf.pojo.CheckItem;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CheckItemServiceImpl implements CheckItemService {

    @Autowired
    private CheckItemMapper checkItemMapper;

    @Override
    public void add(CheckItem checkItem) {
        checkItemMapper.add(checkItem);
    }
}
