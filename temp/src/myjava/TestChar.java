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
        char a = '\u0048';
        char b = '\u0065';
        char c = '\u006c';
        char d = '\u006c';
        char e = '\u006f';
        System.out.println(""+a+b+c+d+e);
        System.out.println(Integer.toHexString('美'));
        char f = '\u7f8e';
        System.out.println("f="+f);
        char m='\t';
        System.out.println("A"+m+"B");
        char n = '\n';
        System.out.println("A"+n+"B");
        System.out.println("\"Hello World\"");
        char x1='\'';
    }
    
}
