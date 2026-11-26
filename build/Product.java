public abstract class Product {
    private String name;
    private double cost;
    private int qty;

    public Product(String name, double cost, int qty){
        this.name=name;
        this.cost=cost;
        this.qty=qty;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty=qty;
    }

    @Override 
    public String toString(){
        return "Product[" + name + "," + cost + "," + qty +"]";
    }

    public boolean addStock(int amount){
        if (amount<=0){
            return false;
        }

        qty += amount;
        return true;
    }
}
