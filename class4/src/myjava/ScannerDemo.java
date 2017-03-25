package myjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ryannieh
 */
public class ScannerDemo {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("輸入整數:");
        int input1 = scanner.nextInt();
        System.out.print("輸入浮點數:");
        double input2 = scanner.nextDouble();
        System.out.print("輸入布林數:");
        boolean input3 = scanner.nextBoolean();
        System.out.println("整數輸入:" + input1);
        System.out.println("浮點數輸入:" + input2);
        System.out.println("布林數輸入:" + input3);
    }
}
