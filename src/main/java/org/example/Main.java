package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sanPham sanpham1 = new sanPham();
        System.out.printf("nhap sp: ");
        Scanner sc = new Scanner(System.in);
        String sp = sc.nextLine();
        System.out.printf("gia");
        double gia = sc.nextDouble();
        System.out.printf("giam gia sp");
        double giamGia = sc.nextDouble();

        sp = sanpham1.tenSp;
        gia = sanpham1.giaSp;
        giamGia = sanpham1.giamgia;

        sanpham1.xuat();
    }
}