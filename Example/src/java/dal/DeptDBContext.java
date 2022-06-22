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
import model.Dept;
import model.Emp;

/**
 *
 * @author Ngo Tung Son
 */
public class DeptDBContext extends DBContext<Dept> {

    @Override
    public ArrayList<Dept> list() {
        ArrayList<Dept> depts = new ArrayList<>();
        try {
            String sql = "SELECT did,dname FROM Dept";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Dept d = new Dept();
                d.setDid(rs.getInt("did"));
                d.setDname(rs.getString("dname"));
                depts.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeptDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return depts;
    }

    @Override
    public Dept get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Dept model) {
        try {
            connection.setAutoCommit(false);
            String sql_insert_dept = "INSERT INTO Dept(did,dname) VALUES(?,?)";
            PreparedStatement stm_insert_dept = connection.prepareStatement(sql_insert_dept);
            stm_insert_dept.setInt(1, model.getDid());
            stm_insert_dept.setString(2, model.getDname());
            stm_insert_dept.executeUpdate();
            for (Emp emp : model.getEmps()) {
                String sql_insert_emp = "INSERT INTO [Emp]\n"
                        + "           ([eid]\n"
                        + "           ,[ename]\n"
                        + "           ,[gender]\n"
                        + "           ,[dob]\n"
                        + "           ,[did])\n"
                        + "     VALUES\n"
                        + "           (?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,?)";
                PreparedStatement stm = connection.prepareStatement(sql_insert_emp);
                stm.setInt(1, emp.getEid());
                stm.setString(2, emp.getEname());
                stm.setBoolean(3, emp.isGender());
                stm.setDate(4, emp.getDob());
                stm.setInt(5, model.getDid());
                stm.executeUpdate();
            }
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(DeptDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(DeptDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        finally
        {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(DeptDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void update(Dept model) {
    }

    @Override
    public void delete(Dept model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
