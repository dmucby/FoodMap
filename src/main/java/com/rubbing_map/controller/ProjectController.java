package com.rubbing_map.controller;


import cn.hutool.core.map.MapUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rubbing_map.common.dto.CreateProjectDto;
import com.rubbing_map.common.dto.EditUserProjectsList;
import com.rubbing_map.common.dto.ProjectDto;
import com.rubbing_map.common.lang.Result;
import com.rubbing_map.entity.Project;
import com.rubbing_map.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 余悸
 */
@RestController
public class ProjectController {

    @Autowired
    ProjectMapper projectMapper;

    //@RequiresAuthentication
    @PostMapping("/getUserProjectsList")
    public Result userProjectList(@Validated @RequestBody ProjectDto projectDto){

        QueryWrapper<Project> wrapper = new QueryWrapper<>();

        wrapper.eq("userid",projectDto.getUserid());

        List<Project> projectsList = projectMapper.selectList(wrapper);

        return Result.succ(MapUtil.builder()
                .put("projectsList",projectsList)
                .map()
        );

    }

    //@RequiresAuthentication
    @PostMapping("/createUserProject")
    public Result crateUserProject(@Validated @RequestBody CreateProjectDto createProjectDto){

        Project project = new Project();
        project.setUserid(createProjectDto.getUserid());
        project.setName(createProjectDto.getName());

        projectMapper.insert(project);

        return Result.succ(null);
    }



    @PostMapping("/editUserProjectsList")
    public Result UserProjectList(@Validated @RequestBody EditUserProjectsList edit){

        Project project = new Project();
        project.setUserid(edit.getUserid());
        project.setPid(edit.getProject_info().getPid());
        project.setName(edit.getProject_info().getName());
        projectMapper.updateById(project);

        return Result.succ(null);
    }

}
