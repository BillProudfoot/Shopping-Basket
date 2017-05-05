package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 05/05/2017.
 */

public class TopItems {

    private ArrayList<Item> list;

    public TopItems(){
        list = new ArrayList<Item>();
        list.add(new Item("Bread", 165, false));
        list.add(new Item("Milk", 105, false));
        list.add(new Item("Butter", 180, false));
        list.add(new Item("Cheese", 350, false));
        list.add(new Item("Eggs", 175, false));
        list.add(new Item("Bacon", 299, false));
        list.add(new Item("Red Wine", 750, false));
        list.add(new Item("White Wine", 650, false));
        list.add(new Item("Tea", 300, false));
        list.add(new Item("Coffee", 400, false));
        list.add(new Item("Sugar", 100, false));
        list.add(new Item("Porridge", 250, false));
        list.add(new Item("Jam", 150, false));
        list.add(new Item("Peanut Butter", 160, false));
        list.add(new Item("Tomato sauce", 250, false));
        list.add(new Item("Salt", 200, false));
        list.add(new Item("Pepper", 200, false));
        list.add(new Item("Washing Powder", 500, false));
        list.add(new Item("Flash", 270, false));
        list.add(new Item("Chicken", 400, false));
    }

    public ArrayList<Item> getList(){return new ArrayList<Item>(list);}

//    public static ItemsActivity{
//
//    }
}
