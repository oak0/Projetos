package br.com.login.control;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("request")
public class RedirectorBean {
    public String userPage() {
        return "/pages/user/userPage";
    }
 
    public String adminPage() {
        return "/pages/admin/adminPage";
    }
 
    public String index() {
        return "/index";
    }
 
    public String successfulPage() {
        return "/pages/successfulPage";
    }
}