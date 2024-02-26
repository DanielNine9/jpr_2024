/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.entity;

/*
    Tạo các thuộc tính: mã học viên, mà khóa học, mà 
 */
/**
 *
 * @author dinhh
 */
public class HocVien {

    private int maHV;
    private int maKH;
    private int maNH;
    private double diem;
    private boolean deleted = false;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public HocVien() {
    }

    public HocVien(int maHV, int maKH, int maNH, double diem) {
        this.maHV = maHV;
        this.maKH = maKH;
        this.maNH = maNH;
        this.diem = diem;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getMaNH() {
        return maNH;
    }

    public void setMaNH(int maNH) {
        this.maNH = maNH;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

}
