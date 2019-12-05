package Week2;

import TI.BoeBot;
import TI.Servo;

public class Week2_4b {
    private static Servo s1 = new Servo(12);
    private static Servo s2 = new Servo(13);

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