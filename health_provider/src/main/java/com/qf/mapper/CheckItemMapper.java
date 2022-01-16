package com.qf.mapper;

import com.qf.entity.QueryPageBean;
import com.qf.pojo.CheckItem;

import java.util.List;

public interface CheckItemMapper {
    void add(CheckItem checkItem);

    List<CheckItem> findPage(QueryPageBean pageBean);

    void delete(Integer id);

    CheckItem findById(Integer id);

    void edit(CheckItem checkItem);
}
