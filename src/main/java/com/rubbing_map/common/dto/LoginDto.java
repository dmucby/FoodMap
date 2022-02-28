package com.rubbing_map.common.dto;

import cn.hutool.core.lang.UUID;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 余悸
 */
@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

    private String userId;

    Date nowDate = new Date();
    //过期时间
    Date expireDate = new Date(nowDate.getTime() + 1800 * 1000);
    //next
    Date next_time =  new Date(nowDate.getTime() + 1500 * 1000);

    public Date getNowDate() {
        return nowDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public Date getNext_time() {
        return next_time;
    }
    public String UUID(){
        return UUID.randomUUID().toString();
    }
}
