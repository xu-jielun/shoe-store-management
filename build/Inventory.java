import java.util.ArrayList;

public class Inventory {
    private ArrayList<Shoe> shoes = new ArrayList<>();

    public void addShoe(Shoe shoe){
        shoes.add(shoe);
    }

    public void displayShoes(){
        System.out.println(shoes);
    }

    public void searchByName(String name){
        
    }
}
