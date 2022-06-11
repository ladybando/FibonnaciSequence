public class Smartphone extends Inventory{
    private String os;
    private int ram;
    private int camera_lenses;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCamera_lenses() {
        return camera_lenses;
    }

    public void setCamera_lenses(int camera_lenses) {
        this.camera_lenses = camera_lenses;
    }

    public Smartphone(String store_name, String store_street_name, String store_city_state, String store_phone_number, String phone_make, String phone_model, double phone_price, int phone_quantity, String os, int ram, int camera_lenses) {
        super(store_name, store_street_name, store_city_state, store_phone_number, phone_make, phone_model, phone_price, phone_quantity);
        this.os = os;
        this.ram = ram;
        this.camera_lenses = camera_lenses;
    }

    public static Smartphone[] createPhones(){
        Smartphone[] phones;
        Smartphone iphone = new Smartphone("New York", "123 The Street", "NY, NY", "(917)777-7777)","Apple", "iPhone 12 Max", 999.99, 10, "iOS",  512,  5);
        Smartphone note10 = new Smartphone("New Jersey", "456 The Street", "Long Beach, NJ", "(609)333-3333","Samsung", "Note10", 999.99, 5, "Android", 256, 3);
        phones = new Smartphone[]{iphone, note10};
        return phones;
    }


}
