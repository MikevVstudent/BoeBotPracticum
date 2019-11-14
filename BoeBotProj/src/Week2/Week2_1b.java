package Week2;

import TI.BoeBot;
import TI.PWM;

public class Week2_1b {
    public static void main (String[] args){
        PWM pwm = new PWM(0, 5);

        while (true){
            BoeBot.wait(100);
        }
    }
}
