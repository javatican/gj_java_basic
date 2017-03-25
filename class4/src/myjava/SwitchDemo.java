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
public class SwitchDemo {

    public static void main(String[] args) {
        java.util.Scanner scanner
                = new java.util.Scanner(System.in);
        System.out.print("請輸入分數: ");
        int score = scanner.nextInt();
        int level = score / 10;
        switch (level) {
            case 10:
            case 9:
                System.out.println("得 A");
                break;
            case 8:
                System.out.println("得 B");
                break;
            case 7:
                System.out.println("得 C");
                break;
            case 6:
                System.out.println("得 D");
                break;
            default:
                System.out.println("得 E(不及格)");
        }
    }
}
