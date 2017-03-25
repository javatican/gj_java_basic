/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

/**
 *
 * @author ryannieh
 */
public class ShiftDemo {

    public static void main(String[] args) {
        int i = 1;
        System.out.println("變數值...");
        System.out.println(" i = " + showString(i));
        System.out.println("左位移運算...");
        System.out.println(" i << 1 = " + showString(i << 1));
        System.out.println(" i << 2 = " + showString(i << 2));
        System.out.println(" i << 3 = " + showString(i << 3));
        System.out.println("===============");
        i=32;
        System.out.println(" i = " + showString(i));
        System.out.println("右位移運算...");
        System.out.println(" i >> 1 = " + showString(i >> 1));
        System.out.println(" i >> 2 = " + showString(i >> 2));
        System.out.println(" i >> 3 = " + showString(i >> 3)); 
        System.out.println("===============");
        int j = Integer.MIN_VALUE;
        System.out.println(" j = " + showString(j));
        System.out.println("右位移運算...");
        System.out.println(" i >> 1 = " + showString(j >> 1));
        System.out.println(" i >> 2 = " + showString(j >> 2));
        System.out.println(" i >> 3 = " + showString(j >> 3));        
        System.out.println("===============");
        System.out.println(" j = " + showString(j));
        System.out.println("無符號右位移運算...");
        System.out.println(" i >>> 1 = " + showString(j >>> 1));
        System.out.println(" i >>> 2 = " + showString(j >>> 2));
        System.out.println(" i >>> 3 = " + showString(j >>> 3));
    }

    
    public static String showString(int x){
        return x + "; \t binary format : " + String.format("%32s", Integer.toBinaryString(x));
    }
}
