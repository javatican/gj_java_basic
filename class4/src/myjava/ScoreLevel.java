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
public class ScoreLevel {

    public static void main(String[] args) {
        java.util.Scanner scanner
                = new java.util.Scanner(System.in);
        System.out.print("輸入分數:");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("得 A");
        } else if (score >= 80 && score < 90) {
            System.out.println("得 B");
        } else if (score >= 70 && score < 80) {
            System.out.println("得 C");
        } else if (score >= 60 && score < 70) {
            System.out.println("得 D");
        } else {
            System.out.println("得 E(不及格)");
        }
    }

}
