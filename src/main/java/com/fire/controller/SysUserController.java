package com.fire.controller;

import com.fire.entity.SysUser;
import com.fire.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

/**
 * (SysUser)表控制层
 *
 * @author makejava
 * @since 2020-03-23 21:47:31
 */
@Controller
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne/{id}")
    public SysUser selectOne(@PathVariable("id") String id) {
        return this.sysUserService.queryById(id);
    }

    @PostMapping("/login")
    public String login(SysUser user, Model model, HttpSession session){
        String message = "" ;
        if (Objects.isNull(user)) {
            message = "请输入正确用户名及密码后登陆";
        }
        List<SysUser> list = sysUserService.queryAll(user);
        if (CollectionUtils.isEmpty(list) || list.isEmpty()) {
            message = "用户名或密码输入错误";
        } else {
            session.setAttribute("user",list.get(0));
            return "dashboard";
        }
        model.addAttribute("message",message);
        model.addAttribute("user",user);
        return "login";
    }

}