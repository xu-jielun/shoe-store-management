public class Shoe extends Product{
    private int size;
    private String color;

    public Shoe(String name, int size, String color, double cost, int qty){
        super(name, cost, qty);
        this.size=size;
        this.color=color;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size=size;
    }

    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    @Override 
    public String toString(){
        return "Shoe[" + getName() + "," + size + "," + color + ","
        + getCost() + "," + getQty() + "]";
    }
}