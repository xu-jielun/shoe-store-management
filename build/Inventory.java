import java.util.ArrayList;

public class Inventory {
    private ArrayList<Shoe> shoes = new ArrayList<>();

    public void addShoe(Shoe shoe){
        shoes.add(shoe);
    }

    public void displayShoes() {
    for (Shoe shoe : shoes) {
        System.out.println(shoe);
        }
    }

    public boolean sellShoe(String name, String color, int size, int amount) {
    for (Shoe shoe : shoes) {
        if (shoe.getName().equalsIgnoreCase(name) 
            && shoe.getSize() == size
            && shoe.getColor().equalsIgnoreCase(color)) {
            return shoe.sell(amount);
        }
    }
    return false;
}

    public boolean restockShoe(String name, String color, int size, int amount){
        for (Shoe shoe : shoes){
            if (shoe.getName().equalsIgnoreCase(name)
                && shoe.getColor().equalsIgnoreCase(color)
                && shoe.getSize() == size)
                return shoe.addStock(amount);
        }
        return false;
    }

    
}