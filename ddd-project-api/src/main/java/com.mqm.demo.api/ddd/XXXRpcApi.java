package com.mqm.demo.api.ddd;

import com.mqm.demo.api.ddd.dto.XXXDTO;
import com.mqm.demo.api.ddd.req.XXXReq;
import com.mqm.demo.api.ddd.res.XXXRes;

/**
 * @Description: RPC接口
 * @auhor: mqm
 * @date: 2023/6/8 下午4:49
 */
public interface XXXRpcApi {

  XXXRes query(XXXReq req);

  XXXDTO save(XXXDTO dto);
}
