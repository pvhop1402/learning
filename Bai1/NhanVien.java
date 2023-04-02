/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author T3D Computer
 */
public class NhanVien{
    private String hoDem;
    private String ten;
    private final NgayThang ngaySinh = new NgayThang();
    private final NgayThang ngayVaoLam = new NgayThang();
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ho dem: ");
        hoDem = sc.nextLine();
        System.out.print("Nhap ten: ");
        ten=sc.nextLine();
        System.out.println("Nhap ngay, thang, nam sinh:");
        ngaySinh.nhap();
        System.out.println("Nhap ngay, thang, nam vao lam:");
        ngayVaoLam.nhap();
    }
    public static void tieude(){
        System.out.printf("%-15s%-10s%15s%15s%n","Ho dem",
                "Ten","Ngay Sinh","Ngay vao lam");
    }
    public void xuat(){
        System.out.printf("%-15s%-10s%15s%15s%n",hoDem,ten,
                            ngaySinh.toString(),ngayVaoLam.toString());
    }
}
