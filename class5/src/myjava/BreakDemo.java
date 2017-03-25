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
public class BreakDemo {

    public static void main(String[] args) {
        java.util.Scanner scanner
                = new java.util.Scanner(System.in);
        int score = 0;
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("輸入分數(-1 結束):");
            score = scanner.nextInt();
            if (score == -1) {
                break;
            }
            sum += score;
            count++;
        }
        System.out.println("平均:"+ (double) sum / count);
    }

}
