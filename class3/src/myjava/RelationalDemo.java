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
public class RelationalDemo {

    public static void main(String[] args) {
// 宣告變數
        int j = 42;
        int i = 37;
        int k = 42;
        System.out.println("變數值...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" k = " + k);
// 大於
        System.out.println("大於...");
        System.out.println(" i > j = " + (i > j));
        System.out.println(" j > i = " + (j > i));
        System.out.println(" k > j = " + (k > j));
// 大於或等於
        System.out.println("大於或等於...");
        System.out.println(" i >= j = " + (i >= j));
        System.out.println(" j >= i = " + (j >= i));
        System.out.println(" k >= j = " + (k >= j));
// 小於
        System.out.println("小於...");
        System.out.println(" i < j = " + (i < j));
        System.out.println(" j < i = " + (j < i));
        System.out.println(" k < j = " + (k < j));
// 小於或等於
        System.out.println("小於或等於...");
        System.out.println(" i <= j = " + (i <= j));
        System.out.println(" j <= i = " + (j <= i));
        System.out.println(" k <= j = " + (k <= j));
// 等於
//小心!是兩個等號!
        System.out.println("等於...");
        System.out.println(" i == j = " + (i == j));
        System.out.println(" k == j = " + (k == j));

// 不等於
        System.out.println("不等於...");
        System.out.println(" i != j = " + (i != j));
        System.out.println(" k != j = " + (k != j));

    }
}
