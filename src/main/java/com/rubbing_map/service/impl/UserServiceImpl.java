package com.rubbing_map.service.impl;

import com.rubbing_map.entity.User;
import com.rubbing_map.mapper.UserMapper;
import com.rubbing_map.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 余悸
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
