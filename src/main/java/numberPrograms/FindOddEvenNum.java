package numberPrograms;

import java.util.Scanner;

public class FindOddEvenNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        System.out.println(num);

        boolean rs = oddEven(num);
        //System.out.println(rs);
        if(rs == true){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }

    public static boolean oddEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
