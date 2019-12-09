package Week2;

import TI.BoeBot;
import TI.Servo;

public class GaNaarSnelheid {
    public void gaNaarSnelheid(int snelheid) {
        Servo s1 = new Servo(12);
        Servo s2 = new Servo(13);

        int i = 0;
        while (i < snelheid) {
            i++;
            BoeBot.wait(10);
            s1.update(1500 - i);
            s2.update(1500 + i);
        }
    }
}
