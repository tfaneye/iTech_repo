package collections.concepts.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tunde on 09/01/2017.
 */
public class ExampleArrayFourList {

    private ArrayList<String> myBlackFridayShopping;
    private List<String> names;

    public ExampleArrayFourList(){
        myBlackFridayShopping = new ArrayList<String>();
        // OR
        names = new ArrayList<String>();

        myBlackFridayShopping.add("Camera");
        myBlackFridayShopping.add("iPhone");
        myBlackFridayShopping.add("Sony TV");
        myBlackFridayShopping.add("Laptop");
    }

    public String getItem(int shoppingItem){
        return myBlackFridayShopping.get(shoppingItem);
    }

    public void showAllItems(){
        for (int i = 0; i < myBlackFridayShopping.size(); i++){
            System.out.println(myBlackFridayShopping.get(i));
        }
    }

    public void showAllItemsEnhanced(){
        for (String itemList : myBlackFridayShopping) {
            System.out.println(itemList);

        }
    }
}
