package com.rubbing_map.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 余悸
 */
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}
