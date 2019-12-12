package Week2;

import TI.Servo;

public class Week2_6b {
    private static Servo s1 = new Servo(12);
    private static Servo s2 = new Servo(13);

    public static void main (String[] args){

        Draaien draaien = new Draaien();
        while(true) {
            draaien.draaien(100);
        }
    }
}
