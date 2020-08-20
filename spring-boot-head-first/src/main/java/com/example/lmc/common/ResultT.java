package com.example.lmc.common;

/**
 * @author lmc
 * @date 2020/8/2 15:02
 */
public class ResultT<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResultT() {
        super();
    }

    public static <T> ResultT success(T data) {
        return new ResultT(200, "success", data);
    }

    public static ResultT error(Integer code, String msg) {
        return new ResultT(code, msg, null);
    }

    public static ResultT error(ResultEnum resultEnum) {
        return new ResultT(resultEnum.getCode(), resultEnum.getMsg(), null);
    }

    public ResultT(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
