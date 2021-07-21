package com.sunhongyu.service.impl;

import com.sunhongyu.entity.User;
import com.sunhongyu.mapper.UserMapper;
import com.sunhongyu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 孙宏宇
 * @since 2021-07-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
