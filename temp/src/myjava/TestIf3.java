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
public class TestIf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("請輸入一個分數(0-100):");
        int x = s.nextInt();
        if (x>80){
            System.out.println("A等");
        } else if ( x>70){
            System.out.println("B等");
        } else if( x>60){
            System.out.println("C等");
        } else {
            System.out.println("D等");
        }
    }
    
}
