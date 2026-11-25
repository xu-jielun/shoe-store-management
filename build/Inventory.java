import java.util.ArrayList;

public class Inventory {
    private ArrayList<Shoe> shoes = new ArrayList<>();

    public void addShoe(Shoe shoe){
        shoes.add(shoe);
    }

    public void displayShoes(){
        System.out.println(shoes);
    }

    public boolean sellShoe(String name, int amount) {
    for (Shoe shoe : shoes) {
        if (shoe.getName().equalsIgnoreCase(name)) {
            return shoe.sell(amount);
        }
    }
    return false;
}
}