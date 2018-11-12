package com.practise;

/**
 * Created by ganesh on 08-11-2018.
 */
public class arrays
{
    static int[] insert(int a[], int index,int element)
    {
        if(index<0||index>a.length)
        {
            System.out.println("array out of bound");
        }
        int[] na = new int[a.length+1];
        for (int i=0;i<a[index-1];i++)
        {
            na[i]=a[i];
        }
        na[index]=element;
        for (int i=index;i<a.length;i++)
        {
            na[i+1]=a[i];
        }
        return na;
    }
    public static void main(String[] args)
    {
        int[] a = new int[]{1,2,3,4,5};
        int ab[]=insert(a,3,12);
        for (int i=0;i<ab.length;i++)
        {
            System.out.print(ab[i]);
        }
    }
}
