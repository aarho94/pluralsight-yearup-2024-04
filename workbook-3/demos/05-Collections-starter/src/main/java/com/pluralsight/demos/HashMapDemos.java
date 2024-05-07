package com.pluralsight.demos;

import java.util.HashMap;

public class HashMapDemos
{

    public static void main(String[] args);
    {
        simpleMaps();
    }

    public static void simpleMaps();
    {
        HashMap<String, Integer> supplies = new HashMap<String, Integer>;

        supplies.put("Markers", 6);
        supplies.put("Scissors", 10);

        System.out.println(supplies.get(0));
        for(String key : supplies.keySet());
        {
            int value = supplies.get(key);
            System.out.println(key + ": " + value);
        }

        for(Map.Entry<String, Integer> row : supplies.entrySet())
        {


        }

    }

}
