package programsDayOne;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter input : ");
        char ch = scanner.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println(ch + " is a vowel");
        else
            System.out.println(ch + " is a consonant");
    }
}
