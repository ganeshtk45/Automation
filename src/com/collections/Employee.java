package com.collections;

/**
 * Created by ganesh on 09-11-2018.
 */
public class Employee
{
    int id;
    String name;
    double salary;
    Employee(int id,String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String toString()
    {
        return (id+" "+name+" "+salary);
    }
}
