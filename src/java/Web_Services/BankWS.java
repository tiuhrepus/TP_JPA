/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Services;

import Domain.Account;
import Domain.BankBranch;
import Domain.Client;
import Services.ServiceAccount;
import Services.ServiceBankBranch;
import Services.ServiceClient;
import infra.DAO;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author tim-b
 */
@WebService(serviceName = "BankWS")
public class BankWS {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * méthode prend en paramètre l'identifiant d'un client et nous retourne un 
     * message SOAP contenant le client. 
     * @param idClient : numéro de client
     * @return Client : un client
    */
    @WebMethod(operationName = "findClientsById")
    public Client findClientById(@WebParam(name = "idClient") String idClient){
        ServiceClient sc = new ServiceClient();
        return (Client)sc.getClient(Integer.parseInt(idClient));
    }
    
    /**
     * Cette méthode ne prend aucun paramètre, et retourne 
     * la liste des clients dans unmessage SOAP.
     * @return la liste de tous les clients
    */
    @WebMethod(operationName = "getAllClients")
    public List<Client> getAllClients(){
        ServiceClient sc = new ServiceClient();
        //implémenter getAllClients
        return (List<Client>)sc.getAllClients(new Client());
    }
    
    /**
     * Cette méthode prend en paramètre le numéro et le l'adresse d'une agence, 
     * et la persiste en base de données.
     * @param numAgency : le numéro d'agence
     * @param adressAgency : adresse de l'agence
    */
    @WebMethod(operationName = "createBankBranch")
    public void createBankBranch(@WebParam(name = "numAgency") String numAgency, @WebParam(name = "adressAgency") String adressAgency){
        ServiceBankBranch sbb = new ServiceBankBranch();
        sbb.createBankBranch(adressAgency);
    }
    
    /**
     * Cette méthode supprime un compte bancaire à partir de son numéro.
     * @param accountNb : numéro de compte
    */
    @WebMethod(operationName = "deleteAccount")
    public void deleteAccount(@WebParam(name = "accountNb") String accountNb){
        ServiceAccount sa = new ServiceAccount();
        sa.deleteAccount((Account)sa.getAccount(accountNb));
    }
}
