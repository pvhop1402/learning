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
public class NgayThang {
    private int ngay;
    private int thang;
    private int nam;

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }

    public NgayThang() {
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay, thang, nam: ");
        ngay=sc.nextInt();
        thang=sc.nextInt();
        nam=sc.nextInt();
    }

    public NgayThang(int ngay1, int thang1, int nam1) {
        if(thang1 > 0 && thang1<=12){
            this.thang=thang1;
        }else{
            System.out.println("Thang "+ thang + "khong hop le");
        }
        nam=nam1;
        ngay=checkNgay(ngay1);
    }
    private int checkNgay(int ngayKT){
        int ngayTrongThang[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(ngayKT > 0 && ngayKT <= ngayTrongThang[thang]){
            return ngayKT;
        }else if((thang == 2)&&(ngayKT == 29)&&((nam%400 == 0)||
                ((nam%4 == 0)&& (nam%100!=0)))){
            return ngayKT;
        }else{
            System.out.println("ngay" + ngayKT + " khong hop le");
            return 1;
        }
    }
    
}
