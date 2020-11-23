package programsDayThree;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Float P , R , T , Simpleinterest;
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter the Principal : ");
        P = scanner.nextFloat();

        System.out.print("Enter the Rate : ");
        R = scanner.nextFloat();

        System.out.print("Enter the Time : ");
        T = scanner.nextFloat();

        Simpleinterest = (P*R*T)/100;
        System.out.println("The simple interest is : "+Simpleinterest );
    }
}
