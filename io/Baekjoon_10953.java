package io;

import java.util.Scanner;

public class Baekjoon_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i=1; i<=num; i++) {
            String[] arr = sc.next().split(",");
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
    }
}
