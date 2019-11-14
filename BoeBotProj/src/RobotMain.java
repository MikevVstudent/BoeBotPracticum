import TI.*;

import java.awt.*;

public class RobotMain {
    private static Servo s1 = new Servo(12);
    private static Servo s2 = new Servo(13);

    public static void main(String[] args) {

        //boolean state = true;
        s1.update(1500);
        s2.update(1500);
        Timer t1 = new Timer(1300);
        Timer t2 = new Timer(700);
        Timer t3 = new Timer(800);
        Timer t4 = new Timer(1700);

        t1.mark();
//        t2.mark();
        t3.mark();
//        t4.mark();

        while (true) {
            if(t1.timeout()){
//                t1.mark();
//                BoeBot.digitalWrite(0, !BoeBot.digitalRead(0));
                t2.mark();
                BoeBot.digitalWrite(0, !BoeBot.digitalRead(0));
                System.out.println("lamp 1 uit");
            } if (t2.timeout()){
                t1.mark();
                BoeBot.digitalWrite(0, !BoeBot.digitalRead(0));
                System.out.println("lamp 1 aan");
            } if (t3.timeout()){
                t4.mark();
                BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));

                System.out.println("lamp 2 uit");
            } if (t4.timeout()){
                t3.mark();
                BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));

                System.out.println("lamp 2 aan");
            }
            BoeBot.wait(1);
//            BoeBot.digitalWrite(15, true);
//            BoeBot.digitalWrite(0, true);
//            BoeBot.wait(1000);
//            BoeBot.digitalWrite(15, false);
//            BoeBot.digitalWrite(0,false);
//            BoeBot.wait(1000);

        }
    }
}
