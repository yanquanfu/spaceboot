package com.helpjun.business.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.helpjun.business.test.entity.SysUserEntity;
import com.helpjun.business.test.mapper.SysUserMapper;
import com.helpjun.business.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUserEntity> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUserEntity> findAllUser() {
        return sysUserMapper.findAllUser();
    }
}
