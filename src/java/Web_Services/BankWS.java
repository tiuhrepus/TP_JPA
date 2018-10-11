/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Services;

import Domain.BankBranch;
import Domain.Client;
import infra.DAO;
import java.util.Date;
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
     * @param txt
     * @return 
    */
    @WebMethod(operationName = "findClientsById")
    public Object findClientById(@WebParam(name = "idClient") String txt){
        
        Object client;
        return "(infos client)";
    }
    
    /**
     * Cette méthode ne prend aucun paramètre, et retourne 
     * la liste des clients dans unmessage SOAP.
     * @return la liste de tous les clients
    */
    @WebMethod(operationName = "getAllClients")
    public Object getAllClients(){
        Object clients = null;
       
        try {
            JAXBContext context = JAXBContext.newInstance(Client.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //Personne p = new Personne("nom1", "prenom1", 175, new Date());
            Client clt = new Client("nom", "prenom", new Date());
            m.marshal(clt, System.out);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
        
        return clients;
    }
    
    /**
     * Cette méthode prend en paramètre le numéro et le l'adresse d'une agence, 
     * et la persiste en base de données.
     * @param numAgency : le numéro d'agence
     * @param adress : le numéro d'adresse de l'agence
    */
    @WebMethod(operationName = "createBankBranch")
    public void createBankBranch(@WebParam(name = "num agence") String numAgency, @WebParam(name = "adresse agence") String adress){
        DAO<BankBranch> daoBB = new DAO<>();
        DAO<BankBranch> daobb2 = new DAO<>();
    }
    
    /**
     * Cette méthode supprime un compte bancaire à partir de son numéro.
     * @param accountNb : numéro de compte
    */
    @WebMethod(operationName = "deleteAccount")
    public void deleteAccount(@WebParam(name = "num account") String accountNb){
        
    }
}
