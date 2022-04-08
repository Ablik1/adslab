package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(checknumbr(num));
    }
    static String checknumbr(int n) {
     String check = "prime";
     if (n==0|| n==1 ) {
         //if num is 0 or 1
         check = "nor prime or composite";
     }
     if(n>0){
         for(int i=2; i<n/2; i++){
             //if num divide on 2 and more numbers is composite 
             if(n%i==0){
                 check = "composite";
                 break;
             }
         }
     }else if(n<0){
         for(int i=-2; i>n/2; i--){
             if(n%i==0){
                 //if num divide on 2 and more numbers is composite
                 check = "composite";
                 break;
             }
         }
     }
     //vo vseh ostalnyh slychyah is prime
     return n+" is "+ check;
    }
}