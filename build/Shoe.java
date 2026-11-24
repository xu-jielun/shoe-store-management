//tên, size, màu, giá và số lượng.

public class Shoe{
    private String name;
    private int size;
    private String color;
    private double cost;
    private int qty;

    public Shoe(String name, int size, String color, double cost, int qty){
        this.name = name;
        this.size = size;
        this.color = color;
        this.cost = cost;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost){
        this.cost=cost;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty=qty;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "Shoe[" + name + ", " + size + ", " + color + ", " + cost + ", " + qty + "]";
    }
}