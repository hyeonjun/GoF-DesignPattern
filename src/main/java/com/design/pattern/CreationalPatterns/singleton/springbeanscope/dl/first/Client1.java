package com.design.pattern.CreationalPatterns.singleton.springbeanscope.dl.first;

import com.design.pattern.CreationalPatterns.singleton.springbeanscope.dl.PrototypeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Client1 {

  // ClientBean에서 applicationContext 자체를 주입받아서 직접 요청
  @Autowired
  private ApplicationContext applicationContext;

  public int logic() {
    PrototypeBean prototypeBean = applicationContext.getBean(PrototypeBean.class);
    prototypeBean.addCount();
    return prototypeBean.getCount();
  }
}
