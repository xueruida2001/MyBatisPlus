package com.mybatisplus.mappers;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mybatisplus.pojo.User;

/*
* 在mybatis中，mapper和service方法都是需要自己来写的
* 但是在MyBatisPlus中，对于单表的查询可以直接通过继承BaseMapper来实现
* */
public interface UserMapper extends BaseMapper<User> {


}
