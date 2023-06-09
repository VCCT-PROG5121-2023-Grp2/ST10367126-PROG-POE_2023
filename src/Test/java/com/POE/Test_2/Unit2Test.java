/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.POE.Test_2;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Alexi
 */
public class Unit2Test {
    
    public Unit2Test() {
    }
    
    Unit2 test = new Unit2();

   

    @Test
    public void testMain() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------ Unit Test 2 - Test 2.1");
        test.main(null);
        String[] setID = test.GetActual();
        assertEquals("AD:1:IKE",setID[1]);
        System.out.println(setID[1]);
        
        
        
        } 
    }
    
