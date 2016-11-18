package com.company;

import java.util.HashMap;

public class Handler {

    public double sum(double x, double y){
        return x+y;
    }

    public double avg(Object[] numbers){
        double avg=0;
        for (int i = 0; i < numbers.length; i++) {
            avg+=(Double)numbers[i];
        }
        return avg/numbers.length;
    }

    public HashMap getJanusz(){
        Dude janusz = new Dude("Janusz",23);
        return DudeConverter.fromDude(janusz);
    }

    public Boolean isMinor(HashMap dude){
        Dude d = DudeConverter.toDude(dude);
        return d.getAge()<18;
    }
}
