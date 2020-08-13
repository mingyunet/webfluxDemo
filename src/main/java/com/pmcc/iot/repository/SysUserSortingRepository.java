package com.pmcc.iot.repository;

import com.pmcc.iot.domain.SysUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SysUserSortingRepository extends ReactiveCrudRepository<SysUser,String> {
}
