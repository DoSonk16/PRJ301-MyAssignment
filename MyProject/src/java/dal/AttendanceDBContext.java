/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Attendance;
import model.Group;
import model.Lecturer;
import model.Room;
import model.Session;
import model.Slot;
import model.Student;

/**
 *
 * @author DELL
 */
public class AttendanceDBContext extends DBContext<Attendance> {

    public ArrayList<Attendance> search(String sid) {
        ArrayList<Attendance> atts = new ArrayList<>();
        try {
            String sql = "select att.status, att.editdate, grp.gname, roo.rname, slo.slname, lec.lname from Attendance att\n"
                    + "INNER JOIN Session ses ON att.sessionId = ses.sessionId\n"
                    + "INNER JOIN Room roo ON roo.rid = ses.rid\n"
                    + "INNER JOIN Slot slo ON slo.slid = ses.slid\n"
                    + "INNER JOIN [Group] grp ON grp.gid = ses.gid\n"
                    + "INNER JOIN Lecturer lec ON lec.lid = grp.lid\n"
                    + "INNER JOIN Student stu ON att.sid = stu.sid\n"
                    + "where stu.sid like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%"+sid+"%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Attendance att = new Attendance();
                att.setStatus(rs.getBoolean("status"));
                att.setEditdate(rs.getDate("editdate"));
                Group grp = new Group();
                grp.setGname(rs.getString("gname"));
                Session ses = new Session();
                Room roo = new Room();
                roo.setRname(rs.getString("rname"));
                Slot slo = new Slot();
                slo.setSlname(rs.getString("slname"));
                Lecturer lec = new Lecturer();
                lec.setLname(rs.getString("lname"));
                roo.setSes(ses);
                slo.setSes(ses);
                lec.setGrp(grp);
                atts.add(att);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return atts;
    }

    @Override
    public ArrayList<Attendance> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Attendance get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Attendance model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Attendance model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Attendance model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
