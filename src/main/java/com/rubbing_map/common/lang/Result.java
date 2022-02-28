package com.rubbing_map.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 余悸
 */
@Data
public class Result  implements Serializable {

    private int code; // 0是正常，-1表示异常
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        return succ(0, "ok", data);
    }

    public static Result succ(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg) {
        return fail(-1, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return fail(-1, msg, data);
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

}
