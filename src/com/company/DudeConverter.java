package com.company;

import java.util.HashMap;

public class DudeConverter {

    public static Dude toDude(HashMap<String, Object> map){
        return new Dude((String)map.get("name"),(Integer)map.get("age"));
    }

    public static HashMap fromDude(Dude dude){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name",dude.getName());
        map.put("age",dude.getAge());
        return map;
    }
}
