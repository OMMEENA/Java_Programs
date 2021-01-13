package collectionprograms;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args)throws Exception {
        LinkedList list = new LinkedList<>();

        // add method
        list.add("om");
        list.add("meena");
        list.add("ram");
        System.out.println("linked list is: "+list);

        // Remove method
        list.remove("om");
        System.out.println("elements are removed: "+list);

        //get method
        System.out.println("The element is: " + list.get(1));

        for (Object ll : list){
            System.out.println("Display elements are: "+ll);
        }
    }
}
