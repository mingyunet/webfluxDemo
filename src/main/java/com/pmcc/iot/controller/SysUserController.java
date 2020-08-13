package com.pmcc.iot.controller;

import com.pmcc.iot.domain.SysUser;
import com.pmcc.iot.service.system.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 返回指定用户
     * @param id 用户id
     * @return Mono<SysUser>
     */
    @GetMapping("/{id}")
    public Mono<SysUser> findUserById(@PathVariable String id) {
        return sysUserService.findUserById(id);
    }

    /**
     * 返回所有用户
     * @return Flux<SysUser>
     */
    @GetMapping("/all")
    public Flux<SysUser> findUserById() {
        return sysUserService.findAll();
    }
}
