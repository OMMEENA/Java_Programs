package inheritance;

public class DemoInheritance {
    public static final int salary = 94000;
}

    class demo extends DemoInheritance {
    private static int bonus = 10000;

    public static void  main(String[] args) {
        demo tol = new demo();


        System.out.println("your salary is "+salary);
        System.out.println("And bonus is "+bonus);

         float total;
         total = salary+bonus;
        System.out.println("Total salary is "+total);
    }
}