package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int degree = scan.nextInt();

        System.out.println(abpow(num,degree));
    }
    static int abpow(int a,int b) {
       if(b==0)
           return 1;
       else if (b%2==0)
           return abpow(a,b/2)*abpow(a,b/2);
       else
           return a* abpow(a,b/2)*abpow(a,b/2);

    }
}
