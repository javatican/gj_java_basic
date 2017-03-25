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
public class ForDemo {

    public static void main(String[] args) {
        java.util.Scanner scanner
                = new java.util.Scanner(System.in);
        System.out.print("輸入執行次數:");
        int input = scanner.nextInt();
        for (int i = input; i > 0; i--) {
            System.out.println("Hello!World!");
        }
    }
}
