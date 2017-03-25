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
public class ControlLightBulbs {

    public static int bulbs = 0;

    public static void main(String[] args) {
        print_info(bulbs);
        System.out.println("打開1,3");
        turn_on(1);
        turn_on(3);
        print_info(bulbs);
        System.out.println("關閉3");
        turn_off(3);
        print_info(bulbs);
        System.out.println("打開2,4");
        turn_on(2);
        turn_on(4);
        print_info(bulbs);
        System.out.println("關閉1,4");
        turn_off(1);
        turn_off(4);
        print_info(bulbs);
    }

    public static void turn_on(int x) {
        if (x == 1) {
            bulbs = bulbs | 1;
        } else if (x == 2) {
            bulbs = bulbs | 2;
        } else if (x == 3) {
            bulbs = bulbs | 4;
        } else if (x == 4) {
            bulbs = bulbs | 8;
        }
    }

    public static void turn_off(int x) {
        if (x == 1) {
            bulbs = bulbs & ~1;
        } else if (x == 2) {
            bulbs = bulbs & ~2;
        } else if (x == 3) {
            bulbs = bulbs & ~4;
        } else if (x == 4) {
            bulbs = bulbs & ~8;
        }
    }

    public static void print_info(int x) {
        System.out.println("目前狀態:");
        System.out.println("第一顆燈泡:" + on_or_off(x & 1));
        System.out.println("第二顆燈泡:" + on_or_off(x & 2));
        System.out.println("第三顆燈泡:" + on_or_off(x & 4));
        System.out.println("第四顆燈泡:" + on_or_off(x & 8));
    }

    public static String on_or_off(int x) {
        if (x == 0) {
            return "暗";
        } else {
            return "亮";
        }
    }
}
