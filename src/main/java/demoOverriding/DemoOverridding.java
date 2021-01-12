package demoOverriding;

import java.util.Scanner;

public class DemoOverridding extends TestOverriding {
//    Scanner scan = new Scanner(System.in);
    public void m1(int i){
//        i = scan.nextInt();
        System.out.println(i);

    }

    public static void main(String[] args) {
        DemoOverridding demo = new DemoOverridding();
        demo.m1(10);
        demo.m1(20);
        demo.m1(30);

    }
}
