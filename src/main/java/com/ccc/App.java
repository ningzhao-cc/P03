package com.ccc;

import chief.Builder;

import client.CompanyOrder;
import client.CompanyOrderPrototype;
import client.Customer;
import client.Order;
import com.sun.org.apache.regexp.internal.RE;
import eatclub.EatclubFactory;
import lunch.Food;
import static subway.Sub.*;

import noodlehouse.NoodlehouseFactory;
import receipt.Receipt;
import restaurant.Factory;
import subway.SubwayFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException {
        // abstract factory
        // client wants to have a lunch in a restaurant
        //Factory factory;
        //Scanner in = new Scanner(System.in);
        //
        //do {
        //    System.out.println("please select a restaurant: eatclub / noodlehouse / subway ? ");
        //    String restaurant = in.nextLine();
        //
        //    switch (restaurant) {
        //        case "eatclub" :
        //            factory = new EatclubFactory();
        //            break;
        //        case "noodlehouse" :
        //            factory = new NoodlehouseFactory();
        //            break;
        //        case "subway" :
        //            factory = new SubwayFactory();
        //            break;
        //        default:
        //            factory = new EatclubFactory();
        //
        //    }
        //
        //    Food food = factory.getFood();
        //    food.print();
        //    System.out.println("you have your food " + food.toString());
        //
        //}
        //while (true);


        // builder
        /** client gives params during the building process, the process is encapsulated in the builder side**/
        //SubwayFactory subwayFactory = new SubwayFactory();
        //Builder builder = subwayFactory.getSubBuilder();
        //builder.setSpicy(Spicy.HOT).setOven(true).setSize(Size.LARGE);
        //
        //Food sub = builder.getFood();
        //
        ///** since the methods like sub.setSpicy() are protected, cannot be reached here**/
        ///** now you get the sub, and cannot modify it by client side. Thanks for Nathan**/
        //
        //System.out.println(sub.getClass());
        //sub.print();

        /**11 builder is actually a building process for a single real product.**/
        //builder.setSize(Size.MEDIUM);
        //
        //System.out.println(sub.getClass());
        //sub.print();


        //// prototype
        //Customer ning = new Customer();
        //ning.order.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.SMALL).getFood());
        //System.out.println(ning.getClass() + " ning's order: ");
        //ning.order.print();
        //Receipt ningReceipt = ning.order.getReceipt();
        //System.out.println("ning's old receipt: ");
        //System.out.println(ningReceipt);
        //ningReceipt.print();
        //Receipt ningReceiptToNathan = (Receipt) ningReceipt.clone();
        //System.out.println("ning's receipt shared to Nathan: ");
        //System.out.println(ningReceiptToNathan);
        //ningReceiptToNathan.print();
        ////
        //System.out.println("-----------");
        //
        //ning.order.addOrder(new EatclubFactory().getNoodle());
        //System.out.println(ning.getClass() + " ning's order: ");
        //ning.order.print();
        //
        //
        //System.out.println("ning's old receipt: ");
        //ningReceipt.print();
        //System.out.println("ning's receipt shared to Nathan: ");
        //ningReceiptToNathan.print();
        //
        //System.out.println("-----------");


        //ningReceipt = ning.order.getReceipt();
        //System.out.println("ning's new receipt: ");
        //ningReceipt.print();


        //System.out.println("*************");
        //Customer nathan = new Customer();
        //nathan.order.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
        //nathan.order.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.MEDIUM).setOven(true).setSpicy(Spicy.DEAD).getFood());
        //System.out.println(nathan.getClass() + " nathan's order: ");
        //
        //nathan.order.print();
        //
        //System.out.println("**********");


        //// Singleton
        //CompanyOrder cloudcarOrder = CompanyOrder.getInstance();
        //
        //cloudcarOrder.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.SMALL).getFood());
        //System.out.println(cloudcarOrder.getClass() + " company's order: ");
        //cloudcarOrder.print();
        //
        //CompanyOrder cloudcarOrder2 = CompanyOrder.getInstance();
        //
        //
        //cloudcarOrder2.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
        //cloudcarOrder2.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.MEDIUM).setOven(true).setSpicy(Spicy.DEAD).getFood());
        //System.out.println(cloudcarOrder2.getClass() + " company's order: ");
        //
        //cloudcarOrder2.print();
        //
        //System.out.println("cloudcarOrder address:" + cloudcarOrder);
        //System.out.println("cloudcarOrder2 address:"+ cloudcarOrder2);


        //// Singleton vs Prototype
        //CompanyOrderPrototype cloudcarOrder = CompanyOrderPrototype.getInstance();
        //
        //cloudcarOrder.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.SMALL).getFood());
        //System.out.println(cloudcarOrder.getClass() + " company's order: ");
        //cloudcarOrder.print();
        //
        //CompanyOrderPrototype cloudcarOrder2 = CompanyOrderPrototype.getInstance();
        //
        //
        //
        //CompanyOrderPrototype cloudcarOrderCopy = (CompanyOrderPrototype) cloudcarOrder2.clone();
        //
        //cloudcarOrder2.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
        //cloudcarOrder2.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.MEDIUM).setOven(true).setSpicy(Spicy.DEAD).getFood());
        //System.out.println(cloudcarOrder2.getClass() + " company's order: ");
        //
        //cloudcarOrder2.print();
        //
        //System.out.println("cloudcarOrder address:" + cloudcarOrder);
        //System.out.println("cloudcarOrder2 address:"+ cloudcarOrder2);
        //System.out.println("cloudcarOrderCopy address:"+ cloudcarOrderCopy);
        //
        //cloudcarOrderCopy.print();



        // // use reflection, changed the access of the constructor to be PUBLIC, then able to create multiple instances for a singleton class
        //try {
        //    Constructor<CompanyOrder> constructor = CompanyOrder.class.getDeclaredConstructor();
        //    constructor.setAccessible(true);
        //    CompanyOrder order1 = constructor.newInstance();
        //    order1.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
        //    order1.print();
        //    System.out.println(order1.toString());
        //    CompanyOrder order2 = constructor.newInstance();
        //    order2.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.MEDIUM).setOven(true).setSpicy(Spicy.DEAD).getFood());
        //    order2.print();
        //    System.out.println(order2.toString());
        //} catch (NoSuchMethodException e) {
        //    e.printStackTrace();
        //} catch (IllegalAccessException e) {
        //    e.printStackTrace();
        //} catch (InstantiationException e) {
        //    e.printStackTrace();
        //} catch (InvocationTargetException e) {
        //    e.printStackTrace();
        //}


        // // ClassLoader

        ClassLoader classLoader = CompanyOrder.class.getClassLoader();
        ClassLoader classLoader1 = CompanyOrder.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader1);
        try {
            Class companyOrderClass = classLoader.loadClass("client.CompanyOrder");
            Class companyOrderClass1 = classLoader1.loadClass("client.CompanyOrder");

            System.out.println(companyOrderClass);
            System.out.println(companyOrderClass1);

            try {
                CompanyOrder companyOrder = (CompanyOrder) companyOrderClass.newInstance();
                companyOrder.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
                companyOrder.print();
                System.out.println("companyOrder address: " + companyOrder);
                CompanyOrder companyOrder1 = (CompanyOrder) companyOrderClass1.newInstance();
                companyOrder1.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.MEDIUM).setOven(true).setSpicy(Spicy.DEAD).getFood());
                companyOrder1.print();
                System.out.println("companyOrder1 address: " + companyOrder1);

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
