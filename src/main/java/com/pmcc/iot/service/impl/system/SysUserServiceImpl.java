package com.pmcc.iot.service.impl.system;

import com.pmcc.iot.domain.SysUser;
import com.pmcc.iot.repository.SysUserSortingRepository;
import com.pmcc.iot.service.system.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserSortingRepository sysUserSortingRepository;

    @Override
    public Mono<SysUser> findUserById(String userId) {
        return sysUserSortingRepository.findById(userId);
    }

    @Override
    public Flux<SysUser> findAll() {
        return sysUserSortingRepository.findAll();
    }
}
