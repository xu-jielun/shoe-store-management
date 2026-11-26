import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe("Nike Air Force 1", 40, "White", 2500000, 5);
        Shoe shoe2 = new Shoe("Adidas Samba", 39, "Black", 2200000, 3);
        Shoe shoe3 = new Shoe("Converse Chuck Taylor", 38, "Red", 1500000, 8);
        Shoe shoe4 = new Shoe("Puma Suede", 41, "Blue", 1800000, 4);
        Shoe shoe5 = new Shoe("Vans Old Skool", 42, "Black and White", 1700000, 6);
        Shoe shoe6 = new Shoe("Adizero Evo SL", 41, "Pink", 3000000, 999);

        Inventory inventory = new Inventory();
        inventory.addShoe(shoe1);
        inventory.addShoe(shoe2);
        inventory.addShoe(shoe3);
        inventory.addShoe(shoe4);
        inventory.addShoe(shoe5);
        inventory.addShoe(shoe6);

        Scanner input = new Scanner(System.in);

        // System.out.println("Enter shoes name: ");
        // String shoeName = input.nextLine();

        // System.out.println("Enter color: ");
        // String shoeColor = input.nextLine();

        // System.out.println("Enter size: ");
        // int shoeSize = input.nextInt();

        // System.out.println("Enter amount: ");
        // int amount = input.nextInt();

        // boolean sold = inventory.sellShoe(shoeName, shoeColor, shoeSize, amount);
        // System.out.println("Sell successful: " + sold);

        boolean restocked = inventory.restockShoe("Nike Air Force 1", "White", 40, 3);
        System.out.println("Restock successful: " + restocked);

        inventory.displayShoes();
        input.close();
    }
}
