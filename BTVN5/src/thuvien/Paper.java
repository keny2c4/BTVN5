/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author minhk
 */
public class Paper extends TaiLieu {
    private int taiBan;

    public Paper(String maTaiLieu, String tenTL, String NXB, int taiBan) {
        super(maTaiLieu, tenTL, NXB);
        this.taiBan = taiBan;
    }

    public int getTaiBan() {
        return taiBan;
    }

    public void setTaiBan(int taiBan) {
        this.taiBan = taiBan;
    }

    @Override
    public String toString() {
        return "Paper{" + "taiBan=" + taiBan + '}';
    }
    
}
