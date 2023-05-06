/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 *
 * @author T3D Computer
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
class Main {
  public static void main(String[] args) {
    try {

      // Creates a FileInputStream
      FileInputStream file = new FileInputStream("input.txt");

      // Creates a BufferedInputStream
      BufferedInputStream input = new BufferedInputStream(file);

      // Reads first byte from file
      int i = input .read();

      while (i != -1) {
        System.out.print((char) i);

        // Reads next byte from the file
        i = input.read();
      }
      input.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}
    
}
