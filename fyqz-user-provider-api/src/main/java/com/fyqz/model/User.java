package com.fyqz.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.fyqz.base.BaseModel;
import lombok.Data;

@Data
public class User extends BaseModel{

    @TableId("name")
    private String name;

    @TableId("msg")
    private String msg;
}