package com.mqm.demo.client.ddd.api;

import com.mqm.demo.api.ddd.dto.XXXDTO;
import com.mqm.demo.api.ddd.req.XXXReq;
import com.mqm.demo.api.ddd.res.XXXRes;

/**
 * @Description:
 * @auhor: mqm
 * @date: 2023/6/9 下午4:27
 */
public interface XXXService {

  XXXRes query(XXXReq req);

  XXXDTO save(XXXDTO dto);
}
