/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.dao;

import DuAn.entity.KhoaHoc;
import DuAn.utils.XJDBC;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Formatter;

/**
 *
 * @author dinhh
 */
public class KhoaHocDAO extends EduSysDAO<KhoaHoc, Integer> {

    @Override
    public void insert(KhoaHoc model) {
        String sql = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        XJDBC.update(sql,
                model.getMaCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getNgayKG(),
                model.getGhiChu(),
                model.getMaNV(),
                model.getNgayTao());
    }

    @Override
    public void update(KhoaHoc model) {
        String sql = "UPDATE KhoaHoc SET MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=? WHERE MaKH=?";
        XJDBC.update(sql,
                model.getMaCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getNgayKG(),
                model.getGhiChu(),
                model.getMaNV(),
                model.getMaKH());
    }

    @Override
    public void delete(Integer MaKH, boolean want) {
        String sql = "UPDATE KhoaHoc SET deleted = " + (want ? "1" : "0") + " WHERE MaKH=?";
        System.out.println("delete delete "+ MaKH);
        XJDBC.update(sql, MaKH);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        String sql = "SELECT * FROM KhoaHoc";
        return selectBySql(sql);
    }

    @Override
    public KhoaHoc selectById(int MaKH) {
        String sql = "SELECT * FROM KhoaHoc WHERE MaKH=?";
        List<KhoaHoc> list = selectBySql(sql, MaKH);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<KhoaHoc> selectBySql(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJDBC.query(sql, args);
                while (rs.next()) {
                    KhoaHoc entity = new KhoaHoc();
                    entity.setMaKH(rs.getInt("MaKH"));
                    entity.setHocPhi(rs.getDouble("HocPhi"));
                    entity.setThoiLuong(rs.getInt("ThoiLuong"));
                    entity.setNgayKG(rs.getDate("NgayKG"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    entity.setMaNV(rs.getInt("MaNV"));
                    entity.setNgayTao(rs.getDate("NgayTao"));
                    entity.setDeleted(rs.getBoolean("deleted"));
                    entity.setMaCD(rs.getInt("MaCD"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<KhoaHoc> selectByChuyenDe(int MaCD) { //tìm kiếm Khóa học theo chuyên đề 
        String sql = "SELECT * FROM KhoaHoc WHERE MaCD=?";
        return this.selectBySql(sql, MaCD);
    }

    public List<Integer> selectYears() {  //liệt kê những khóa học trong một năm
        String sql = "Select DiSTINCT year(NgayKG) Year From KhoaHoc ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBC.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
