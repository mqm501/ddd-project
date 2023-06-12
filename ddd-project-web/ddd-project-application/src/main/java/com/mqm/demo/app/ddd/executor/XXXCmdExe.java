package com.mqm.demo.app.ddd.executor;

import com.mqm.demo.api.ddd.dto.XXXDTO;
import com.mqm.demo.app.ddd.assembler.XXXAssember;
import com.mqm.demo.domain.ddd.gateway.XXXGateway;
import com.mqm.demo.domain.ddd.model.entity.XXXEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @auhor: mqm
 * @date: 2023/6/8 下午5:49
 */
@Component
public class XXXCmdExe {
  @Autowired
  private XXXGateway xxxGateway;
//  @Autowired
//  private XXXRepository xxxRepository;

  public XXXDTO save(XXXDTO dto){
    XXXEntity xxxEntity = XXXAssember.INSTANCE.convert2Entity(dto);
    xxxGateway.save(xxxEntity);
    return null;
  }
}
