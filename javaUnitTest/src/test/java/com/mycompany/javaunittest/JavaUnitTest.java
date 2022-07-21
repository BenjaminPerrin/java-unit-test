/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaunittest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ben
 */
public class JavaUnitTest {
    
    
    @Test
    public void firstTestMethod(){
        assertTrue(true); 
    }
    @Test
    void unTest(){
        System.out.println("unTest");
        assertTrue(true); 
    }
    @Test
    void unAureTest(){
        System.out.println("unAureTest");
        assertTrue(true); 
    }
     @BeforeAll
    static void setupAll(){
        System.out.println("setupAll");
    }
    @BeforeEach
    void setup(){
        System.out.println("setup");
    }
        
    @AfterAll
    static void unAutreTest(){
        System.out.println("unAutreTest");
    }
    
    @AfterEach
    void teardown(){
        System.out.println("teardown");
    }

    @AfterAll
    static void teardownAll(){
        System.out.println("teardownAll");
    }

    
}
