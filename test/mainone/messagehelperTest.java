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
public class messagehelperTest {
    
    public messagehelperTest() {
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

    @Test
    public void testAskUserToSearch() {
        System.out.println("askUserToSearch");
        messagehelper instance = new messagehelper();
        instance.askUserToSearch();
     
    }

    @Test
    public void testDisplayLong() {
        System.out.println("displayLong");
        messagehelper instance = new messagehelper();
        instance.displayLong();
     
    }
    
}
