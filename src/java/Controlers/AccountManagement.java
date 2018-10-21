package Controlers;

import Domain.Account;
import Domain.BankBranch;
import Domain.Client;
import Services.ServiceAccount;
import Services.ServiceBankBranch;
import Services.ServiceClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AccountManagement", urlPatterns = {"/accountManagement"})
public class AccountManagement extends HttpServlet {
    
    private final String VUE = "/WEB-INF/accountManagement.jsp";
    private final String ATT_LABEL = "inputLabel";
    private final String ATT_IBAN = "inputIban";
    private final String ATT_NUMCLIENT1 = "inputNumClient1";
    private final String ATT_NUMCLIENT2 = "inputNumClient2";
    private final String ATT_NUMAGENCY = "inputNumAgency";
    private final String ATT_NUMACCOUNT = "inputAccountNb";
    
    private ServiceBankBranch serviceBankBranch;
    private ServiceClient serviceClient;
    private ServiceAccount serviceAccount;

    
    public AccountManagement() {
        this.serviceBankBranch = new ServiceBankBranch();
        this.serviceClient = new ServiceClient();
        this.serviceAccount = new ServiceAccount();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<BankBranch> agences = serviceBankBranch.getAllBankBranch();
        request.setAttribute("agences", agences);
        
        List<Client> clients = serviceClient.getAllClients();
        request.setAttribute("clients", clients);
        
        List<Account> accounts = serviceAccount.getAllAccounts();
        request.setAttribute("accounts", accounts);
        
        this.getServletContext().getRequestDispatcher( VUE ).forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accountNb = request.getParameter(ATT_NUMACCOUNT);
        if (accountNb != null) {
            Account account = serviceAccount.getAccount(accountNb);
            serviceAccount.deleteAccount(account);
        }
        
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String label = request.getParameter(ATT_LABEL);
        String iban = request.getParameter(ATT_IBAN);
        String numAgency = request.getParameter(ATT_NUMAGENCY);

        
        try {
            int numClient1 = Integer.parseInt(request.getParameter(ATT_NUMCLIENT1));
            String numClient2 = request.getParameter(ATT_NUMCLIENT2);
            
            if (!label.isEmpty() && !iban.isEmpty() && !numAgency.isEmpty()) {
                BankBranch bankbranch = serviceBankBranch.getBankBranch(numAgency);
                ArrayList<Client> clients = new ArrayList();      
                Client client1 = serviceClient.getClient(numClient1);
                clients.add(client1);
                 if (numClient2 != null) {
                     Client client2 = serviceClient.getClient(Integer.parseInt(numClient2));
                     clients.add(client2);
                 }               
                
                serviceAccount.createAccount(label, iban, bankbranch, clients);
            }
        } catch (Exception e) {
            
        }
        
        processRequest(request, response);
    }

}
