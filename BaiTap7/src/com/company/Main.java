package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. CF");
        System.out.println("2. C");
        System.out.println("3. HDJ");
        System.out.println("4. DreamWeaver");
        System.out.println("5. RDBMS");
        System.out.println("6. Learn Java by example");
        System.out.println("==========================");
        System.out.println("Chon:");
        Scanner sc = new Scanner(System.in);
        int nhap;
        nhap = sc.nextInt();
        switch (nhap){
            case 1:
                System.out.println("Ban Chon CF");
                break;
            case 2:
                System.out.println("Ban Chon C");
                break;
            case 3:
                System.out.println("Ban Chon HDJ");
                break;
            case 4:
                System.out.println("Ban Chon DreamWeaver");
                break;
            case 5:
                System.out.println("Ban Chon RDBMS");
                break;
            case 6:
                System.out.println("Ban Chon Learn Java by example");
                break;
            default:
                System.out.println("Ban da chon sai");
        }
    }
}
