package com.rubbing_map.controller;

import cn.hutool.core.map.MapUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rubbing_map.common.dto.LoginDto;
import com.rubbing_map.common.lang.Result;
import com.rubbing_map.entity.User;
import com.rubbing_map.service.UserService;
import com.rubbing_map.util.JwtUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author 余悸
 */
@RestController
public class AccountController {

    @Autowired
    UserService userService;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/login")
    public Result login(@Validated @RequestBody LoginDto loginDto, HttpServletResponse response) {

        User user = userService.getOne(new QueryWrapper<User>().eq("username", loginDto.getUsername()));
        Assert.notNull(user, "用户不存在");

        if(!user.getPassword().equals(loginDto.getPassword())){
            return Result.fail("密码不正确");
        }
        String jwt = jwtUtils.generateToken(user.getId());
        String timestamp = String.valueOf(loginDto.getNowDate().getTime());
        String eff_time = String.valueOf(loginDto.getExpireDate().getTime());
        String nxt_time = String.valueOf(loginDto.getNext_time().getTime());

        response.setStatus(200);


        return Result.succ(MapUtil.builder()
                .put("userid", loginDto.UUID())
                .put("token", jwt)
                .put("timestamp",timestamp)
                .put("eff-time",eff_time)
                .put("nxt-time",nxt_time)
                .map()
        );
    }

    @RequiresAuthentication
    @GetMapping("/logout")
    public Result logout() {
        SecurityUtils.getSubject().logout();
        return Result.succ(null);
    }

}
