package myjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class TestChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char x = 'A';
        char y = '美';
        System.out.println("x="+x+",y="+y);
        //跳脫字元
        char a = '\u0048'; //unicode表示一個字元
        char b = '\u0065';
        char c = '\u006c';
        char d = '\u006c';
        char e = '\u006f';
        System.out.println(""+a+b+c+d+e); //+ : 字串串接
        System.out.println(Integer.toHexString('美')); 
        //1. 取得一個整數的16進位表示法, 然後轉成字串
        //2. 若傳入的是一個字元, 則回傳該字元的unicode表示法（16進位), 然後轉成字串
        char f = '\u7f8e'; 
        System.out.println("f="+f);
        //其他跳脫字元
        char m='\t';
        System.out.println("A"+m+"B");
        char n = '\n';
        System.out.println("A"+n+"B");
        System.out.println("\"Hello World\"");
        char x1='\'';
        System.out.println("x1"+x1);
    }
    
}
