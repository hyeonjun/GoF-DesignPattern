package com.design.pattern.CreationalPatterns.abstractfactory._03_java;

import java.io.File;
import java.io.IOException;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class DocumentBuilderFactoryExample {

  public static void main(String[] args)
    throws ParserConfigurationException, IOException, SAXException {
    // 구체적인 인스턴스가 아닌 추상적인 인스턴스를 사용
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse(new File("src/main/resources/config.xml"));
    System.out.println(document.getDocumentElement());
  }

}
