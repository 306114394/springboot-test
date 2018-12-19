package com.winter.mapper;

import com.basoft.service.entity.EorderCategory;
import com.basoft.service.entity.EorderCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface EorderCategoryMapper {
    int deleteByExample(EorderCategoryExample example);

    int deleteByPrimaryKey(Long categoryid);

    int insert(EorderCategory record);

    int insertSelective(EorderCategory record);

    EorderCategory selectByPrimaryKey(Long categoryid);

    int updateByExampleSelective(@Param("record") EorderCategory record, @Param("example") EorderCategoryExample example);

    int updateByExample(@Param("record") EorderCategory record, @Param("example") EorderCategoryExample example);

    int updateByPrimaryKeySelective(EorderCategory record);

    int updateByPrimaryKey(EorderCategory record);
}