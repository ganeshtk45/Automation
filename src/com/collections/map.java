package com.collections;

import java.util.HashMap;

/**
 * Created by ganesh on 09-11-2018.
 */
public class map
{
    public static void main(String[] args)
    {
        HashMap map = new HashMap();
        map.put(10,4.54);
        map.put(null,null);
        map.put(10,'a');
        map.put(1.2,30);
        System.out.println(map);
        Object ob = map.get(10);
        System.out.println(ob);
        System.out.println(map.keySet());
    }
}
