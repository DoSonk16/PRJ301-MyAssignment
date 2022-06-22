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
import model.Lecturer;
import model.Session;
import model.Student;
import model.Subject;

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

    public ArrayList<Session> search(String sid, Integer lid, String suid, String rname) {

        HashMap<Integer, Object> params = new HashMap<>();
        ArrayList<Session> sess = new ArrayList<>();
        try {
            String sql = "SELECT s.sid,s.sname,l.lname,su.suid,su.suname,sl.sldate,r.rname FROM Session ses\n"
                    + "  INNER JOIN Student s ON s.sid = ses.sid\n"
                    + "  INNER JOIN Lecturer l ON l.lid = ses.lid\n"
                    + "  INNER JOIN Subject su ON su.suid = ses.suid\n"
                    + "  INNER JOIN Slot sl ON sl.sldate = ses.sldate\n"
                    + "  INNER JOIN Room r ON r.rname = ses.rname\n"
                    + "  WHERE (1=1)";
            Integer index = 0;
            if (sid != null) {
                sql += " AND s.sid like '%'+?+'%'";
                index++;
                params.put(index, sid);
            }
            if (lid != null) {
                sql += " AND l.lid = ?";
                index++;
                params.put(index, lid);
            }
            if (suid != null) {
                sql += " AND su.suid like '%'+?+'%'";
                index++;
                params.put(index, suid);
            }
            if (rname != null) {
                sql += " AND r.rname like '%'+?+'%'";
                index++;
                params.put(index, rname);
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            for (Map.Entry<Integer, Object> entry : params.entrySet()) {
                Integer position = entry.getKey();
                Object value = entry.getValue();
                stm.setObject(position, value);
            }

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Session ses = new Session();
                ses.setSid(rs.getString("sid"));
                ses.setLid(rs.getInt("lid"));
                ses.setSuid(rs.getString("suid"));
                ses.setSldate(rs.getDate("sldate"));
                ses.setRname(rs.getString("rname"));
                Student stu = new Student();
                stu.setSid(rs.getString("sid"));
                stu.setSname(rs.getString("sname"));
                Lecturer lec = new Lecturer();
                lec.setLid(rs.getInt("lid"));
                lec.setLname(rs.getString("lname"));
                Subject sub = new Subject();
                sub.setSuid(rs.getString("suid"));
                sub.setSuname(rs.getString("suname"));
                sess.add(ses);
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
        return sess;
    }
}
