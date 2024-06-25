/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author minhk
 */

public class Book extends TaiLieu {
    private int soTrang;

    public Book(String maTaiLieu, String tenTL, String NXB, int soTrang) {
        super(maTaiLieu, tenTL, NXB);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Book{" + "soTrang=" + soTrang + '}';
    }

    
}
