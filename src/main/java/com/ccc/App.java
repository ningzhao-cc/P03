package com.ccc;

import chief.Builder;

import client.CompanyOrder;
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


        //22
        Customer ning = new Customer();
        ning.order.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.SMALL).getFood());
        System.out.println(ning.getClass() + " ning's order: ");
        ning.order.print();
        Receipt ningReceipt = ning.order.getReceipt();
        System.out.println("ning's old receipt: ");
        ningReceipt.print();
        Receipt ningReceiptToNathan = (Receipt) ningReceipt.clone();
        System.out.println("ning's receipt shared to Nathan: ");
        ningReceiptToNathan.print();

        System.out.println("-----------");

        ning.order.addOrder(new EatclubFactory().getNoodle());
        System.out.println(ning.getClass() + " ning's order: ");
        ning.order.print();


        System.out.println("ning's old receipt: ");
        ningReceipt.print();
        System.out.println("ning's receipt shared to Nathan: ");
        ningReceiptToNathan.print();

        //System.out.println("-----------");
        //
        //
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


        // // old version
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

        //// new version
        //CompanyOrder cloudcarOrder = CompanyOrder.getInstance();
        //
        //cloudcarOrder.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.SMALL).getFood());
        //System.out.println(cloudcarOrder.getClass() + " company's order: ");
        //cloudcarOrder.print();
        //
        //CompanyOrder cloudcarOrder2 = CompanyOrder.getInstance();
        //
        //cloudcarOrder2.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
        //cloudcarOrder2.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.MEDIUM).setOven(true).setSpicy(Spicy.DEAD).getFood());
        //System.out.println(cloudcarOrder2.getClass() + " company's order: ");
        //
        //cloudcarOrder2.print();



        // // because Order() cannot be reached, this will thrown exception.
        //try {
        //    Order order1 = Order.getInstance().getClass().newInstance();
        //    order1.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
        //    order1.print();
        //    Order order2 = Order.getInstance().getClass().newInstance();
        //    order2.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.MEDIUM).setOven(true).setSpicy(Spicy.DEAD).getFood());
        //    order2.print();
        //} catch (InstantiationException e) {
        //    e.printStackTrace();
        //} catch (IllegalAccessException e) {
        //    e.printStackTrace();
        //}



        // // use reflection, changed the access of the constructor to be PUBLIC, then able to create multiple instances for a singleton class
        //try {
        //    Constructor<Order> constructor = Order.class.getDeclaredConstructor();
        //    constructor.setAccessible(true);
        //    Order order1 = constructor.newInstance();
        //    order1.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
        //    order1.print();
        //    System.out.println(order1.toString());
        //    Order order2 = constructor.newInstance();
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
        //ClassLoader classLoader = Order.class.getClassLoader();
        //try {
        //    Class classLoader1 = classLoader.loadClass("client.Order");
        //
        //
        //    try {
        //        Order order1 = (Order)classLoader1.newInstance();
        //        order1.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.LARGE).setOven(true).setSpicy(Spicy.HOT).getFood());
        //        order1.print();
        //        System.out.println(order1.toString());
        //        Order order2 = (Order) classLoader1.newInstance();
        //        order2.addOrder(new SubwayFactory().getSubBuilder().setSize(Size.MEDIUM).setOven(true).setSpicy(Spicy.DEAD).getFood());
        //        order2.print();
        //        System.out.println(order2.toString());
        //
        //    } catch (InstantiationException e) {
        //        e.printStackTrace();
        //    } catch (IllegalAccessException e) {
        //        e.printStackTrace();
        //    }
        //} catch (ClassNotFoundException e) {
        //    e.printStackTrace();
        //}

    }
}
