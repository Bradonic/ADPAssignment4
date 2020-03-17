package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetApp
{
    Set<Integer> values = new HashSet();

    public void populate(int num)
    {
        for (int i = 0; i < 10; i++)
        {
            values.add(num * i);
        }
    }

    public String find(int num)
    {
        if (values.contains(num))
            return "Found";
        else
            return "NOT Found";
    }

    public boolean canAdd(int num)
    {
        return values.add(num);
    }

    public void print()
    {
       for (int i : values)
       {
           System.out.println(i);
       }
    }
}
