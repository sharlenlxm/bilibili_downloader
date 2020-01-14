package bilibili.api.model.vc.recommend;

import com.alibaba.fastjson.annotation.JSONField;

public class Recommend {

    @JSONField(name = "msg")
    private String msg;

    @JSONField(name = "code")
    private String code;

    @JSONField(name = "data")
    private Data data;

    @JSONField(name = "message")
    private String message;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return
                "Recommend{" +
                        "msg = '" + msg + '\'' +
                        ",code = '" + code + '\'' +
                        ",data = '" + data + '\'' +
                        ",message = '" + message + '\'' +
                        "}";
    }
}