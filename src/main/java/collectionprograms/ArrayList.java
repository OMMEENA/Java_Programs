package collectionprograms;

public class ArrayList extends java.util.ArrayList {
    public static void main(String[] args) {

        //Add method
        ArrayList List = new ArrayList();
        List.add(2);
        List.add(4);
        List.add(6);
        List.add(8);
        System.out.println("Array list elements are: "+List);

        //get method
        try {
            Object element = List.get(2);
            System.out.println("Elements is: "+element);
        } catch (Exception e) {
            System.out.println("out of index");
        }

        //Remove method
        List.remove(2);
        System.out.println("Elements are removed: "+List);

        //Displayed method
        for( Object Arraylist : List ){
            System.out.println("Elements are displayed: "+Arraylist);
        }
    }
}