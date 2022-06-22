/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Emp;

import model.Req;
import model.Status;

/**
 *
 * @author DELL
 */
public class ReqDBContext extends DBContext<Req> {

    public ArrayList<Req> search(Integer create_by, Integer review_by) {

        HashMap<Integer, Object> params = new HashMap<>();
        ArrayList<Req> req = new ArrayList<>();
        try {
            String sql = "SELECT r.reason,r.fromdate,r.todate, r.create_by, r.review_by, s.sname FROM AnualRequest r\n"
                    + "INNER JOIN Status s ON r.status = s.sid "
                    + "INNER JOIN Emp e1 ON r.create_by = e1.eid"
                    + "INNER JOIN Emp e2 ON r.review_by = e2.eid"
                    + "\n"
                    + " WHERE (1=1)\n";
            Integer index = 0;
            if (create_by != null) {
                sql += " AND r.create_by = ?";
                index++;
                params.put(index, create_by);
            }
            if (review_by != null) {
                sql += " AND  r.review_by = ?";
                index++;
                params.put(index, review_by);
            }

            PreparedStatement stm = connection.prepareStatement(sql);
            for (Map.Entry<Integer, Object> entry : params.entrySet()) {
                Integer position = entry.getKey();
                Object value = entry.getValue();
                stm.setObject(position, value);
            }

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Req r = new Req();
                r.setReason(rs.getString("reason"));
                r.setFrom(rs.getDate("fromdate"));
                r.setTo(rs.getDate("todate"));
                Emp e1 = new Emp();
                e1.setEid(rs.getInt("create_by"));
                e1.setEname(rs.getString("ename"));
                Emp e2 = new Emp();
                e2.setEid(rs.getInt("review_by"));
                e2.setEname(rs.getString("ename"));
                Status sta = new Status();
                sta.setSname(rs.getString("sname"));
                r.setStatus(sta);
                req.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReqDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return req;
    }

    @Override
    public ArrayList<Req> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Req get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void insert(Req model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Req model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Req model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void main(String[] args) {
    }
}
