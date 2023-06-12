package com.mqm.demo.adapter.ddd.facade.controller;

import com.mqm.demo.api.ddd.dto.XXXDTO;
import com.mqm.demo.client.ddd.api.XXXService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: DDD接口实现类
 * @auhor: mqm
 * @date: 2023/6/8 下午4:44
 */
@RestController
@RequestMapping("xxx/web/")
public class XXXWebController {
  @Autowired
  XXXService xxxService;

  @PostMapping("/save")
  public XXXDTO save(XXXDTO dto) {
    return null;
  }

  @GetMapping("/get")
  public XXXDTO get() {
    return null;
  }

  @GetMapping("/list")
  public List<XXXDTO> list() {
    return null;
  }

//  @GetMapping("/page")
//  public Page<XXXDTO> page() {
//    return null;
//  }

  @GetMapping("/count")
  public Integer count() {
    return null;
  }
}
