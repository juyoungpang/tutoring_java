import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args){
        //Create ArrayList
        ArrayList<Integer> costs = new ArrayList<Integer>();
        //Get ArrayList length (size)
        int size = costs.size();
        System.out.println("Size: "+size);
        //Using all the methods
        //Remove, add (without index), add (with index), get, set
        //costs = 5,6,8,9,10
        costs.add(5);
        costs.add(6);
        costs.add(8);
        costs.add(9);
        costs.add(10);
        size = costs.size();
        System.out.println("Size: "+size);
        //costs = 5,6,7,8,9,10
        costs.add(2,7);
        //cost = 5,7,8,9,10
        int removed = costs.remove(1);
        System.out.println("Removed object: "+removed);
        //cost not changed
        int fetchItem = costs.get(2);
        System.out.println("Got object: "+fetchItem);
        //costs = 4,7,8,9,10
        int setItem = costs.set(0,4);
        System.out.println("Set item: "+setItem);

        //Traversing ArrayList
        // For-loop
        int totalCost = 0;
        for(int i=0;i<costs.size();i++){
            totalCost+=costs.get(i);
        }
        System.out.println(totalCost);

        // Enhanced for loop
        totalCost=0;
        for(int element:costs){
            totalCost+=element;
        }
        System.out.println(totalCost);
    }
}
