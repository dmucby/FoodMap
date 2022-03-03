package com.rubbing_map.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 余悸
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_project")
public class Project implements Serializable {

    @TableId(value = "pid",type = IdType.AUTO)
    private Long pid;

    @NotBlank(message = "项目名不能为空")
    private String name;

    @TableField(fill = FieldFill.INSERT)
    private Date create_date;

    @TableField(fill = FieldFill.UPDATE)
    private Date last_date;

    @Version
    private  Integer version;

    private String userid;

}
