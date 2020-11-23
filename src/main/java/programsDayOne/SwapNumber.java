package programsDayOne;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int x,y,z;
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter a value: X & Y");
        x= scanner.nextInt();
        y= scanner.nextInt();
        System.out.println("Before Swaping \n"+ x +"  " +y );

        z=x;
        x=y;
        y=z;

        System.out.println("After swaping \n"+ x +" " + y);


    }
}
