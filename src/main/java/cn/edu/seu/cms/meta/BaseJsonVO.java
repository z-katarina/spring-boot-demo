package cn.edu.seu.cms.meta;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by hzzhouxiaotian
 * Data: 2017/1/10
 */
@Data
public class BaseJsonVO implements Serializable {

    private int code;
    private String message;
    private Object result;

    public static BaseJsonVO newError(int code, String message) {
        BaseJsonVO error = new BaseJsonVO();
        error.setCode(code);
        error.setMessage(message);
        return error;
    }

    public static BaseJsonVO newSuccess() {
        BaseJsonVO baseJsonVO = new BaseJsonVO();
        baseJsonVO.setCode(200);
        baseJsonVO.setMessage("OK");
        return baseJsonVO;
    }

    public static BaseJsonVO newSuccess(Object result) {
        BaseJsonVO baseJsonVO = new BaseJsonVO();
        baseJsonVO.setCode(200);
        baseJsonVO.setMessage("ok");
        baseJsonVO.setResult(result);
        return baseJsonVO;
    }
}
