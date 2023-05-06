/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author T3D Computer
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */

  public static void main(String[] args) {

    // create first set
    Set<Integer> primeNumbers = new HashSet<>();
    primeNumbers.add(2);
    primeNumbers.add(3);
    System.out.println("Prime Numbers: " + primeNumbers);

    // create second set
    Set<Integer> evenNumbers = new HashSet<>();
    evenNumbers.add(2);
    evenNumbers.add(4);
    System.out.println("Even Numbers: " + evenNumbers);

    // Intersection of two sets
    evenNumbers.retainAll(primeNumbers);
    System.out.println("Intersection: " + evenNumbers);
  } 
}
