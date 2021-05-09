package com.helpjun.business.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.helpjun.business.test.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUserEntity> {
    List<SysUserEntity> findAllUser();
}
