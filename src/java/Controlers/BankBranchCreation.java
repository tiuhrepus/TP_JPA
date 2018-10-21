package Controlers;

import Domain.BankBranch;
import Services.ServiceBankBranch;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "bankBranchCreation", urlPatterns = {"/agencyCreation"})
public class BankBranchCreation extends HttpServlet {
    
    private final String VUE = "/WEB-INF/agencyCreation.jsp";
    private final String ATT_ADDRESS = "inputAddress";
    private final String ATT_NUMAGENCY = "inputNumAgency";
    
    private ServiceBankBranch serviceBankBranch;
    
    public BankBranchCreation() {
        serviceBankBranch = new ServiceBankBranch();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<BankBranch> agences = serviceBankBranch.getAllBankBranch();
        request.setAttribute("agences", agences);
        
        this.getServletContext().getRequestDispatcher( VUE ).forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String address = (String) request.getParameter(ATT_ADDRESS);

        String numAgency = request.getParameter(ATT_NUMAGENCY);
        serviceBankBranch.createBankBranch(address, numAgency);
        
        processRequest(request, response);
    }
}
