package Week2;

import TI.BoeBot;
import TI.Servo;

public class Week2_5c {

    private static Servo s1 = new Servo(12);
    private static Servo s2 = new Servo(13);

    public static void main (String[] args){
        Draaien draaien = new Draaien();
        draaien.draaien(-200);
        BoeBot.wait(500);
        s1.stop();
        s2.stop();
    }
}