/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Client;
import infra.DAO;
import java.util.Date;

/**
 *
 * @author etienne
 */
public class ServiceClient {
    
    DAO dao;
    
    public ServiceClient() {
        dao = new DAO();
    }
    
    public void createClient(String surname, String firstname, Date date) {
        Client client = new Client(surname, firstname, date);
        dao.create(client);
    }
    
}
