package chapter1;

import java.util.Scanner;

public class SumVerbose1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = 0;

    System.out.println("1부터 n까지의 합을 구합니다.");

    do {
      System.out.print("n의 값: ");
      n = scan.nextInt();
    } while (n <= 0);

    int sum = 0;

    for (int i = 1; i < n; i++) {
      System.out.print(i + " + ");
      sum += i;

    }
    System.out.println(n + " = " + (sum += n));
    // b = a = 1 -> b = 1
    scan.close();
  }

}
