import java.util.ArrayList;

public class ShoppingList {
    
    private ArrayList<String> GroseryList;

    public ShoppingList(){
        GroseryList = new ArrayList<String>();
    }

    public ArrayList<String> getGroseryList(){
        return GroseryList;
    }

    public void setGroseryList(ArrayList<String> NewGroseryList){
        this.GroseryList = NewGroseryList;
    }

    public boolean addNewItem(String item){
        return GroseryList.add(item);
    }

    public void printItems(){
        for(int i = 0; i < GroseryList.size(); i++){
            System.out.println(GroseryList.get(i));
        }
    }

    public static void main(String[] args){
        /*Initialize a ShoppingList instance */
        ShoppingList sl = new ShoppingList();
        /*Creation of items */
        sl.addNewItem("Milk");
        sl.addNewItem("Eggs");
        sl.addNewItem("Beacon");
        /*Printing the items */

        sl.printItems();

        /*Creating a new array */
        ArrayList<String> newShoppingList =  new ArrayList<String>();
        newShoppingList.add("Bread");
        newShoppingList.add("Butter");
        newShoppingList.add("Cheese");

        /*Replacing the exisiting shopping list with a new one and printing them */
        sl.setGroseryList(newShoppingList);
        sl.printItems();
    }
}
