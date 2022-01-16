package com.qf.mapper;

import com.qf.entity.QueryPageBean;
import com.qf.pojo.CheckGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckGroupMapper {
    void add(CheckGroup checkGroup);

    void addCheckGroupCheckItem(@Param("checkgroupId") Integer id, @Param("checkitemId") Integer checkitemId);

    List<CheckGroup> findPage(QueryPageBean pageBean);

    CheckGroup findById(Integer id);

    List<Integer> findCheckItemIdsByCheckGroupId(Integer id);

    void edit(CheckGroup checkGroup);

    void deleteCheckGroupCheckItemByCheckGroupId(Integer id);
}
