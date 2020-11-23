package arrayPrograms;

public class MaxAndMin {

    public static void main(String[] args) {
        int x[] = {10, 70, 30, 40, 50, 60};
        //System.out.println("lenght of array : " + arr.length);
        MaxAndMin maxAndMin = new MaxAndMin();
        int max = maxValue(x);
        int min = minValue(x);
        System.out.println("Min number is:" + min);
        System.out.println("Max number is:" + max);
    }

    //    method returns max value
    public static int maxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //    method returns min value
    public static int minValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
