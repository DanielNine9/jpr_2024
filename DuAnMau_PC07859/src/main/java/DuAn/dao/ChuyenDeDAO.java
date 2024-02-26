/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.dao;

import DuAn.entity.ChuyenDe;
import DuAn.utils.XJDBC;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dinhh
 */
public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, Integer> {
//ma chuyen de: string --> key --> search

    @Override
    public void insert(ChuyenDe model) {
        String sql = "INSERT INTO ChuyenDe (TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES ( ?, ?, ?, ?, ?)";
        XJDBC.update(sql,
                model.getTenCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getHinh(),
                model.getMoTa());
    }

    @Override
    public void update(ChuyenDe model) {
        String sql = "UPDATE ChuyenDe SET TenCD=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? WHERE MaCD=?";
        XJDBC.update(sql,
                model.getTenCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getHinh(),
                model.getMoTa(),
                model.getMaCD());
    }

    @Override
    public void delete(Integer MaCD, boolean want) {
        String sql = "UPDATE ChuyenDe SET deleted= " + (want ? "1" : "0") + " WHERE MaCD=?";
        XJDBC.update(sql, MaCD);
    }

    @Override
    public List<ChuyenDe> selectAll() {
        String sql = "SELECT * FROM ChuyenDe";
        return selectBySql(sql);
    }

    @Override
    public ChuyenDe selectById(int maCD) {
        String sql = "SELECT * FROM ChuyenDe WHERE MaCD=?";
        List<ChuyenDe> list = selectBySql(sql, maCD);
        return list.size() > 0 ? list.get(0) : null;
    }

    public ChuyenDe selectByName(String name) {
        String sql = "SELECT * FROM ChuyenDe WHERE TenCD=?";
        List<ChuyenDe> list = selectBySql(sql, name);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<ChuyenDe> selectBySql(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJDBC.query(sql, args);
                while (rs.next()) {
                    ChuyenDe entity = new ChuyenDe();
                    entity.setMaCD(rs.getInt("MaCD"));
                    entity.setHinh(rs.getString("Hinh"));
                    entity.setHocPhi(rs.getDouble("HocPhi"));
                    entity.setMoTa(rs.getString("MoTa"));
                    entity.setTenCD(rs.getString("TenCD"));
                    entity.setThoiLuong(rs.getInt("ThoiLuong"));
                    entity.setDeleted(rs.getBoolean("deleted"));
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

    public List<HashMap<String, Integer>> getChart() {
        String sql = "select count(*) as SLHV, c.MaCD, TenCD\n"
                + "from hocvien a \n"
                + "inner join khoahoc b on a.MaKH = b.MaKH\n"
                + "inner join chuyende c on c.MaCD = b.macd\n"
                + "group by c.macd, TenCD";
        List<HashMap<String, Integer>> list = new ArrayList<>();

        try (ResultSet rs = XJDBC.query(sql)) {
            while (rs.next()) {
                HashMap<String, Integer> map = new HashMap<>();
                map.put(rs.getString("TenCD"), rs.getInt("SLHV"));
                list.add(map);
            }

            // Additional processing for each HashMap in the list
            for (HashMap<String, Integer> hashMap : list) {
                // Example: Print each key-value pair
                for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public String generateNewUserId() throws SQLException {
        String newUserId = null;
        String sql = "select max(macd) from chuyende";
        ResultSet resultSet = XJDBC.query(sql);

        if (resultSet.next()) {
            int currentMaxId = resultSet.getInt(1);
            if (currentMaxId == 0) {
                newUserId = "CD1";
            } else {
                Formatter formatter = new Formatter();
                newUserId = "CD" + (++currentMaxId);
            }
        } else {
            newUserId = "CD1";
        }

        return newUserId;
    }

}
