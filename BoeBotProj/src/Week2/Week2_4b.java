package Week2;

import TI.BoeBot;
import TI.Servo;

public class Week2_4b {
    public static Servo s1 = new Servo(12);
    public static Servo s2 = new Servo(13);

    public static void main (String[] args){
        s1.update(1700);
        s2.update(1300);

        BoeBot.wait(1000);

        s1.update(1300);
        s2.update(1700);

        BoeBot.wait(1000);

        s1.update(1500);
        s2.update(1500);
    }
}