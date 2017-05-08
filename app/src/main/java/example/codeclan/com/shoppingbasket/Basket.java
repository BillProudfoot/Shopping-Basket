package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        public static class MainActivity {
        }


    private Item<String, Integer> countItem = new HashMap<String, Integer>();
    for(int i=0; i<basket.size() i++){
        Integer myItems = basket.get(i);
        if(countItem.getQtys(myItems)!= null){
            Integer currentCount = countItem.getQtys(myItems);
            currentCount = currentCount.intValue()+1;
            countItem.put(myItems,currentCount);}
        else{
            countItem.put(myItems,1);
        }
    }

    Set<Integer> qtys = countItem.keySet();
   for(Integer num: qtys);{
        System.out.println("Grocery "+num.intValue()+" count "+countItem.getQtys(num).intValue());
    }

}


