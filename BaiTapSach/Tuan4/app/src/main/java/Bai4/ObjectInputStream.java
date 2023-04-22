/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author T3D Computer
 */
public class ObjectInputStream {
    public static void main(String[] args) throws IOException {
    ObjectInputStream ois = null;
    try {
        ois = new ObjectInputStream(new FileInputStream("D:\\Data.txt"));
        // read student
        Student student = (Student) ois.readObject();
        // show student
        System.out.println(student.toString());
        } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    }catch (IOException ex) {
        ex.printStackTrace();
    }finally {
        ois.close();
    }
    }

}
