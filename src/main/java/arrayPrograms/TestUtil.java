package arrayPrograms;

public class TestUtil {
    public static void main(String[] args) {

        int x[]={12,23,34,40,50};

//        Addition of array
        Addition addition = new Addition();
        System.out.println("addition of array: "+addition.additionValue(x));

//      finding max value
        MaxAndMin maxAndMin = new MaxAndMin();
        System.out.println("Max value of array : "+ maxAndMin.maxValue(x));
        System.out.println("min value of array : "+maxAndMin.minValue(x));




    }

}
