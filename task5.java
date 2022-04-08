package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(findfib(num));
    }
    static int findfib(int n) {
       int x=0;
       int y = 1;
       int sum;
        if (n == 0)
            return x;
        for (int i=2; i<=n;i++) {
        sum=x+y;
        x=y;
        y=sum;
        }
        return y;
    }
}