package Week2;

import TI.BoeBot;

public class Week2_7b {
    public static void main (String[] args){
        int i = 1000;
        while (i<2000){
            i++;
            BoeBot.freqOut(0, i , 1);
            BoeBot.wait(1);
            if(i == 2000) i = 1000;
        }
    }
}
