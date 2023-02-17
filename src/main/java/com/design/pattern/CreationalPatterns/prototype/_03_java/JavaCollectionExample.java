package com.design.pattern.CreationalPatterns.prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

  public static void main(String[] args) {
    Student a = new Student("a");
    Student b = new Student("b");
    ArrayList<Student> students = new ArrayList<>();
    students.add(a);
    students.add(b);

    // 보통 ArrayList 같은 경우 List<>를 사용하는데, List는 Cloneable을 상속받고 있지 않음
    ArrayList<Student> clone = (ArrayList<Student>) students.clone(); // 자주 쓰이지 않음
    System.out.println(clone);

    // Prototype을 쓰는 것은 아니지만, 얕은 복사를 하는 방법
    List<Student> clone1 = new ArrayList<>(students);
    System.out.println(clone1);
  }

}
