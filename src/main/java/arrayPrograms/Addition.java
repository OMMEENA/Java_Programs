package arrayPrograms;

public class Addition {
    static int result = 0;

    public static void main(String[] args) {
        int x[] = {10, 70, 30, 40, 50, 60};
        Addition  addition = new Addition();
        result = addition.additionValue(x);

        System.out.println("sum of array is "+result);

    }
    //    Method for Addition
    int additionValue(int[]arr){
        int sum =0;
        int i;
        for (i = 0; i < arr.length; i++ ){
            sum += arr[i];

        }
        return sum;
    }
}

