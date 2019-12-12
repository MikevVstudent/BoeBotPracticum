package Week2;

import TI.BoeBot;
import TI.Servo;

public class Week2_6a {
    private static Servo s1 = new Servo(12);
    private static Servo s2 = new Servo(13);

    public static void main (String[] args){
        GaNaarSnelheid gaNaarSnelheid = new GaNaarSnelheid();
        Draaien draaien = new Draaien();
        NoodRem noodRem = new NoodRem();

        while(true) {
            gaNaarSnelheid.gaNaarSnelheid(200);
            noodRem.noodRem();
            draaien.draaien(200);
            BoeBot.wait(500);
        }
    }
}
