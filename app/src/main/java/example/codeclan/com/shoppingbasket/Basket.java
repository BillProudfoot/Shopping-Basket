package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 05/05/2017.
 */

public class Basket {
    private String item;
    private int quantity;

    public Basket( String item, int quantity){
        this.item = item;
        this.quantity = quantity;

    }

    public String getItem(){return item;}
    public int getQuantity(){return quantity;}

}
