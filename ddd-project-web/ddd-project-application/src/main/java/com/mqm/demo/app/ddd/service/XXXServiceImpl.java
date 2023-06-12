package com.mqm.demo.app.ddd.service;

import com.mqm.demo.api.ddd.dto.XXXDTO;
import com.mqm.demo.api.ddd.req.XXXReq;
import com.mqm.demo.api.ddd.res.XXXRes;
import com.mqm.demo.client.ddd.api.XXXService;
import com.mqm.demo.domain.ddd.gateway.XXXGateway;
import com.mqm.demo.domain.ddd.repository.XXXRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @auhor: mqm
 * @date: 2023/6/9 下午4:28
 */
@Service
public class XXXServiceImpl implements XXXService {
  @Autowired
  private XXXGateway xxxGateway;
  @Autowired
  private XXXRepository xxxRepository;

  @Override
  public XXXRes query(XXXReq req) {

    return null;
  }

  @Override
  public XXXDTO save(XXXDTO dto) {
    return null;
  }
}
