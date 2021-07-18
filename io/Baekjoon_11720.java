package io;

import java.util.Scanner;

public class Baekjoon_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String input = sc.next(); //전에 nextInt가 있을 때 nextLine 쓰지 않기
        sc.close();

        int sum = 0;
        for(int i=0; i<T; i++){
            sum += input.charAt(i) - '0'; //1 아스키코드 49, 0 아스키코드 48
        }
        System.out.println(sum);
    }
}
