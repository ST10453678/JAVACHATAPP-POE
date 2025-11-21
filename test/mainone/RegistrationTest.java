/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mainone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MY PC
 */
public class RegistrationTest {
    
    public RegistrationTest() {
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
     * Test of userNameCheck method, of class Registration.
     */
    @Test
    public void testUserNameCheck() {
        System.out.println("userNameCheck");
        String username = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.userNameCheck(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passwordCheck method, of class Registration.
     */
    @Test
    public void testPasswordCheck() {
        System.out.println("passwordCheck");
        String password = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.passwordCheck(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cellNumberCheck method, of class Registration.
     */
    @Test
    public void testCellNumberCheck() {
        System.out.println("cellNumberCheck");
        String cellphone = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.cellNumberCheck(cellphone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signUp method, of class Registration.
     */
    @Test
    public void testSignUp() {
        System.out.println("signUp");
        Registration instance = new Registration();
        instance.signUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class Registration.
     */
    @Test
    public void testSignIn() {
        System.out.println("signIn");
        Registration instance = new Registration();
        instance.signIn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class Registration.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        Registration instance = new Registration();
        instance.sendMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessageId method, of class Registration.
     */
    @Test
    public void testCheckMessageId() {
        System.out.println("checkMessageId");
        Registration instance = new Registration();
        String expResult = "";
        String result = instance.checkMessageId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class Registration.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String messageId = "";
        int messageNum = 0;
        Registration instance = new Registration();
        String expResult = "";
        String result = instance.createMessageHash(messageId, messageNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
