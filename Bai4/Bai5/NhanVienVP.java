/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author T3D Computer
 */
public class NhanVienVP extends NhanVien{

    @Override
    public double tinhLuong() {
        double mucLuong = 0;
        int soNgayNghi = 0;
        return mucLuong-soNgayNghi*10000;
    }
    @Override
    public void nhap() {
        super.nhap();
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap so ngay nghi=");
        int soNgayNghi = s.nextInt();
        System.out.print("Muc luong=");     }
    public static void inTieuDe(){
        NhanVien.inTieuDe();
        System.out.printf("%10s %15s %15s %15s%n","So ngay nghi",
                        "Muc luong","phu cap","Luong");
    }
    @Override
    public final void xuatDL(){
        super.xuatDL();
        System.out.printf("%10d %15f %15.2f %15.2f%n",soNgayNghi,
                    mucLuong,tinhPhuCap(),tinhLuong());
    }
    @Override
    public String toString(){
        String soNgayNghi = null;
        String mucLuong = null;
        return super.toString()+ "\t so ngay nghi="+soNgayNghi+ 
                                "\tmuc luong="+mucLuong;
    }
}
