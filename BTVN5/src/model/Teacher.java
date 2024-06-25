/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minhk
 */
public class Teacher extends DoiTuong {
    private String monDay;
    private String trinhDo;

    public Teacher(String id, String ten, boolean gioiTinh, String yob, String monDay, String trinhDo) {
        super(id, ten, gioiTinh, yob);
        this.monDay = monDay;
        this.trinhDo = trinhDo;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "Teacher{" + "monDay=" + monDay + ", trinhDo=" + trinhDo + '}';
    }
    
}
