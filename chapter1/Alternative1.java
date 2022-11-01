package chapter1;

import java.util.Scanner;

public class Alternative1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = 0;

    do {
      System.out.print("n의 값: ");
      n = scan.nextInt();
    } while (n <= 0);

    // for (int i = 0; i <= n; i++) { //?2가지 문제점 있음
    // if (i % 2 == 0) { //?반복할때마다 if문 실행
    // System.out.print("+"); //?변경할때 유연한 대응 어렵
    // } else {
    // System.out.print("-");
    // }

    // for (int i = 1; i <= n; i++) {
    // if (i % 2 == 0) {
    // System.out.print("+");
    // } else {
    // System.out.print("-");
    // } //?홀수일떄

    for (int i = 0; i < n / 2; i++) {
      System.out.print("+-");
    }
    // ? 1부터 시작일때
    // for (int i = 1; i <= n / 2; i++) {
    // System.out.print("+-");
    // }

    if (n % 2 != 0) {
      System.out.println("+");
    }
    scan.close();
  }
}
