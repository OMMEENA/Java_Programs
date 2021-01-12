package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Test {
//    public static void main(String[] args) {
//        String str = "malayalam";
//
//        int i =0;
//
//        while(i<str.length()-i){
//
//            if(str.charAt(i) != str.charAt(str.length()-i-1)){
//                System.out.println("String not Palindrome");
//            }
//            i++;
//        }
//        System.out.println("String is Palindrome");
//    }
//
//}
public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
    System.out.println("How many elements you want to add to the array: ");
    int n= Integer.parseInt(in.readLine());
    String[] name = new String[n];

    for(int i = 0; i < n; i++) {
        name[i] = in.readLine();
    }
    List<String> list = Arrays.asList(name);
    System.out.println();

    for(String li: list) {
        String str = li;
        System.out.print(str + " ");
    }
}
}