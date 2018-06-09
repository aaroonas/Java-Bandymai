package com.company;

import java.util.Scanner;

public class Diena {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = (sc.nextInt() / 10) % 10;
    //int a = (N / 10) % 10;
    System.out.print(N);

  }
}