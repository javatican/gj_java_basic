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
        int x = 13;
        int y = 12;
        System.out.println("x的bit表示:" + Integer.toBinaryString(x));
        System.out.println("y的bit表示:" + Integer.toBinaryString(y));
        System.out.println("x=" + x + ",y" + y);
        System.out.println("x & y =" + (x & y));
        System.out.println("x|y=" + (x | y));
        System.out.println("x^y = " + (x ^ y));
        System.out.println("~x = " + (~x)); //~x 等於 -14
        System.out.println("-14的bit表示:" + Integer.toBinaryString(-14));
    }
}
