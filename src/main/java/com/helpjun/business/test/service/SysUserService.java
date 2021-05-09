package com.helpjun.business.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.helpjun.business.test.entity.SysUserEntity;

import java.util.List;

public interface SysUserService extends IService<SysUserEntity> {
    List<SysUserEntity> findAllUser();
}
