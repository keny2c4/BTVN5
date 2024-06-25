/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minhk
 */
public class Student extends DoiTuong {
    private String lop;
    private String ban;

    public Student(String id, String ten, boolean gioiTinh, String yob, String lop, String ban) {
        super(id, ten, gioiTinh, yob);
        this.lop = lop;
        this.ban = ban;
    }

    

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    @Override
    public String toString() {
        return "Student{" + "lop=" + lop + ", ban=" + ban + '}';
    }
    
}
