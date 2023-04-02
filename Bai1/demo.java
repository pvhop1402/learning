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
public class demo {
    static NhanVien dsNV[];
    static int n;
    public static void add(){
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap so nhan vien muon them: ");
        n=s.nextInt();
        dsNV=new NhanVien[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap nhan vien thu " + (i+1) + ":" );
            NhanVien nv=new NhanVien();
            nv.nhap();
            dsNV[i]=nv;
        }
    }
    public static void xuat(){
        System.out.println("Danh sach nhan vien la:");
        NhanVien.tieude();
        for(NhanVien nv: dsNV){
            nv.xuat();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int chon;
        System.out.print("Nhap lua chon: ");
        chon=s.nextInt();
        do{
            switch(chon){
                case 1: {
                        System.out.println("Them nhan vien moi");
                        System.out.print("Nhap so nhan vien muon them: ");
                        n=s.nextInt();
                        dsNV=new NhanVien[n];
                        for(int i=0;i<dsNV.length;i++){
                            System.out.println("Nhap nhan vien thu " + (i+1) +":" );
                            NhanVien nv=new NhanVien();
                            nv.nhap();
                            dsNV[i]=nv;
                        }                       
                        break;
                        }
           
                case 2: {
                        xuat();
                        break;
                        }
                case 4: System.out.println("Exit");
                default:System.out.println("Invalid value");break;
            }  
        }while(chon!=4);
    }
}
