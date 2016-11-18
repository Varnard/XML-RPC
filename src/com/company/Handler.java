package com.company;

import org.apache.xmlrpc.XmlRpcException;

import java.util.HashMap;

public class Handler {

    public double sum(double x, double y){
        return x+y;
    }

    public String isException(Boolean cond) throws XmlRpcException {
        if (cond) throw new XmlRpcException(418,"It's a TeaTime!");
        else return "is Not";
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
