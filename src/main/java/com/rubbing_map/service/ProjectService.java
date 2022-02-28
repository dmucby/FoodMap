package com.rubbing_map.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rubbing_map.entity.Project;
import com.rubbing_map.entity.User;

/**
 * @author 余悸
 */
public interface ProjectService extends IService<Project> {
   Project[] listByIds(QueryWrapper<User> userid);
}
