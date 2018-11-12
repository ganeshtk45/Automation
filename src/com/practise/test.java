package com.practise;
/**
 * Created by ganesh on 15-10-2018.
 */
 class Student
{
    private int x;
    private int y;
    public void setX(int x)
    {
        this.x = x;
    }
    public int getX()
    {
        return x;
    }
}
public class test
{
    public static void main(String[] args)
    {
     Student s = new Student();
        s.setX(6);
        System.out.println(s.getX());
    }
}
//System.out.println()