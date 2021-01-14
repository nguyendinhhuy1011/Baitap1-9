package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xA,yA,xB,yB,xC,yC;
        System.out.println("Nhap xA");
        xA = sc.nextDouble();
        System.out.println("Nhap yA");
        yA = sc.nextDouble();
        System.out.println("Nhap xB");
        xB = sc.nextDouble();
        System.out.println("Nhap yB");
        yB = sc.nextDouble();
        System.out.println("Nhap xC");
        xC = sc.nextDouble();
        System.out.println("Nhap yC");
        yC = sc.nextDouble();
        double AB,AC,BC;
        AB = Math.sqrt(Math.pow((xB-xA),2)+Math.pow(yB-yA,2));
        AC = Math.sqrt(Math.pow((xC-xA),2)+Math.pow(yC-yA,2));
        BC = Math.sqrt(Math.pow((xC-xB),2)+Math.pow(yC-yB,2));
        if (AB+AC > BC && AB+BC >AC){
            System.out.println("ABC là hình tam giac");
        } else {System.out.println("ABC khong phai là hình tam giac");

    }
}}
