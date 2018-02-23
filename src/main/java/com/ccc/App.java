package com.ccc;

import chief.Builder;

import lunch.Food;
import static subway.Sub.*;

import subway.SubwayFactory;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // abstract factory
        // client wants to have a lunch in a restaurant



        // builder
        SubwayFactory subwayFactory = new SubwayFactory();
        Builder builder = subwayFactory.getSubBuilder();
        builder.setSpicy(Spicy.HOT).setOven(true).setSize(Size.LARGE);

        Food sub = builder.getFood(); // now you get the sub, and cannot change it by client side. Thanks for Nathan

        System.out.println(sub.getClass());
        sub.print();

        //1
        //builder.setSize(Size.MEDIUM);
        //
        //System.out.println(sub.getClass());
        //sub.print();
    }
}
