package Week2;

import TI.Servo;

public class Draaien {
    public void draaien(int draaiSnelheid){
        Servo s1 = new Servo(12);
        Servo s2 = new Servo(13);

        if (draaiSnelheid == 0){
            s1.update(1500);
            s2.update(1500);
        } else if(draaiSnelheid > 0){
            s2.update(1500+draaiSnelheid);
            s1.update(1500);
        } else if(draaiSnelheid < 0){
            s1.update(1500 - draaiSnelheid);
            s2.update(1500);
        }
    }
}
