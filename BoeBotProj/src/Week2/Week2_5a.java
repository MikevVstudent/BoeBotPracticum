package Week2;

import TI.BoeBot;
import TI.Servo;

public class Week2_5a {
    private static Servo s1 = new Servo(12);
    private static Servo s2 = new Servo(13);

    void gaNaarSnelheid(int snelheid){
        int i = 0;
        while (i < snelheid) {
            i++;
            BoeBot.wait(10);
            s1.update(1500 + i);
            s2.update(1500 - i);

        }
        System.out.println((1500 + snelheid)+" en "+ (1500 - snelheid));
    }

    public static void main (String[] args){

    }

}