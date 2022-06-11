package com.company;

public class Person implements Chattable {
    String name;
    Person( String name){
        this.name = this.name;
    }
    @Override
    public String chat(){
        return "Hi, I'm a person.";
    }
}
