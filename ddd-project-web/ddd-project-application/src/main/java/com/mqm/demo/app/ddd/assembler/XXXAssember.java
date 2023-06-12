package com.mqm.demo.app.ddd.assembler;

import com.mqm.demo.api.ddd.dto.XXXDTO;
import com.mqm.demo.domain.ddd.model.entity.XXXEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Description:
 * @auhor: mqm
 * @date: 2023/6/9 下午6:13
 */
@Mapper
public interface XXXAssember {
  XXXAssember INSTANCE = Mappers.getMapper(XXXAssember.class);

  XXXDTO convert2DTO(XXXEntity entity);

  XXXEntity convert2Entity(XXXDTO xxxdto);
}
