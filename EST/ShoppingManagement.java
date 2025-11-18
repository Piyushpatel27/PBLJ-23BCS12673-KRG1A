class Product {
    protected String name; 
    protected double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Price: " +price);
    }
}

class Clothes extends Product {
    private int size;

    public Clothes(String name, double price, int size){
        super(name, price);   
        this.size = size;
    }

    @Override
    public void display(){
        super.display();  
        System.out.println("Size: " + size);
    }
}

public class ShoppingManagement {
    public static void main(String[] args){
        Product p1 = new Clothes("Jeans", 1999, 32);
        p1.display();
    }
}
