package com.rubbing_map.util;

import com.rubbing_map.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author 余悸
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
