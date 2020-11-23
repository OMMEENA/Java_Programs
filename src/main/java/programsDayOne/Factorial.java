package programsDayOne;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x  = scanner.nextInt();

        int factorial = fact(x);
        System.out.println("Factorial of given number is: "+factorial);

    }

    static int fact(int n) {
        int output;

        if (n == 1){
            return 1;
        }

        output = fact(n - 1)*n;
        return output;
    }
}
