package com.shsxt.crm.base;

import com.shsxt.crm.model.ResultInfo;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

public class BaseController {


    /**用于设置resultInfo的值*/
    public ResultInfo success(Integer code, String msg, Object result){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(code);
        resultInfo.setMsg(msg);
        resultInfo.setResult(result);
        return resultInfo;
    }
    public ResultInfo success(Integer code, String msg){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(code);
        resultInfo.setMsg(msg);
        return resultInfo;
    }
    public ResultInfo success(String msg){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(msg);
        return resultInfo;
    }
    public ResultInfo success(Integer code){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(code);
        return resultInfo;
    }

    /**用于设置文件上下文的路径*/
    @ModelAttribute
    public void preMethod(HttpServletRequest request){
        request.setAttribute("ctx",request.getContextPath());
        request.setAttribute("uri",request.getRequestURI());

    }


}
