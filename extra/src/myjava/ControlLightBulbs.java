package myjava;


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
        /**
        利用bit or運算:
        若要打開第一顆燈泡: 就與0001做bit or
        若要打開第二顆燈泡: 就與0010做bit or
        若要打開第三顆燈泡: 就與0100做bit or
        若要打開第四顆燈泡: 就與1000做bit or
        */
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
        /**
        利用bit and及互補(Complement)運算:
        若要關閉第一顆燈泡: 就與1110做bit and
        若要關閉第二顆燈泡: 就與1101做bit and
        若要關閉第三顆燈泡: 就與1011做bit and
        若要關閉第四顆燈泡: 就與0111做bit and
        */
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
        /**
        利用bit and(&)運算, 
        想要知道第一顆燈泡是否亮的, 就跟0001做bit and
        想要知道第二顆燈泡是否亮的, 就跟0010做bit and
        想要知道第三顆燈泡是否亮的, 就跟0100做bit and
        想要知道第四顆燈泡是否亮的, 就跟1000做bit and
        */
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
