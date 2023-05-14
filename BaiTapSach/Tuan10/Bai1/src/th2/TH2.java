/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package th2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author T3D Computer
 */
public class TH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chon = -1;
        var svFileName = "DATA.txt";
        var controller = new DataController();
        var svs = new ArrayList<SinhVien>();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch(chon){
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    int maSV;
                    String hoTen, diaDiem;
                    System.out.print("Nhap ma SV: ");;
                    maSV = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap ho ten SV: ");
                    hoTen = sc.next();
                    System.out.print("Nhap dia diem: ");
                    diaDiem = sc.next();
                    
                    SinhVien sv= new SinhVien(maSV,hoTen,diaDiem);
                    controller.writeSVToFile(sv, svFileName);
                    break;
                case 2:
                    svs = controller.readSVFromFile(svFileName);
                    hienThi(svs);
                    break;
                
            }
        }while(chon!=0);

    
}
    private static void hienThi(ArrayList<SinhVien> svs) {
        for(var sv : svs){
            System.out.println(sv);
        }
    } 
}

