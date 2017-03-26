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
public class TestInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入一個整數:");
        int x = s.nextInt();
        System.out.println("您輸入的整數為:"+x);
        System.out.println("請輸入一個浮點數:");
        double y = s.nextDouble();
        System.out.println("您輸入的浮點數為:"+y);
        
    }
}
