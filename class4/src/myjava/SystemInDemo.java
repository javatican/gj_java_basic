/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

import java.io.IOException;

/**
 *
 * @author ryannieh
 */
public class SystemInDemo {

    public static void main(String[] args) {
        int inChar;
        System.out.println("Enter a Character:");
        
        try {
            while((inChar = System.in.read()) != -1){
                System.out.print("You entered ");
                System.out.println(inChar);
            }
            System.out.println(inChar);
        } catch (IOException e) {
            System.out.println("Error reading from user");
        }
    }
    public static void main2(String[] args) {
        int inChar;
        System.out.println("Enter a Character:");
        try {
            inChar = System.in.read();
            System.out.print("You entered ");
            System.out.println(inChar);
        } catch (IOException e) {
            System.out.println("Error reading from user");
        }
    }
}
