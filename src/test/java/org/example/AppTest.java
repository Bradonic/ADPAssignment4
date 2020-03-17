package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest 
{

    @Test
    public void CollectionTest()
    {
        CollectionApp collectionApp = new CollectionApp();
        collectionApp.populate(5);
        assertTrue(collectionApp.find(5));
    }

    @Test
    public void MapTest()
    {
        MapApp mapApp = new MapApp();
        mapApp.populate();
        assertEquals("Jim", mapApp.findValueAt("1"));
    }

    @Test
    public void SetTest()
    {
        SetApp setApp = new SetApp();
        setApp.populate(2);
        assertEquals("Found", setApp.find(2));
        assertFalse(setApp.canAdd(2));
    }

    @Test
    public void ListTest()
    {
        ListApp listApp = new ListApp();
        listApp.populate(5);
        assertEquals(12, listApp.findAt(2));
    }
}
