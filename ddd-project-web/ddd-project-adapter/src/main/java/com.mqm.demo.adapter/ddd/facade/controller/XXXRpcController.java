package com.mqm.demo.adapter.ddd.facade.controller;

import com.mqm.demo.api.ddd.XXXRpcApi;
import com.mqm.demo.api.ddd.dto.XXXDTO;
import com.mqm.demo.api.ddd.req.XXXReq;
import com.mqm.demo.api.ddd.res.XXXRes;
import com.mqm.demo.client.ddd.api.XXXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: DDD接口实现类
 * @auhor: mqm
 * @date: 2023/6/8 下午4:44
 */
@RestController
public class XXXRpcController implements XXXRpcApi {
  @Autowired
  XXXService xxxService;

  @Override
  public XXXRes query(XXXReq req) {
    return xxxService.query(req);
  }

  @Override
  public XXXDTO save(XXXDTO dto) {
    return null;
  }
}
