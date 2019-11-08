package com.example.lib;

import java.util.Scanner;
public class hw4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input what you want to calculation");
        int sec = sc.nextInt();
        int h = sec / 3600;
        int m = sec % 3600 / 60;
        int s = sec % 60;
        System.out.println(h+"hour"+m+"min"+s+"sec");
    }
}
