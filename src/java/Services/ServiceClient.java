/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Client;
import infra.DAO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author etienne
 */
public class ServiceClient {
    
    DAO<Client> daoClient;
    
    public ServiceClient() {
        daoClient = new DAO();
    }
    
    public void createClient(String surname, String firstname, Date date) {
        Client client = new Client(surname, firstname, date);
        daoClient.create(client);
    }
    
    public void deleteClient(Client client) {
        daoClient.remove(client);
    }
    
    public void saveClient(Client client) {
        daoClient.update(client);
    }
    
    public Client getClient(int numClient) {
        return daoClient.get(Client.class, numClient);
    }
 
    /**
     *
     * @return liste de tous les clients
     */
    public List<Client> getAllClients(){
        return (List<Client>)daoClient.findAllTuples(new Client());
    }
}
