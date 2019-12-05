package Week2;

import TI.*;

public class Week2_4a {
    private static Servo s1 = new Servo(12);
    private static Servo s2 = new Servo(13);

    public static void main (String[] args){
        s1.update(1500);
        s2.update(1500);
        //de servo motoren horen nu stil te staan, het afstellen kan beginnen.
    }
}