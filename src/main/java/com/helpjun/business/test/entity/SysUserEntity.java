package com.helpjun.business.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class SysUserEntity implements Serializable {
    private String id;
    private String username;
    private String realname;
}
