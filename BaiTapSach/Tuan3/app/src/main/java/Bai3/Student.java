/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.io.Serializable;
/**
 *
 * @author T3D Computer
 */
public class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String address;
    private int age;
    public void Studet() {}

    public Student(int id, String name, String address, int age) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public int getId() {
         return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "Student@[id=" + id + " , name=" + name + ", "
        + "address= " + address + ",age =" + age+ "]";
    }
}
