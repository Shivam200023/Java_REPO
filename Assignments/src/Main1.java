class Num {
  int number;

  public Num(int number) {
      this.number = number;
  }

  public void shownum() {
      System.out.println("Decimal: " + number);
  }
}

class HexNum extends Num {
  public HexNum(int number) {
      super(number);
  }

  @Override
  public void shownum() {
      System.out.println("Hexadecimal: " + Integer.toHexString(number));
  }
}

class OctNum extends Num {
  public OctNum(int number) {
      super(number);
  }

  @Override
  public void shownum() {
      System.out.println("Octal: " + Integer.toOctalString(number));
  }
}

public class Main1 {
  public static void main(String[] args) {
      Num num1 = new Num(10);
      num1.shownum();  // Output: Decimal: 10

      HexNum hex_num = new HexNum(255);
      hex_num.shownum();  // Output: Hexadecimal: ff

      OctNum oct_num = new OctNum(64);
      oct_num.shownum();  // Output: Octal: 100
  }
}
