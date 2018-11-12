package com.hasarelationship;

/**
 * Created by ganesh on 05-10-2018.
 */
public class Test
{
    public static void main(String[] args)
    {
        college[] c = new college[1];
        {
            c[0]=new college("dbit");
        }
        System.out.println("college name is "+c[0].coll_name);
        System.out.println("dept is "+c[0].d[1].dept_name);
        System.out.println("id is "+c[0].d[0].s[2].id);
        System.out.println("name is "+c[0].d[1].s[0].name);
        System.out.println("marks is "+c[0].d[0].s[1].marks);
        //System.out.println();
    }
}
