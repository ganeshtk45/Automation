package com.collections;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by ganesh on 09-11-2018.
 */
public class hashMap
{
    public static void main(String[] args)
    {
        String inputString = "java jdbc java hibernate java jdbc";
        String[] words = inputString.split(" ");
        HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
        for (String word:words)
        {
            if (wordCount.containsValue(word))
            {
                wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase()+1));
            }
            else
            {
                wordCount.put(word.toLowerCase(),1);
            }
        }
        Set<String> noOfWords = wordCount.keySet();
        for (String word:noOfWords)
        {
            System.out.println(word+":"+wordCount.get(word));
        }
    }
}
