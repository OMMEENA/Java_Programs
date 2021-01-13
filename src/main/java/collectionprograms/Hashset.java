package collectionprograms;

import java.util.HashSet;

public class Hashset {

    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();

        // add method
        hs.add("yash");
        hs.add("om");
        hs.add("ram");
        System.out.println("HashSet elements : " + hs);

        //remove method
        hs.remove("om");
        System.out.println("element is removed"+hs);

        //dispaly method
        for( String hashset : hs ){
            System.out.println(hashset);
            }
        }
}
