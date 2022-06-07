/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Random;
import Model.MyCircle;

/**
 *
 * @author DELL
 */
public class CircleController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override  //generate circles
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("num"));
        Random random = new Random();
        ArrayList<MyCircle> circles = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            MyCircle circle = new MyCircle();
            circle.setRadius(random.nextInt(31) + 20);
            circle.setX(random.nextInt(500 - 2*circle.getRadius()) + circle.getRadius());
            circle.setY(random.nextInt(500 - 2*circle.getRadius()) + circle.getRadius());
            circle.setRed(random.nextInt(256));
            circle.setGreen(random.nextInt(256));
            circle.setBlue(random.nextInt(256));
            circles.add(circle);
        }
        request.setAttribute("circles", circles);
        request.getRequestDispatcher("view/circle/list.jsp").forward(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
