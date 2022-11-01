package chapter1;

import java.util.Scanner;

//! 1-15

public class PrintStars {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n;
    int w = 0;

    System.out.println("*을 n개 출력하돼 2개마다 줄을 바꿔서 출력합니다. ");

    do {
      System.out.print("n값: ");
      n = scan.nextInt();
    } while (n <= 0);

    do {
      System.out.print("w값: ");
      w = scan.nextInt();
    } while (w <= 0 || w > n);

    // for (int i = 0; i < n; i++) {
    // System.out.print("*");
    // if (i % w == w - 1)
    // System.out.println(); // 줄바꿈
    // }
    // if (n % w != 0) // ?n값이 w값의 배수가 아닐때 줄바꿈함
    // System.out.println();

    for (int i = 0; i < n / w; i++) {
      System.out.println("*".repeat(w));
    }

    int rest = n % w;
    if (rest != 0) {
      System.out.println("*".repeat(rest));
    }
    scan.close();
  }
}
