/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author etienne
 */
public class ServiceBankBranchTest {
    
    public ServiceBankBranchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createBankBranch method, of class ServiceBankBranch.
     */
    @Test
    public void testCreateBankBranch() {
        System.out.println("createBankBranch");
        String address = "1 rue de Provence 70015 Paris";
        ServiceBankBranch instance = new ServiceBankBranch();
        instance.createBankBranch(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
