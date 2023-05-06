/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;
import java.io.File;
/**
 *
 * @author T3D Computer
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    // importing the File class

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("JavaFile.java");

    try {

      // create a new file with name specified
      // by the file object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("New Java File is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
}
