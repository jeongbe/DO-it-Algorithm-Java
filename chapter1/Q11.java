package chapter1;

public class Q11 {
  public static void main(String[] args) {
    System.out.println("구구단 표");

    for (int i = 1; i <= 9; i++) {
      System.out.print(i);
      System.out.printf("|");
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%3d", i * j);
      }

      System.out.println();
    }
  }
}
