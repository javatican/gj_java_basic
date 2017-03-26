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
public class TestInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 100;
        long y = 100L; 
        //int a = 10000000000; //百億, 無法存到int變數中-> overflow
        long b = 10000000000L; //正數常數預設為int, 最大值2147483647(21.47億)
        System.out.println("x="+x+", y="+y);
        int k = 0x1F;
        System.out.println("k="+k);
        int m = 017;
        System.out.println("m="+m);
        
        
    }
    
}
