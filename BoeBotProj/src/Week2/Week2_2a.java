package Week2;

import TI.BoeBot;
import TI.PWM;

public class Week2_2a {
    public static void main(String[] args){
        PWM pwm1 = new PWM(0, 100);
        PWM pwm2 = new PWM(1, 0);

        int a = 0;
        int b = 100;

        while(a<100 && b>0){
            a++;
            b--;
            BoeBot.wait(10);
            pwm1.update(b);
            pwm2.update(a);
            System.out.println(a + " " +b);
            if(a == 100){
                a = 0;
                b = 100;
            }
            BoeBot.wait(10);
        }
    }
}
