package com.example.lmc.common;

/**
 * @author lmc
 * @date 2020/8/2 15:30
 */
public enum ResultEnum {
    //成功
    SUCCESS(00,"成功"),

    //1.客户端类错误
    PARAMS_ERROR(11,"参数错误"),


    //2.服务器类错误
    DATA_IS_NULL(22, "数据为空"),
    DATA_QUERY(23, "查询错误"),
    DATA_ADD(24, "添加失败"),
    DATA_UPDATE(25, "更新失败"),


    //3.系统内部错误
    UNKNOWN_ERROR(33,"未知错误"),



    ;
    private Integer code;
    private String msg;


    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
