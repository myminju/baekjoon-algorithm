package io;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int a;
        int b;

        StringTokenizer st;
        for (int i=1; i<=T; i++) {
            st = new StringTokenizer(br.readLine(), ""  );

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #"+i+": ");
            bw.write(a + " + " + b + " = ");
            bw.write((a+b) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public void sol() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i=1; i<=num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
        }
        sc.close(); //Don't forget
    }
}
