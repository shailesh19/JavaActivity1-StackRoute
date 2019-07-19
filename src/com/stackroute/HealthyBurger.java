package com.stackroute;

public class HealthyBurger extends Hamburger
{

    public HealthyBurger(String rolltype, String meat)
    {
        super(rolltype, meat);
    }

    private int cucumber;   //getter method for getting lettuce
    private int jalapenos;
    private int price;

    @Override
    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)   //Setter method for calculating price of burger
    {
       this.price = this.cucumber+this.jalapenos+this.getCarrot()+this.getLettuce()+super.getBaseprice();
    }



    public int getCucumber()        //getter method for setting cucumber
    {
        return cucumber;
    }

    public void setCucumber(int cucumber)        //setter method for setting cucumber
    {
        this.cucumber = cucumber;
    }

    public int getJalapenos()            //getter method for setting jalapenos
    {
        return jalapenos;
    }

    public void setJalapenos(int jalapenos)         //setter method for setting jalapenos
    {
        this.jalapenos = jalapenos;
    }
}
