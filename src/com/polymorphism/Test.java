package com.polymorphism;

/**
 * Created by ganesh on 28-09-2018.
 */
public class Test
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.movement();
        Animal a = new Animal();
        a.movement();
        Animal a1 = new Dog();
        a1.movement();
    }
}
