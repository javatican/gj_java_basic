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
public class NestedWhileDemo {
    public static void main(String[] args) {
        java.util.Scanner scanner
                = new java.util.Scanner(System.in);
        System.out.print("輸入長:");
        int length = scanner.nextInt();
        System.out.print("輸入寬:");
        int width = scanner.nextInt();
        int widthCount = 0;
        while (widthCount < width) {
            int lengthCount = 0;
            while (lengthCount < length) {
                System.out.print("@");
                lengthCount++;
            }
            System.out.println(); // 換行
            widthCount++;
        }
    }
}
