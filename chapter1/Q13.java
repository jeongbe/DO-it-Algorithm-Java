package chapter1;

import java.util.Scanner;

public class Q13 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n;

    System.out.print("변의 길이 = ");
    n = scan.nextInt();

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= n; j++) {
        System.out.print("*");

      }
      System.out.println();
    }

    scan.close();
  }
}
