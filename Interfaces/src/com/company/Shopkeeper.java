package com.company;

public class Shopkeeper extends Person implements Seller{
    Shopkeeper(String name){
        super(name);
    }
    @Override
    public String chat(){
        return "Hi, I'm a Shopkeeper!";
    }
@Override
   public void sellGoods(){
        //Todo come back to implement sell goods
    }
}
