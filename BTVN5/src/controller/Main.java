/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Student;
import model.Teacher;
import thuvien.Book;
import thuvien.Paper;

/**
 *
 * @author minhk
 */
public class Main {
    private static ArrayList<Student> listHocSinh = new ArrayList<>();
    private static ArrayList<Teacher> listGiaoVien = new ArrayList<>();
    private static ArrayList<Book> listBook = new ArrayList<>();
    private static ArrayList<Paper> listPaper = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Chon mot lua chon:");
            System.out.println("1. Them Hoc Sinh");
            System.out.println("2. Them Giao Vien");
            System.out.println("3. Them Book");
            System.out.println("4. Them Paper");
            System.out.println("5. Hien thi ra tat ca cac Doi tuong");
            System.out.println("6. Hien thi ra tat ca cac sach hoac paper co trong thu vien");
            System.out.println("7. Thoat");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    themHocSinh();
                    break;
                case 2:
                    themGiaoVien();
                    break;
                case 3:
                    themBook();
                    break;
                case 4:
                    themPaper();
                    break;
                case 5:
                    hienThiDoiTuong();
                    break;
                case 6:
                    hienThiThuVien();
                    break;
                case 7:
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }

    private static void themHocSinh() {
        System.out.print("Nhap ID: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap gioi tinh (true: Nam, false: Nu): ");
        boolean gioiTinh = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Nhap nam sinh: ");
        String yob = scanner.nextLine();
        System.out.print("Nhap lop: ");
        String lop = scanner.nextLine();
        System.out.print("Nhap ban: ");
        String ban = scanner.nextLine();

        Student hs = new Student(id, ten, gioiTinh, yob, lop, ban);
        listHocSinh.add(hs);
        System.out.println("Da them hoc sinh thanh cong.");
    }

    private static void themGiaoVien() {
        System.out.print("Nhap ID: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap gioi tinh (true: Nam, false: Nu): ");
        boolean gioiTinh = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Nhap nam sinh: ");
        String yob = scanner.nextLine();
        System.out.print("Nhap mon day: ");
        String monDay = scanner.nextLine();
        System.out.print("Nhap trinh do: ");
        String trinhDo = scanner.nextLine();

        Teacher gv = new Teacher(id, ten, gioiTinh, yob, monDay, trinhDo);
        listGiaoVien.add(gv);
        System.out.println("Da them giao vien thanh cong.");
    }

    private static void themBook() {
        System.out.print("Nhap ma tai lieu: ");
        String maTaiLieu = scanner.nextLine();
        System.out.print("Nhap ten tai lieu: ");
        String tenTL = scanner.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        String NXB = scanner.nextLine();
        System.out.print("Nhap so trang: ");
        int soTrang = Integer.parseInt(scanner.nextLine());

        Book book = new Book(maTaiLieu, tenTL, NXB, soTrang);
        listBook.add(book);
        System.out.println("Da them sach thanh cong.");
    }

    private static void themPaper() {
        System.out.print("Nhap ma tai lieu: ");
        String maTaiLieu = scanner.nextLine();
        System.out.print("Nhap ten tai lieu: ");
        String tenTL = scanner.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        String NXB = scanner.nextLine();
        System.out.print("Nhap tai ban: ");
        int taiBan = Integer.parseInt(scanner.nextLine());

        Paper paper = new Paper(maTaiLieu, tenTL, NXB, taiBan);
        listPaper.add(paper);
        System.out.println("Da them paper thanh cong.");
    }

    private static void hienThiDoiTuong() {
        System.out.println("Danh sach hoc sinh:");
        for (Student hs : listHocSinh) {
            System.out.println(hs);
        }
        System.out.println("Danh sach giao vien:");
        for (Teacher gv : listGiaoVien) {
            System.out.println(gv);
        }
    }

    private static void hienThiThuVien() {
        System.out.println("Danh sach sach:");
        for (Book book : listBook) {
            System.out.println(book);
        }
        System.out.println("Danh sach paper:");
        for (Paper paper : listPaper) {
            System.out.println(paper);
        }
    }
}