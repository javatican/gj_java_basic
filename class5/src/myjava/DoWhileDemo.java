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
public class DoWhileDemo {

    public static void main(String[] args) {
        java.util.Scanner scanner
                = new java.util.Scanner(System.in);
        int answer = 77;
        int input = 0;
        do {
            System.out.print("輸入數字(1-100):");
            input = scanner.nextInt();
        } while (input != answer);
        System.out.println("恭喜您!猜對了!");
    }
}
