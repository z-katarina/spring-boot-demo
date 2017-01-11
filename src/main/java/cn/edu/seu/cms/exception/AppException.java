package cn.edu.seu.cms.exception;

/**
 * Created by hzzhouxiaotian
 * Data: 2017/1/11
 */
public class AppException extends RuntimeException {

    public AppException() {
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(Throwable cause) {
        super(cause);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
