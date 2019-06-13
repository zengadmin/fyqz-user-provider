package com.fyqz.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable{
    private Integer personId;
    private String name;
    private int age;
    private String msg;
}