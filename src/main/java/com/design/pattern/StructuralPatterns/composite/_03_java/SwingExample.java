package com.design.pattern.StructuralPatterns.composite._03_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingExample {

  // 컴포짓 패턴은 서로 다른 노드 또는 primitive type과 그것들을 감싸는 또다른 타입이
  // 둘 다 동일한 interface를 구현하거나 동일한 부모를 상속받은 경우에 찾아볼 수 있다.

  public static void main(String[] args) {
    JFrame frame = new JFrame(); // JFrame -> Frame -> Window -> Container -> Component

    JTextField textField = new JTextField(); // JTextField -> JTextComponent -> JComponent -> Container -> Component
    textField.setBounds(200, 200, 200, 40);
    frame.add(textField);

    JButton button1 = new JButton("up"); // JButton -> AbstractButton -> JComponent -> Container -> Component
    JButton button2 = new JButton("down");
    button1.setBounds(200, 100, 60, 40);
    button2.setBounds(300, 100, 60, 40);
    final int[] index = {0};
    button1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ++index[0];
        textField.setText("Current Index: "+ index[0]);
      }
    });
    frame.add(button1);
    button2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        --index[0];
        textField.setText("Current Index: "+ index[0]);
      }
    });
    frame.add(button2);


    frame.setSize(600, 400);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
