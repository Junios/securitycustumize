package net.junios.securitycustumize.controller;


import lombok.extern.slf4j.Slf4j;
import net.junios.securitycustumize.domain.Authority;
import net.junios.securitycustumize.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;

@Slf4j
@Controller
public class UserController {
    @GetMapping("/")
    @ResponseBody
    String index() {
        return "hello world!";
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @GetMapping("/hello")
    @ResponseBody
    String hello() {
        return "hello world!";
    }

}
