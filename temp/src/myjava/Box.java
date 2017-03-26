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
public class Box {
    public int h, w, d;
    public int volume(){
        int vol = h*w*d;
        return vol;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box b = new Box();
        b.h=10;
        b.w=5;
        b.d=30;
        System.out.println("Box b的體積為:"+b.volume());
        Box b2= new Box();
        b2.h=100;
        b2.w=50;
        b2.d=300;
        System.out.println("Box b2的體積為:"+b2.volume());
    }
}
