package com.aug.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@ResultPath(value = "/")
public class MainAction extends ActionSupport{

    @Action(value = "initMain", results = {
            @Result(name = "input", location = "pages/main.jsp")
    })
    public String init() {
        return INPUT;
    }
}