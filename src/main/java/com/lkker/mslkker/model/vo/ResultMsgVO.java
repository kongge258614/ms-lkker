package com.lkker.mslkker.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @description:
 * @author: liliang
 * @date: 2019-04-25 22:20
 */
@ApiModel(description = "结果信息")
public class ResultMsgVO implements Serializable{
    private static final long serialVersionUID = 3146700731655578585L;

    @ApiModelProperty("结果状态码")
    private int code;

    @ApiModelProperty("请求返回信息")
    private String msg;

    @ApiModelProperty("请求返回结果")
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
