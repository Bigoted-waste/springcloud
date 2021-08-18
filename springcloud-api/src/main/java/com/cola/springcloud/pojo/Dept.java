package com.cola.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)    //链式写法
public class Dept implements Serializable { //实体类
    private Long deptno;    //主键
    private String dname;

    //这个数据字段存在哪个数据的字段 ～微服务 一个服务对应一个数据库,
    private String db_source;

    public Dept(String dname) {
        this.dname=dname;
    }

    /*
    链式写法
    Dept dept =new Dept();

    dept.setDeptNo(11).setDname('x');
     */
}
