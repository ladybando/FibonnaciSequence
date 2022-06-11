package com.company;

public class Main {
    public static void main (String[] args){
        // Create Objects
        Shopkeeper shopKeeper = new Shopkeeper("Larry");
        Teacup teacup = new Teacup();
        String treehouse = "Treehouse";

// Loop through Objects
        Object[] objects = {shopKeeper, teacup, treehouse};

        for (Object object : objects) {
            if (object instanceof Chattable) {
                String response = ((Chattable) object).chat();
                System.out.println(response);
            }
        }

// Loop through Chattables
        Chattable[] chattables = {shopKeeper, teacup};
        System.out.println("\n");
        for (Chattable chattable : chattables) {
            String response = chattable.chat();
            System.out.println(response);
        }
    }
}
