package com.winter.mapper;

import com.basoft.service.entity.CmCode;
import com.basoft.service.entity.CmCodeExample;
import com.basoft.service.entity.CmCodeKey;
import com.basoft.service.entity.CmCodeWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface CmCodeMapper {
    int deleteByExample(CmCodeExample example);

    int deleteByPrimaryKey(CmCodeKey key);

    int insert(CmCodeWithBLOBs record);

    int insertSelective(CmCodeWithBLOBs record);

    CmCodeWithBLOBs selectByPrimaryKey(CmCodeKey key);

    int updateByExampleSelective(@Param("record") CmCodeWithBLOBs record, @Param("example") CmCodeExample example);

    int updateByExampleWithBLOBs(@Param("record") CmCodeWithBLOBs record, @Param("example") CmCodeExample example);

    int updateByExample(@Param("record") CmCode record, @Param("example") CmCodeExample example);

    int updateByPrimaryKeySelective(CmCodeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CmCodeWithBLOBs record);

    int updateByPrimaryKey(CmCode record);
}