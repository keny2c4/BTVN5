/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author minhk
 */
public class DoiTuong {
    private String id;
    private String ten;
    private boolean gioiTinh;
    private String yob;

    public DoiTuong() {
    }
    

    public DoiTuong(String id, String ten, boolean gioiTinh, String yob) {
        this.id = id;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.yob = yob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "DoiTuong{" + "id=" + id + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", yob=" + yob + '}';
    }
    
}
