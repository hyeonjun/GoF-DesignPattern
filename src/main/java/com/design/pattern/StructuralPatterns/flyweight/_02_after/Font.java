package com.design.pattern.StructuralPatterns.flyweight._02_after;

// instrinsic한 데이터
public final class Font {

  // 주의. Flyweight에 해당하는 인스턴스는 immutable해야 한다. -> 누가 받아서 값을 변경할 수 있으면 안된다.
  // 그래서 클래스의 상속을 막히 위해 final, 필드들에도 final을 붙인 후
  // 생성자를 통해 값을 넣고, getter만 사용할 수 있도록 한다.
  final String family;
  final int size;

  public Font(String family, int size) {
    this.family = family;
    this.size = size;
  }

  public String getFamily() {
    return family;
  }

  public int getSize() {
    return size;
  }
}
