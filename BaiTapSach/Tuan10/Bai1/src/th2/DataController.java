/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author T3D Computer
 */
public class DataController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;
    public void openFileToWrite(String fileName){
        try{
            fileWriter = new FileWriter(fileName,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    void writeSVToFile(SinhVien sv, String fileName){
        openFileToWrite(fileName);
        printWriter.println(sv.getMaSV()+"|"+sv.getHoTen()+"|"+sv.getDiaDiem());
        closeFileAfterWrite(fileName);
    }
    void closeFileAfterWrite(String fileName){
        try{
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public void openFileToRead(String fileName){
        try{
            scanner = new Scanner(Paths.get(fileName),"UTF-8");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void closeFileAfterRead(String fileName){
        try{
            scanner.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<SinhVien> readSVFromFile(String fileName){
        openFileToRead(fileName);
        ArrayList<SinhVien> sv = new ArrayList<>();
        while(scanner.hasNextLine()){
            String data=scanner.nextLine();
            SinhVien sinhV = createSVFromData(data);
            sv.add(sinhV);
        }
        closeFileAfterRead(fileName);
        return sv;
    }

    private SinhVien createSVFromData(String data) {
        String[] datas = data.split("\\|");
        SinhVien sv = new SinhVien(Integer.parseInt(datas[0]),datas[1]
                ,datas[2]);
        return sv;
         }
}
