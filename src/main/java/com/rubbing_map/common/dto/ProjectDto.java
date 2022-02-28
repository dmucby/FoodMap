package com.rubbing_map.common.dto;

import com.rubbing_map.entity.Project;
import lombok.Data;

/**
 * @author 余悸
 */

@Data
public class ProjectDto {

    private String userId;

    private String token;

    private Project[] projects;

}
