package com.rubbing_map.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rubbing_map.entity.Project;
import com.rubbing_map.entity.User;
import com.rubbing_map.mapper.ProjectMapper;
import com.rubbing_map.service.ProjectService;
import org.springframework.stereotype.Service;

/**
 * @author 余悸
 */

@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements ProjectService {

}