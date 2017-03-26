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
public class ArithmeticDemo {

    public static void main(String[] args) {
// 宣告變數與值
        int x = 10;
        int y = 5;
        System.out.println("變數值...");
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
// 加法示範
        System.out.println("加法...");
        System.out.println("x + y = " + (x + y));
// 減法示範
        System.out.println("減法...");
        System.out.println("x - y = " + (x - y));
// 乘法示範
        System.out.println("乘法...");
        System.out.println("x * y = " + x * y); // *優先於+
// 除法示範
        System.out.println("除法...");
        System.out.println("x / y = " + x / y);
// 餘數運算
        System.out.println("計算餘數...");
        System.out.println("x % y = " + x % y);
        //除法, 保留小數點後的位數
        System.out.println("x/y=" + (float) x / y);
        //+,-優先順序相同, 由左向右運算
        int z = 10 + 6 - 5 + 100;
        //先乘除後加減
        int a = 10 * 6 + 4 - 3 * 2; //(10*6)+4-(3*2)
    }

}
