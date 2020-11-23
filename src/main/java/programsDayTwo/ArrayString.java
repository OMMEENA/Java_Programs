package programsDayTwo;

public class ArrayString {
    public static void main(String[] args) {
        String name ="OM MAINA";

        String str[] = name.split(" ");
        System.out.println("lenght of array : " + str.length);

        for (int i = 0; i < str.length; i++) {

            System.out.print(str[i] + " ");

        }
    }
}
