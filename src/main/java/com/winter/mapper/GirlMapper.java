package com.winter.mapper;

import com.basoft.service.entity.GirlExample;
import com.winter.proxyTest.Girl;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GirlMapper {
    int deleteByExample(GirlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Girl record);

    int insertSelective(Girl record);

    Girl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Girl record, @Param("example") GirlExample example);

    int updateByExampleWithBLOBs(@Param("record") Girl record, @Param("example") GirlExample example);

    int updateByExample(@Param("record") Girl record, @Param("example") GirlExample example);

    int updateByPrimaryKeySelective(Girl record);

    int updateByPrimaryKeyWithBLOBs(Girl record);

    int updateByPrimaryKey(Girl record);
}