package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 05/05/2017.
 */

public class Item {

    private String grocery;
    private int price; // all pricing in pence convert to pounds at end
    private boolean isBogof;

    public Item( String grocery, int price, boolean isBogof){
        this.grocery = grocery;
        this.price = price;
        this.isBogof = isBogof;
    }

    public String getGrocery(){return grocery;}
    public int getPrice(){return price;}
    public boolean getIsBogof(){return isBogof;}

}
