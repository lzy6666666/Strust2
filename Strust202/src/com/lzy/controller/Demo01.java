package com.lzy.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;

/**
 * Project: Strust2
 * Package: com.lzy.controller
 *
 * @author : lzy
 * @date : 2018/10/3 16:39
 */
public class Demo01 extends ActionSupport{

    @Override
    public String execute() throws Exception {
        System.out.println("success");
        ActionContext actionContext = ActionContext.getContext();
        Map<String, Object> parameters = actionContext.getParameters();
        for (String s : parameters.keySet()) {
            String[] strings = (String[]) parameters.get(s);
            System.out.println(s + "" + Arrays.toString(strings));
        }
        actionContext.put("pass","dwed ");
        return SUCCESS;

        /**/
    }
}