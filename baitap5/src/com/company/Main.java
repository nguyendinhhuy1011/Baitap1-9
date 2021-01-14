package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int gia1 = 15000;
	int gia2 = 13500;
	int gia3 = 11000;
	int tien =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("so km da di: ");
        int sokm = sc.nextInt();
        if (sokm<1) tien = gia1*1;
        if (sokm<5) tien = gia2*(sokm-1)+gia1;
        if (sokm>5 && sokm<=120) tien = gia2*(sokm-1)+gia1 + gia3*(sokm-4);
        if (sokm>120) tien = (gia2*(sokm-1)+gia1 + gia3*(sokm-4))*90/100;
        System.out.println("Gia tong tien la: " + tien);
    }
}
