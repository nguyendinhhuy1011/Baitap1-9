package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhap so thu nhat:6");
        System.out.println("Nhap so thu hai:5");
        System.out.println("            MENU       ");
        System.out.println("=========================");
        System.out.println("+");
        System.out.println("-");
        System.out.println("x");
        System.out.println(":");
        System.out.println("=========================");
        System.out.println("Chon:");
        float a = 6;
        float b = 5;
        Scanner sc = new Scanner(System.in);
        char kytu;
        kytu = sc.next().charAt(0);
        switch (kytu){
            case '+':
                System.out.println("6+5= "+ (a+b));
                break;
            case '-':
                System.out.println("6-5="+ (a-b));
                break;
            case ':':
                System.out.println("6:5="+ (a/b));
                break;
            case 'x':
                System.out.println("6x5="+ (a*b));
                break;
            default:
                System.out.println("Ban nhap sai roi");
        }
    }
}
