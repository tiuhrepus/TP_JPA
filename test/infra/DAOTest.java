/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import Domain.Client;
import infra.DAO;
import java.util.Date;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 *
 * @author etienne
 */
public class DAOTest extends TestCase {
    
    private Context  ctx;
    private EJBContainer ejbContainer;
    
    @BeforeClass
    public  void setUp() {
        ejbContainer = EJBContainer.createEJBContainer();
        System.out.println("Opening the container" );
        ctx = ejbContainer.getContext();
    }

    @AfterClass
    public  void tearDown() {
        ejbContainer.close();
        System.out.println("Closing the container" );
    }

    public void testApp() throws NamingException {
        
        DAO dao = (DAO) ctx.lookup("java:app/bank_datasource");
        assertNotNull(dao);
        
        Client client = new Client("Yo", "Lo", new Date(114, 11, 30));
        dao.create(client);
        client = new Client("Thimothée", "Borelle", new Date(2014, 11, 25));
        dao.create(client);
        client = new Client("Etienne", "Lopvet", new Date(2016, 10, 12));
        dao.create(client);
        client = new Client("Jean", "Jean", new Date(1995, 01, 20));
        dao.create(client);

        //Collection<Client> clients = dao.getAll();

        //assertEquals(4, clients.size());
    }
}
