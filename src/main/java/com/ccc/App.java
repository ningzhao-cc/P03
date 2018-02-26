package com.ccc;

import chief.Builder;

import client.CompanyOrder;
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
        /** client gives params during the building process, the process is encapsulated in the builder side**/
        SubwayFactory subwayFactory = new SubwayFactory();
        Builder builder = subwayFactory.getSubBuilder();
        builder.setSpicy(Spicy.HOT).setOven(true).setSize(Size.LARGE);

        Food sub = builder.getFood();
        /** since the methods like sub.setSpicy() are protected, cannot be reached here**/
        /** now you get the sub, and cannot modify it by client side. Thanks for Nathan**/

        System.out.println(sub.getClass());
        sub.print();

        /**11 builder is actually a building process for a single real product.**/
        //builder.setSize(Size.MEDIUM);
        //
        //System.out.println(sub.getClass());
        //sub.print();


        //22
        //Customer ning = new Customer();
        //ning.order.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.SMALL).getFood());
        //System.out.println(ning.getClass() + " ning's order: ");
        //ning.order.print();
        //
        //
        //Customer nathan = new Customer();
        //nathan.order.addOrder(subwayFactory.getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
        //nathan.order.addOrder(subwayFactory.getSubBuilder().setSize(Size.MEDIUM).setOven(true).setSpicy(Spicy.DEAD).getFood());
        //System.out.println(nathan.getClass() + " nathan's order: ");
        //
        //nathan.order.print();


        //33
        //CompanyOrder cloudcar = new CompanyOrder();
        //
        //cloudcar.order.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.SMALL).getFood());
        //System.out.println(cloudcar.getClass() + " company's order: ");
        //cloudcar.order.print();
        //
        //CompanyOrder cloudcar2 = new CompanyOrder();
        //
        //cloudcar2.order.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
        //cloudcar2.order.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.MEDIUM).setOven(true).setSpicy(Spicy.DEAD).getFood());
        //System.out.println(cloudcar2.getClass() + " company's order: ");
        //
        //cloudcar2.order.print();

    }
}
