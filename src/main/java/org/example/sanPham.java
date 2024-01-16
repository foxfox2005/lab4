package org.example;

public class sanPham {
    public String tenSp;
    public double giaSp;
    public double giamgia;

    public sanPham() {

    }
    public sanPham( String tenSp, double giaSp, double giamgia) {
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.giamgia = giamgia;
    }
    public double thue(){
        return 0.1*giaSp;
    }
    public xuat() {
        System.out.println("ten sp:  "+this.tenSp);
        System.out.println("gia sp:  "+this.giaSp);
        System.out.println("giam gia sp:  "+this.giamgia);
        System.out.printf("thue: "+thue());
    }
}
