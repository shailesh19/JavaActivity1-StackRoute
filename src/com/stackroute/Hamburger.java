package com.stackroute;

public class Hamburger
{

    private String rolltype; //private field declarations.
    private String meat;
    private int baseprice = 5;
    private int lettuce;
    private int carrot;
    private int price;
    private int tomato;

    public Hamburger(String rolltype, String meat) //parameterised constructor
    {
        this.rolltype = rolltype;
        this.meat = meat;
    }

    public int getBaseprice()  //getter method for baseprice
    {
        return baseprice;
    }

    public int getTomato()  //getter method for tomato
    {
        return tomato;
    }

    public void setTomato(int tomato)  //setter method for tomato
    {
        this.tomato = tomato;
    }

    public int getPrice()  //getter method for getting the price
    {
        return price;
    }

    public void setPrice(String str)   //Setter method for calculating price of burger
    {
        this.price = this.baseprice+this.carrot+this.lettuce;

    }

    public int getCarrot()          //getter method for getting carrot
    {
        return carrot;
    }

    public void setCarrot(int carrot)        //setter method for setting carrot
    {
       this.carrot = carrot;
    }

    public int getLettuce()                 //getter method for getting lettuce
    {
        return lettuce;
    }

    public void setLettuce(int lettuce)        //setter method for getting lettuce
    {
        this.lettuce = lettuce;
    }
}

