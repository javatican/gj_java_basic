/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class TestIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入一個整數:");
        int x = s.nextInt();
        if (x % 2 == 1 || x % 2 == -1) {
            if (x > 0) {
                System.out.println("x=" + x + " 是正奇數");
            } else {
                System.out.println("x=" + x + " 是負奇數");
            }
        } else if (x > 0) {
            System.out.println("x=" + x + " 是正偶數");
        } else {
            System.out.println("x=" + x + " 是負偶數");
        }
        System.out.println("finish!");
    }

}
