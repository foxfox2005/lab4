package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sanPham sanpham1 = new sanPham();
        sanPham sanpham2 = new sanPham();

        // sp1
        System.out.printf("nhap san pham 1: ");
        Scanner sc = new Scanner(System.in);
        String sp1 = sc.nextLine();
        System.out.printf("gia 1: ");
        double gia1 = sc.nextDouble();
        System.out.printf("giam gia 1: ");
        double giamGia1 = sc.nextDouble();

        // sp2
        System.out.printf("\nnhap sp 2: ");
        String sp2 = sc.nextLine();
        System.out.printf("\ngia 2: ");
        double gia2 = sc.nextDouble();
        System.out.printf("giam gia 2: ");
        double giamGia2 = sc.nextDouble();

        sanpham1.tenSp = sp1;
        sanpham1.giaSp = gia1;
        sanpham1.giamgia = giamGia1;
        sanpham1.xuat();

        sanpham2.tenSp = sp2;
        sanpham2.giaSp = gia2;
        sanpham2.giamgia = giamGia2;
        sanpham2.xuat();
    }
}
