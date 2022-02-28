package com.rubbing_map.controller;


import cn.hutool.core.map.MapUtil;
import com.rubbing_map.common.dto.ProjectDto;
import com.rubbing_map.common.lang.Result;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 余悸
 */
@RestController
public class ProjectController {

    @RequiresAuthentication
    @PostMapping("/getUserProjectsList")
    public Result userProjectList(@RequestParam(defaultValue = "1") Integer currentPage,@Validated @RequestBody ProjectDto projectDto){



        List<Map<Object, Object>> projectsList = new ArrayList<>();


//
//
//        projectsList.add(MapUtil.builder()
//        .put( "PID" ,1)
//        .put("name","实验项目1")
//        .put("create-date","2022-02-17 12:57:68")
//        .put( "last-date","2022-02-18 15:54:22")
//        .map()
//        );
//
//        projectsList.add(MapUtil.builder()
//                .put( "PID" ,15)
//                .put("name","xx班蹭饭图")
//                .put("create-date","2022-02-02 18:56:59")
//                .put( "last-date","2022-02-10 17:55:32")
//                .map()
//        );
//
        return Result.succ(MapUtil.builder()
                .put("projectsList",projectsList)
                .map()
        );

    }

    @RequiresAuthentication
    @PostMapping("/CreateProjectsList")
    public Result crateUserProject(@Validated @RequestBody ProjectDto projectDto,@RequestBody String projectName){
        return Result.succ(null);
    }

//    @PostMapping("/getUserProjectsList")
//    public Result UserProjectList(@Validated @){
//
//        return Result.succ(null);
//    }

}
