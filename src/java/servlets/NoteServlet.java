/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 794458
 */
public class NoteServlet extends HttpServlet {
private ArrayList<String> note;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet NoteServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet NoteServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        note = new ArrayList<String>();
        
        
System.out.println("GET Request: ");
response.setContentType("text/html;charset=UTF-8");
String edit = request.getParameter("edit");
if(edit!=null)
{
System.out.println("Edit Mode");    
getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
}
else
{
    System.out.println("View Mode");
    //String ttitle = request.getParameter("titleView");
    //String ccontent = request.getParameter("contentView");
    String path = getServletContext().getRealPath("/WEB-INF/note.txt");
    BufferedReader br = new BufferedReader(new FileReader(new File(path)));
    //note.add(br.readLine());
    //request.setAttribute("titleView", note = br.readLine());
    while(note.size()<3)
    {
        
        //System.out.println(note);
        note.add(br.readLine());
        
    
    }
    
    request.setAttribute("titleView", note.get(0));
    request.setAttribute("contentView", note.get(1));
    
    getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
}
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

response.setContentType("text/html;charset=UTF-8");
System.out.println("POST Request: ");
String edit = request.getParameter("edit");
response.setContentType("text/html;charset=UTF-8");
//String title = request.getParameter("title");
//String content = request.getParameter("content");
if(edit!=null)
{
    System.out.println("Edit is set!") ;
    
    request.setAttribute("title", note.get(0));
    request.setAttribute("content", note.get(1));
}
        //System.out.println("Title: "+title);
        //System.out.println("Contents: "+content);
 
 getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
