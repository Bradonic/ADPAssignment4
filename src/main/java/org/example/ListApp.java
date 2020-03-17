package org.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListApp
{
    List<Integer> values = new LinkedList();

    public void populate(int num)
    {
        for (int i = 0; i < 10; i++)
        {
            values.add(num + i);
        }
        Collections.reverse(values);
    }

    public int findAt(int index)
    {
        return values.get(index);
    }

    public void print()
    {
        for (int value : values)
        {
            System.out.println(value);
        }
    }
}
