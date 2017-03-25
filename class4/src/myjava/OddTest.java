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
public class OddTest {

    public static void main(String[] args) {
        java.util.Scanner scanner
                = new java.util.Scanner(System.in);
        System.out.print("輸入整數:");
        int input = scanner.nextInt();
        if (input % 2 == 0) // 如果餘數為 0
        {
            System.out.println(input + " 是偶數");
        }
        if (input % 2 != 0) // 如果餘數不為 0
        {
            System.out.println(input + " 是奇數");
        }
    }
}
