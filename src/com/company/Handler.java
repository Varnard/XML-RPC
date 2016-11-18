package com.company;

/**
 * Created by Varn on 2016-11-18.
 */
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
}
