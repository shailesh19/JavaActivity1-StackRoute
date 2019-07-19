package com.stackroute;
import java.util.*;

public class test
{

    public static void main(String[] args)
    {
        System.out.println("Enter burger type: 1. Hamburger  2. Healthy Burger | Select 1 or 2!");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type == 1)
        {

            HealthyBurger burger = new HealthyBurger("Basic", "Chicken");
            System.out.println("Do you want to add carrot? Input y or n");
            String additem1 = sc.next();
            if (additem1.equals("y"))
            {
                burger.setCarrot(1);
            }
            System.out.println("Do you want to add lettuce? Input y or n");
            String additem2 = sc.next();
            if (additem2.equals("y"))
            {
                burger.setLettuce(1);
            }
            System.out.println("Do you want to print the bill");
            String ans = sc.next();
            if (ans.equals("y"))
            {
                burger.setPrice(1);
                System.out.println(burger.getPrice());
            }
        }
        else
            {
            HealthyBurger burger = new HealthyBurger("Basic", "Chicken");
            System.out.println("Do you want to add carrot? Input y or n");
            String additem1 = sc.next();
            if (additem1.equals("y"))
            {
                burger.setCarrot(1);
            }
            System.out.println("Do you want to add lettuce? Input y or n");
            String additem2 = sc.next();
            if (additem2.equals("y"))
            {
                burger.setLettuce(1);
            }
            System.out.println("Do you want to add cucumber? Input y or n");
            String additem3 = sc.next();
            if (additem3.equals("y"))
            {
                burger.setCucumber(1);
            }
            System.out.println("Do you want to add jalapenos? Input y or n");
            String additem4 = sc.next();
            if (additem4.equals("y"))
            {
                burger.setJalapenos(1);
            }
            System.out.println("Do you want to print the bill");
            String ans = sc.next();
            if (ans.equals("y"))
            {
                burger.setPrice(1);
                System.out.println(burger.getPrice());
            }
            else
                System.out.println("Then You have to Wash the dishes!!!");
        }
    }
}
