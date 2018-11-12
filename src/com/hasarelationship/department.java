package com.hasarelationship;

/**
 * Created by ganesh on 05-10-2018.
 */
public class department
{
   String dept_name;
    student[] s = new student[3];
    department(String dept_name)
    {
        this.dept_name=dept_name;
    }
    {
        s[0]=new student(1,"ganesh",20.2);
        s[1]=new student(2,"test",10.3);
        s[2]=new student(3,"sam",2.4);
    }
}
