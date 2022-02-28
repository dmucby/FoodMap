package com.rubbing_map.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author 余悸
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_project")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pid",type = IdType.AUTO)
    private Long pid;

    @NotBlank(message = "项目名不能为空")
    private String name;

    private String createDate;

    private String lastDate;

    private String userid;

}
