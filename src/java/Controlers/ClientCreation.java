
package Controlers;

import Domain.Client;
import Services.ServiceClient;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "clientCreation", urlPatterns = {"/clientCreation"})
public class ClientCreation extends HttpServlet {
    
    private final String VUE = "/WEB-INF/clientCreation.jsp";
    private final String ATT_SURNAME = "inputNom";
    private final String ATT_FIRSTNAME = "inputPrenom";
    private final String ATT_DATE = "inputDateNaiss";
    
    private ServiceClient serviceClient;
    
    public ClientCreation() {
        serviceClient = new ServiceClient();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Client> clients = serviceClient.getAllClients();
        
        request.setAttribute("clients", clients);
        
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String surname = request.getParameter(ATT_SURNAME);
        String firstname = request.getParameter(ATT_FIRSTNAME);
        String dateStr = request.getParameter(ATT_DATE);
        
        if (surname.isEmpty() || firstname.isEmpty() || dateStr.isEmpty()) {
            request.setAttribute("erreur", "wrong inputs");
        }
        else {
            try {
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date date = dateFormat.parse(dateStr);

                serviceClient.createClient(surname, firstname, date);

            } catch (ParseException ex) {
                request.setAttribute("erreur", "wrong date format");
            }
        }
        
        processRequest(request, response);
    }
}
