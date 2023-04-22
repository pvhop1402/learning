/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author T3D Computer
 */
public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
    ObjectOutputStream oos = null;
    try {
        oos = new ObjectOutputStream(new FileOutputStream("D:\\Data.txt"));
        // create student
        Student student = new Student(1, "Tran Hao Phong", "Ha Noi", 17);
        // write student
        oos.writeObject(student);
        System.out.println("Success...");
        } catch (IOException ex) {
        ex.printStackTrace();
    }finally {
        oos.close();
    }
    }
}
