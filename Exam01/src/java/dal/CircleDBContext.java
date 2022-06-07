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
import model.MyCircle;

/**
 *
 * @author Ngo Tung Son
 */
public class CircleDBContext extends DBContext<MyCircle> {

    @Override
    public ArrayList<MyCircle> list() {
        ArrayList<MyCircle> circles = new ArrayList<>();
        try {
            String sql = "SELECT id,x,y,radius FROM Circle";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                MyCircle c = new MyCircle();
                c.setX(rs.getInt("x"));
                c.setY(rs.getInt("y"));
                c.setRadius(rs.getInt("radius"));
                circles.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CircleDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(CircleDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return circles;
    }

    @Override
    public MyCircle get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(MyCircle model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(MyCircle model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(MyCircle model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args)
    {
        CircleDBContext db = new CircleDBContext();
    }
    
}
