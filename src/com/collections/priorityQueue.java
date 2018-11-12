package com.collections;

import java.util.PriorityQueue;

/**
 * Created by ganesh on 09-11-2018.
 */
public class priorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue q = new PriorityQueue();
        q.add(20);
        q.add(30);
        q.add(45);
        q.add(78);
        System.out.println(q);
        Object ob=q.peek();
        System.out.println(ob);
        Object ob1 = q.poll();
        System.out.println(q);
    }
}
