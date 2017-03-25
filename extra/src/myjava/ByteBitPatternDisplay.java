/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ryannieh
 */
public class ByteBitPatternDisplay {

    public static void display(byte x) {
        String s = String.format("%8s", Integer.toBinaryString(x & 0xFF)).replace(' ', '0');
        System.out.println(x + "\t:\t" + s);
    }

    public static void display_range(int s1, int s2) {
        for (int x = s1; x <= s2; x++) {
            display((byte) x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ByteBitPatternDisplay.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        display_range(0,17);
        System.out.println("press anything to continue...");
        sc.nextLine();
        display_range(110, 130);
        System.out.println("press anything to continue...");
        sc.nextLine();
        display_range(240, 256);
    }
}
