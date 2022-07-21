/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaunittest;

/**
 *
 * @author ben
 */
public class Palindrome {
    public static boolean isPalindrome(String phrase){
        
        String newPhrase = phrase.toLowerCase();
        
        int leftPos = 0;
        int rightPos = newPhrase.length() - 1;
        boolean palindrome=true;
        while ((leftPos < rightPos) && palindrome) {
            if (newPhrase.charAt(leftPos) != newPhrase.charAt(rightPos)) {
                palindrome=false;
            }
            leftPos++;
            rightPos--;
        }
        return palindrome;
    }
    
    public static void main (String argv []){
    isPalindrome("couoc");
    }
    
}
