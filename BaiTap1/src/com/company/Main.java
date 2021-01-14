package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float a,b,c;
	Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        a = sc.nextInt();
        System.out.println("Input b");
        b = sc.nextInt();
        c = a/b;
        if (b==0){
            System.out.println("Error");
        } else {
            System.out.println("c= "+c);
        }
    }
}
