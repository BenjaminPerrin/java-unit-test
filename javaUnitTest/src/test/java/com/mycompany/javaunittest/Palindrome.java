/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaunittest;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
/**
 *
 * @author ben
 */
public class Palindrome {
    
    @BeforeEach
    public void setUp(){
        Palindrome = new Palindrome(); 
    }
    
    @Test
    public void testIsPalindrome(){
        Palindrome.isPalindrome("couoc");
//        assertTrue(true); 
    }
}


