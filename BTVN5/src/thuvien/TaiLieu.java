/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author minhk
 */
public class TaiLieu {
    private String maTaiLieu;
    private String tenTL;
    private String NXB;

    public TaiLieu() {
    }
    

    public TaiLieu(String maTaiLieu, String tenTL, String NXB) {
        this.maTaiLieu = maTaiLieu;
        this.tenTL = tenTL;
        this.NXB = NXB;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    @Override
    public String toString() {
        return "TaiLieu{" + "maTaiLieu=" + maTaiLieu + ", tenTL=" + tenTL + ", NXB=" + NXB + '}';
    }
    
}
