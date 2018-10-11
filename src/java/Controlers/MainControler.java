/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author etienne
 */
@WebServlet(name = "MainControler", urlPatterns = {"/"})
public class MainControler extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            ServiceBankBranch servBB = new ServiceBankBranch();
            servBB.createBankBranch("1 rue de Provence 75012 Paris");
            
            ServiceClient servClient = new ServiceClient();
            servClient.createClient("Thimotée", "Borelle", new Date("25/10/2012"));
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" \n" +
"              integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">");
            out.println("<title>Servlet MainControler</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MainControler at " + request.getContextPath() + "</h1>");
            out.println("<form style=\"margin-left: 3%; margin-top: 3%;\"><div class=\"form-row\">");
            out.println("<div class=\"form-group col-md-4\"><label for=\"inputNom\">Nom</label>");            
            out.println("<input type=\"text\" class=\"form-control\" id=\"inputNom\" placeholder=\"\" required>");
            out.println("</div><div class=\"form-group col-md-4\"><label for=\"inputPrenom\">Prénom</label>");
            out.println("<input type=\"text\" class=\"form-control\" id=\"inputPrenom\" placeholder=\"\" required>\n" +
"              </div>\n" +
"  </div>\n" +
"  <div class=\"form-row\">\n" +
"  	<div class=\"form-group col-md-8\">\n" +
"    	<label for=\"inputDateNaiss\">Date de naissance</label>\n" +
"    	<input type=\"text\" class=\"form-control\" id=\"inputDateNaiss\" placeholder=\"\" required>\n" +
"  	</div>\n" +
"  </div>	\n" +
"        <button id=\"submitButton\" type=\"submit\" class=\"btn btn-primary mb-2\">Créer compte client</button>\n" +
"    </form>");
      
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
