package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String args[]){
        MenuItem[] menuItems = new MenuItem[]{
                new Burger("Cheese Burger", 9.50, "Cheese"), new Pizza("Meat Deluxe", 15.30, "Chicken, Mushroom, Meatballs"), new Salad("Cesar Salad", 5.50, "Romaine lettuce, Croutons, Cesar Dressing")
        };

        for (MenuItem menuItem : menuItems)
        {
            System.out.println("Name: " + menuItem.getName() + "\nDescription: " + menuItem.getDescription() + "\nPrice: " + menuItem.getPrice() + "\n");
        }

        double totalCost = 0;

        for (MenuItem menuItem : menuItems)
        {
            totalCost+= menuItem.getPrice();
        }

        System.out.println("Total Cost: " + totalCost );

    }

}
