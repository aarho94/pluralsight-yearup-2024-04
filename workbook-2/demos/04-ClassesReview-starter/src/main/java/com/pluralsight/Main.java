package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        house house1 = new house("Gray", "Tan");

        System.out.println("Woohoo");
        System.out.println("I have a " + house1.getOutsideColor() + " house");
    }
}