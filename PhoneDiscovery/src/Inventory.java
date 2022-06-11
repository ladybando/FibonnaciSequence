public class Inventory  {
    private String make;    // company
    private String model;            // specific model
    private double price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public Inventory(String store_name, String store_street_name, String store_city_state, String store_phone_number, String phone_make, String phone_model, double phone_price, int phone_quantity) {
        make = phone_make;
        model = phone_model;
        price = phone_price;
        quantity = phone_quantity;
    }

    public Inventory(String store_name, String store_street_name, String store_city_state, String store_phone_number) {
    }

    public static Smartphone[] showPhones(){
        Smartphone[] phones = Smartphone.createPhones();
        for ( Smartphone phone : phones) {
            System.out.println(
                            "Make and Model: " + phone.getMake() + phone.getModel() + "\n" +
                            "Software: " + phone.getOs() + "\n" +
                            "Memory: " + phone.getRam() + "\n" +
                            "Amount of Cameras: " + phone.getCamera_lenses() + "\n" +
                            "Price: " + phone.getPrice() + "\n" +
                            "Store Quantity: " + phone.getQuantity() + "\n"   +
                            "\n--------------____---(o)_(o)---____----------------\n");
        }
        return phones;
    }

}
