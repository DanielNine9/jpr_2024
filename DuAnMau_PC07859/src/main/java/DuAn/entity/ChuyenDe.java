/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.entity;

/*
    Khai báo thuộc tính: Mã chuyên đề, tên chuyên đề, học phí, thời lượng, hình
mô tả
    Hinh khai báo String vì vì mở cái đường dẫn của nó lên
    Contructor có tham số và không có tham số
    Tạo các getter setter
 */

/**
 *
 * @author dinhh
 */
public class ChuyenDe {

    private int maCD;
    private String tenCD;
    private double hocPhi;
    private int thoiLuong;
    private String hinh;
    private String moTa;
    private boolean deleted = false;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() { //do du lieu ra combobox
        return this.tenCD;
    }

    @Override
    public boolean equals(Object obj) { //so sanh 2 chuyen de => sap xep
        ChuyenDe other = (ChuyenDe) obj;
        return other.getMaCD() == (this.getMaCD());
        //other.getHocPhi();
    }

    public ChuyenDe() {
    }

    public ChuyenDe( String tenCD, double hocPhi, int thoiLuong, String hinh, String moTa) {
        this.tenCD = tenCD;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.hinh = hinh;
        this.moTa = moTa;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

}
