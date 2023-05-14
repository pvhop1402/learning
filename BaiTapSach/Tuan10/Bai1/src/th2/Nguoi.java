/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th2;

/**
 *
 * @author T3D Computer
 */
public class Nguoi {
    private String hoTen;
    private String diaDiem;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaDiem) {
        this.hoTen = hoTen;
        this.diaDiem = diaDiem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    @Override
    public String toString() {
        return ", hoTen=" + hoTen + ", diaDiem=" + diaDiem;
    }
    
}
