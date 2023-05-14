/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th2;

/**
 *
 * @author T3D Computer
 */
public class SinhVien extends Nguoi{
   private int maSV;

    public SinhVien() {
    }

    public SinhVien(int maSV) {
        this.maSV = maSV;
    }

    public SinhVien(int maSV, String hoTen, String diaDiem) {
        super(hoTen, diaDiem);
        this.maSV = maSV;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + super.toString() + '}';
    }
}
