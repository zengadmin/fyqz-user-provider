package com.fyqz.model;

import com.fyqz.base.BaseModel;
import lombok.Data;

@Data
public class User extends BaseModel{
    private String name;
    private String msg;
}