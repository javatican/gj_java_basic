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
public class BitwiseDemo {
    public static void main(String[] args) {
        byte i = 13;
        byte j = 12;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(j));
        System.out.println("變數值...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println("位元運算...");
        System.out.println(" i & j = " + (i & j));
        System.out.println(" i | j = " + (i | j));
        System.out.println(" i ^ j = " + (i ^ j));
        System.out.println(" ~i = " + (~i));
    }
}
