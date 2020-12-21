package Module8Project1;

import java.util.ArrayList;

/**
 *
 * @author austinspencer
 * 
 * This program will implement the Bag interface and override the abstract methods
 * within the Bag interface
 * Also in MyBag ArrayList is used to store items in it
 * 
 * 
 */
public class MyBag <T> implements Bag <T>{
    
    
    private ArrayList<T> MyBagList;
    /**
     * constructor class which creates the MYBagList as an array list with no bounds
     */
    public MyBag(){
        MyBagList = new ArrayList<>();
    }
    
    

    @Override
    /**
     * overrides the isEmpty method and will return true or false
     */
    public boolean isEmpty() {
        if (MyBagList.size() == 0)
            return true;
        else
            return false;           
    }

    @Override
    /**
     * @return size of the list
     */
    public int size() {
        return MyBagList.size(); // Uses ArrayList built in Size method
    }

    @Override
    /**
     * @param T item is the item that will be added to the list
     */
    public void add(T item) {
        MyBagList.add(item);
    }
    /**
     * 
     * @return str which is the complete contents of the list
     * uses for-each loop
     */
    @Override
    public String toString(){
        String str = "";
        for (T element: MyBagList)
            str += element + "\n";
        return str;
    }
}
