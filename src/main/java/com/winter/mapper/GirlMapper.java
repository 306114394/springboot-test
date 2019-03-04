package com.winter.mapper;

import com.basoft.service.entity.Girl;
import com.basoft.service.entity.GirlExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GirlMapper {
    List<Girl> findALl();
}