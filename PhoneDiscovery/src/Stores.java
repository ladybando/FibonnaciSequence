public class Stores {
    String name;			// name of the store
    String street_name;			// street address of the store
    String city_state;
    String phone_number;


    public Stores(String store_name, String store_street_name, String store_city_state, String store_phone_number) {
        name = store_name;
        street_name = store_street_name;
        city_state = store_city_state;
        phone_number = store_phone_number;
    }

    public static Stores[] createStore(){
        Stores[] stores = new Stores[0]; //creates array to hold stores
        //creates new stores objects
        Stores newyork = new Stores("New York", "123 The Street", "NY, NY", "(917)777-7777)");
        Stores newjersey = new Stores("New Jersey", "456 The Street", "Long Beach, NJ", "(609)333-3333");
        Stores penn = new Stores("Pennsylvania", "789 The Street", "Philadelphia, PA", "(215)232-2222");
        //iterates and returns all stores to be printed in Smartphone class
        stores = new Stores[]{newyork,newjersey,penn}; //adds new objects to stores array
        for ( Stores store : stores) {
            System.out.printf(store.name + ":\n" + store.street_name + "\n" + store.city_state + "\n" + store.phone_number + "\n\n");
        }
        return stores;
    }

}
