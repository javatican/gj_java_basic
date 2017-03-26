/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

/**
 *
 * @author student
 */
public class TestFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x = 100.01F; //浮點常數預設為double, 無法存入到float變數
        double y = 100.01;
        double a = 1.01E+5; //科學符號表示法
        double b = 1.01E-3;
        System.out.println("x="+x+",y="+y);
        System.out.println("a="+a+",b="+b);
    }
    
}
