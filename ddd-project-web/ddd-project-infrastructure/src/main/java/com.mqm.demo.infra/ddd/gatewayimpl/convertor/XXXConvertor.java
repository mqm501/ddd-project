package com.mqm.demo.infra.ddd.gatewayimpl.convertor;

import com.mqm.demo.domain.ddd.model.entity.XXXEntity;
import com.mqm.demo.infra.ddd.gatewayimpl.dataobject.XXXDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Description:
 * @auhor: mqm
 * @date: 2023/6/8 下午7:11
 */
@Mapper
public interface XXXConvertor {
  XXXConvertor INSTANCE = Mappers.getMapper(XXXConvertor.class);

  XXXEntity convert2Entity(XXXDO dataObject);

  XXXDO convert2DO(XXXEntity entity);
}
