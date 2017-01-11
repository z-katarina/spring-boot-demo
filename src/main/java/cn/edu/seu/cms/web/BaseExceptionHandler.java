package cn.edu.seu.cms.web;

import cn.edu.seu.cms.exception.AppException;
import cn.edu.seu.cms.meta.BaseJsonVO;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hzzhouxiaotian
 * Data: 2017/1/10
 * Desc: 统一异常处理
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName("error");
        return mav;
    }

    @ExceptionHandler(value = {AppException.class, MethodArgumentNotValidException.class})
    @ResponseBody
    public BaseJsonVO defaultErrorHandler(Exception e) {
        return BaseJsonVO.newError(500, e.getMessage());
    }
}
