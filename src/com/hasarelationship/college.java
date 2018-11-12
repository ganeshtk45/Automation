package com.hasarelationship;

/**
 * Created by ganesh on 05-10-2018.
 */
public class college
{
    String coll_name;
    department[] d = new department[2];
    college(String coll_name)
    {
        this.coll_name=coll_name;
    }
    {
        d[0]= new department("science");
        d[1]=new department("commerce");
    }
}
