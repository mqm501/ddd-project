package com.mqm.demo.infra.ddd.gatewayimpl.repository;

import com.mqm.demo.domain.ddd.repository.XXXRepository;
import com.mqm.demo.infra.ddd.gatewayimpl.database.XXXMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @auhor: mqm
 * @date: 2023/6/8 下午7:42
 */
@Repository
public class XXXRepositoryImpl implements XXXRepository {

  @Resource
  XXXMapper xxxMapper;


}
