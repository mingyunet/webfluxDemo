package com.pmcc.iot.service.system;

import com.pmcc.iot.domain.SysUser;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SysUserService {
    Mono<SysUser> findUserById(String userId);
    Flux<SysUser> findAll();
}
