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

        sanpham1.tenSp = sp;
        sanpham1.giaSp = gia;
        sanpham1.giamgia = giamGia;

        sanpham1.xuat();
    }
}
