package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 05/05/2017.
 */

public class Basket {

    private ArrayList<Item> basket;

    public Basket(){
        basket = new ArrayList<Item>();
        basket.add(new Item("Bread", 165, false));
        basket.add(new Item("Milk", 105, false));
        basket.add(new Item("Cheese", 350, true));
        basket.add(new Item("Red Wine", 750, true));
        basket.add(new Item("Red Wine", 750, true));
        basket.add(new Item("Cheese", 350, true));
        basket.add(new Item("Cheese", 350, true));

    }

    public ArrayList<Item> getBasket(){return new ArrayList<Item>(basket);}

        public static class TasksActivity {
        }

}


