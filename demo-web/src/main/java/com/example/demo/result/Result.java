package com.example.demo.result;/**
 * Created by renjp on 2018/11/16.
 */

/**
 * @author renjp
 * @Date 2018/11/16 17:54
 * @Version 1.0
 */
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data) {

        Result<T> result = new Result<T>();
        result.setData(data);
        result.setMsg("操作成功。");
        result.setCode(0);
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
