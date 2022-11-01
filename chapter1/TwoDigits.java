package chapter1;

import java.util.Scanner;

//! 1C-2

public class TwoDigits {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n;

    System.out.println("2자리 양수를 입력하라");

    do {
      System.out.println("2자리 양수 n의 값: ");
      n = scan.nextInt();
    } while (n < 10 || n > 99); // ? 반복을 계속하는 조건
    // ? 드모르간법칙
    // ? !(n >= 10 && n <= 99) '종료 조건'의 부정

    System.out.println(n);
    scan.close();
  }

}
