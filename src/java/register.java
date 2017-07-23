/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Puneet
 */
public class register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
        
   
        
        String firstname = request.getParameter("firstname");
        String middlename = request.getParameter("middlename");
        String lastname = request.getParameter("lastname");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String grac = request.getParameter("graduation course");
        String grayr = request.getParameter("graduation year");
        String postc = request.getParameter("post graduation course");
        String postyr = request.getParameter("post graduation year");
        String address = request.getParameter("address");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
       // String dob = request.getParameter("dob");
        //java.sql.Date sqlDate = java.sql.Date.valueOf(dob);
        
        
      try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
           
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/database","root","puneet@049");
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?)");
                        
            
            ps.setString(1, firstname);
            ps.setString(2, middlename);
            ps.setString(3, lastname);
            //ps.setDate(4, sqlDate);
            ps.setString(4, grac);
            ps.setString(5, grayr);
            ps.setString(6,postc);
            ps.setString(7, postyr);
            ps.setString(8, address);
            ps.setString(9,username);
            ps.setString(10, password);
            ps.setString(11, mobile);
            ps.setString(12,email);
            
            int i = ps.executeUpdate();
           
            
           if(i>0){
             request.setAttribute("username", username);
              request.setAttribute("password", password);
              request.getRequestDispatcher("/registerd.jsp").forward(request,response);
           }
            
            //ye wala code important code hai!
           
        }
        catch (Exception se)
        { se.printStackTrace();
          out.println("Hello");
         

        }

   

      }
    
}
