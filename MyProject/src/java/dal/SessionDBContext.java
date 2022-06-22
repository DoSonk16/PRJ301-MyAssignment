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
import model.Session;

/**
 *
 * @author DELL
 */
public class SessionDBContext extends DBContext<Session> {

    @Override
    public ArrayList<Session> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Session get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Session model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Session model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Session model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<Session> filter(Integer id, String name, Boolean gender, Date from, Date to, Integer did) {

        HashMap<Integer, Object> params = new HashMap<>();
        ArrayList<Session> ses = new ArrayList<>();
        try {
            String sql = "SELECT s.sid,s.sname,l.lname,su.suid,su.suname,sl.sldate,r.rname FROM Session ses\n"
                    + "  INNER JOIN Student s ON s.sid = ses.sid\n"
                    + "  INNER JOIN Lecturer l ON l.lid = ses.lid\n"
                    + "  INNER JOIN Subject su ON su.suid = ses.suid\n"
                    + "  INNER JOIN Slot sl ON sl.sldate = ses.sldate\n"
                    + "  INNER JOIN Room r ON r.rname = ses.rname\n"
                    + "  WHERE (1=1)";
            Integer index = 0;
            if (id != null) {
                sql += " AND e.eid = ?";
                index++;
                params.put(index, id);
            }
            if (name != null) {
                sql += " AND e.ename like '%'+?+'%'";
                index++;
                params.put(index, name);
            }
            if (gender != null) {
                sql += " AND e.gender = ?";
                index++;
                params.put(index, gender);
            }
            if (from != null) {
                sql += " AND e.dob >= ?";
                index++;
                params.put(index, from);
            }
            if (to != null) {
                sql += " AND e.dob <= ?";
                index++;
                params.put(index, to);
            }
            if (did != null) {
                sql += " AND e.did = ?";
                index++;
                params.put(index, did);
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            for (Map.Entry<Integer, Object> entry : params.entrySet()) {
                Integer position = entry.getKey();
                Object value = entry.getValue();
                stm.setObject(position, value);
            }

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
//                Emp e = new Emp();
//                e.setEid(rs.getInt("eid"));
//                e.setEname(rs.getString("ename"));
//                e.setGender(rs.getBoolean("gender"));
//                e.setDob(rs.getDate("dob"));
//                Dept d = new Dept();
//                d.setDid(rs.getInt("did"));
//                d.setDname(rs.getString("dname"));
//                e.setDept(d);
//                emps.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ses;
    }
}
