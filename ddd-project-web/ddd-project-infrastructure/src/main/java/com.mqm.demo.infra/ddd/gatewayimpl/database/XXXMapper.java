package com.mqm.demo.infra.ddd.gatewayimpl.database;

import com.mqm.demo.domain.ddd.model.entity.XXXEntity;
import com.mqm.demo.infra.ddd.gatewayimpl.dataobject.XXXDO;

/**
 * @Description:
 * @auhor: mqm
 * @date: 2023/6/8 下午7:00
 */
public interface XXXMapper {

  XXXDO getXXX();

  boolean insert(XXXDO xxxdo);

  boolean update(XXXDO xxxdo);
}
