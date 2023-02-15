package com.design.pattern.CreationalPatterns.singleton.springbeanscope.dl.second;

import com.design.pattern.CreationalPatterns.singleton.springbeanscope.dl.PrototypeBean;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client2 {

  @Autowired
  private ObjectProvider<PrototypeBean> prototypeBeans;

  public int logic() {
    PrototypeBean prototypeBean = prototypeBeans.getObject(); // getObject() 를 통해 항상 새로운 빈 생성
    prototypeBean.addCount();
    return prototypeBean.getCount();
  }

}
