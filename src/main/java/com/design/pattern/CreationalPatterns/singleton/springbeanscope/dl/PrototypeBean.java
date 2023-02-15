package com.design.pattern.CreationalPatterns.singleton.springbeanscope.dl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {

  private int count = 0;

  public void addCount() {
    this.count += 1;
  }

  public int getCount() {
    return count;
  }

  @PostConstruct
  public void init() {
    System.out.println("PrototypeBean.init " + this);
  }

  @PreDestroy
  public void destroy() {
    System.out.println("PrototypeBean.destroy");
  }
}
