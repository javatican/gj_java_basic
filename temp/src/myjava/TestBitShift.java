/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

/**
 *
 * @author student
 */
public class TestBitShift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x =13;
         System.out.println("x<<2 = "+ (x<<2));
         System.out.println("52 bit format:"+ Integer.toBinaryString(52));    
         System.out.println("x>>2 = "+ (x>>2));
         System.out.println("3 bit format:"+ Integer.toBinaryString(3));  
         int y = -13;
         System.out.println("-13 bit format:"+ Integer.toBinaryString(-13));  
         System.out.println("y>>2 = "+ (y>>2));
         System.out.println("3 bit format:"+ Integer.toBinaryString(-4));  
    }
    
}
