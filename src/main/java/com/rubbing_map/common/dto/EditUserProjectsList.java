package com.rubbing_map.common.dto;

import lombok.Data;

import javax.validation.Valid;

/**
 * @author 余悸
 */

@Data

public class EditUserProjectsList extends ProjectDto{

    @Valid
    private ProjectInfo project_info;
}
