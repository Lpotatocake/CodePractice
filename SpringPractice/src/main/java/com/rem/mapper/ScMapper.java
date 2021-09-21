package com.rem.mapper;

import com.rem.entry.SC;

import java.util.List;

public interface ScMapper {
    //查询sc表的全部数据
    List<SC> querryAll();

    //通过分数查询
    SC selectByGrade(int grade);

    int insertIntoSC(SC sc);
}
