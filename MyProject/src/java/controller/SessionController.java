/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.SessionDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;
import model.Session;

/**
 *
 * @author DELL
 */
public class SessionController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String raw_sid = request.getParameter("sid");
        String raw_lid = request.getParameter("lid");
        String raw_suid = request.getParameter("suid");
        String raw_from = request.getParameter("from");
        String raw_to = request.getParameter("to");
        String raw_rname = request.getParameter("rname");
        
        
        String sid = (raw_sid!=null && raw_sid.length()>0)?raw_sid:null;
        Integer lid = (raw_lid !=null && raw_lid.length()>0)?new Integer(raw_lid):null;
        String suid = (raw_suid!=null && raw_suid.length()>0)?raw_suid:null;
        Date from = (raw_from !=null && raw_from.length()>0)?Date.valueOf(raw_from):null;
        Date to = (raw_to !=null && raw_to.length()>0)?Date.valueOf(raw_to):null;
        String rname = (raw_rname!=null && raw_rname.length()>0)?raw_rname:null;
        
        SessionDBContext se = new SessionDBContext();
        ArrayList<Session> sess = se.search(sid, lid, suid, from, to, rname);
        request.setAttribute("sess", sess);
        request.getRequestDispatcher("../view/sessionView/sessionView.jsp").forward(request, response);
    } 

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
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
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
