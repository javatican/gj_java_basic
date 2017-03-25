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
public class NestedForDemo {

    public static void main(String[] args) {
        java.util.Scanner scanner
                = new java.util.Scanner(System.in);
        System.out.print("輸入長:");
        int length = scanner.nextInt();
        System.out.print("輸入寬:");
        int width = scanner.nextInt();
        for (int i = width;i > 0; i--) {
            for (int j = length; j > 0; j--) {
                System.out.print("@");
            }
            System.out.println(); // 換行
        }
    }
}
