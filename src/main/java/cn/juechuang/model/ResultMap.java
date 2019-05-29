package cn.juechuang.model;

public class ResultMap {
    private String msg;
    private Integer code;
    private Object data;

    public ResultMap() {
    }

    public ResultMap(String msg, Integer code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public static ResultMap ok(Object data){
        return  new ResultMap("成功",200,data);
    }

    public static ResultMap fail(Object data){
        return  new ResultMap("失败",500,data);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getcode() {
        return code;
    }

    public void setcode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
