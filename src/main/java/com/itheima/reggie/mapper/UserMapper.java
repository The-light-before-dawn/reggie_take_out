package com.itheima.reggie.mapper;

import com.itheima.reggie.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2024-05-11
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
