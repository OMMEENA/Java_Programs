package programsDayThree;

import java.util.Scanner;

import static java.lang.System.out;

public class FlowControl {
    //    public static void main(String[] args) {
//        int x = 20;
//        if (x>=10) {
//
//            System.out.println("true");
//        }else {
//            System.out.println("hello");
//        }
//    }
//}

    //for Switch
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        out.println("Enter A Number: ");
        int x = scanner.nextInt();
        switch (x)
        {
            default:
                System.out.println("Please provide Valid Input");
                break;
            case 1:
                out.println("Monday");
                break;
            case 2:
                out.println("Tuesday");
                break;
            case 3:
                out.println("Wednesday");
                break;
            case 4:
                out.println("Thursday");
                break;
            case 5:
                out.println("Friday");
                break;
            case 6:
                out.println("saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;

        }
    }
}
