package ie.atu;

public class Dessert implements MenuItem{
    private String name;
    private double price;
    private String flavour;

    public Dessert(String name, double price, String flavour) {
        this.name = name;
        this.price = price;
        this.flavour = flavour;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return flavour;
    }
}
