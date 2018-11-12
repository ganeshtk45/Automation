package com.encapsulation;

/**
 * Created by ganesh on 05-10-2018.
 */
public class Test
{
    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.setId(5);
        d.setName("Ganesh");
        d.setSalary(200.0);
        System.out.println(d.getId());
        System.out.println(d.getName());
        System.out.println(d.getSalary());
    }
}
