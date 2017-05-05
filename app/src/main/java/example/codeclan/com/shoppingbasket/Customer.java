package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 05/05/2017.
 */

public class Customer {
    private String name;
    private boolean isLoyaltyCardholder;

    public Customer( String name, boolean isLoyaltyCardholder){
        this.name = name;
        this.isLoyaltyCardholder = isLoyaltyCardholder;
    }

    public String getName(){return name;}
    public boolean getIsLoyaltyCardholder(){return isLoyaltyCardholder;}

}
