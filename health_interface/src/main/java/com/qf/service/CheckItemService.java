package com.qf.service;

import com.qf.entity.PageResult;
import com.qf.entity.QueryPageBean;
import com.qf.pojo.CheckItem;

import java.util.List;

public interface CheckItemService {
    void add(CheckItem checkItem);

    PageResult findPage(QueryPageBean pageBean);

    void delete(Integer id);

    CheckItem findById(Integer id);

    void edit(CheckItem checkItem);

    List<CheckItem> findAll();
}
