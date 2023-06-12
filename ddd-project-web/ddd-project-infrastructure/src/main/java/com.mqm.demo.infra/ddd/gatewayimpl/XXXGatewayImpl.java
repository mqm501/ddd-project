package com.mqm.demo.infra.ddd.gatewayimpl;

import com.mqm.demo.domain.ddd.gateway.XXXGateway;
import com.mqm.demo.domain.ddd.model.entity.XXXEntity;
import com.mqm.demo.infra.ddd.gatewayimpl.convertor.XXXConvertor;
import com.mqm.demo.infra.ddd.gatewayimpl.database.XXXMapper;
import com.mqm.demo.infra.ddd.gatewayimpl.dataobject.XXXDO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @auhor: mqm
 * @date: 2023/6/9 下午7:05
 */
@Component
public class XXXGatewayImpl implements XXXGateway {

  @Resource
  XXXMapper xxxMapper;

  @Override
  public boolean save(XXXEntity entity) {
    XXXDO xxxdo = XXXConvertor.INSTANCE.convert2DO(entity);
    return xxxMapper.insert(xxxdo);
  }
}
