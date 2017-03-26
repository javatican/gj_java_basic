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
public class TestVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI=3.14; //常數的變數
        int a = 100;
        int b = (int)100.01;
        double r =10;
        double c = 2*PI*r;
        print_info(r,c);
        //PI=3;
        r = 15;
        c= 2*PI*r;
        print_info(r,c);
        int m=100;
    }
    public static void print_info(double x, double y){
        System.out.println("半徑:"+x+",圓周:"+y);
        //System.out.println("pi="+PI);
    }
}
