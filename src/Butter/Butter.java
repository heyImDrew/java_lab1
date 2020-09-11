package Butter;

public class Butter {
    private String name;
    private boolean herbal_supplement;
    private double price;

    public Butter() {
        name = "Default";
        herbal_supplement = false;
        price = 0;
    }
    public Butter(String new_name, boolean new_herbal_supplement, double new_price) {
        name = new_name;
        herbal_supplement = new_herbal_supplement;
        price = new_price;
    }
    public Butter(String new_name, double new_price) {
        name = new_name;
        herbal_supplement = false;
        price = new_price;
    }

    public String get_name() {
        return name;
    }

    public String get_information() {
        String h_s;
        h_s = herbal_supplement ? "Are herbal supplement" : "No herbal supplement";
        return "Name: " + name + ", " + h_s + ", Price: " + price;
    }
}
