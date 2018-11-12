package com.casting;

/**
 * Created by ganesh on 27-09-2018.
 */
public class Test
{
    public static void main(String[] args)
    {
        Product p = new Mobile();
        System.out.println(p.code);
        System.out.println(p.name);

        Mobile m = (Mobile)p;
        System.out.println(m.model_name);
        System.out.println(m.color);
        System.out.println(m.code);
        System.out.println(m.name);

        Product p1 = new Product();
        System.out.println(p1.code);
        System.out.println(p1.name);

        Laptop l = (Laptop)p1;
        System.out.println(l.rom);
        System.out.println(l.ram);
        System.out.println(l.name);
        System.out.println(l.code);
    }
}
