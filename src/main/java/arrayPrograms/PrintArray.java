package arrayPrograms;

public class PrintArray {
    public static void main(String[] args) {
        int x[] = {10, 20, 30, 40, 50, 60};
        System.out.println("lenght of array : " + x.length);

        //printing with for
        for (int i = 0; i < x.length; i++) {

            System.out.print(x[i] + " ");

        }
        System.out.println("  \nwhile");
        //printing with while
        int i = 0;
        while (i < x.length) {
            System.out.println(x[i]);
            i++;
        }
        System.out.println("\nforeach");
        //printing with foreach
        for (int num : x) {
            System.out.println(num);
        }
        System.out.println("\ndo while");
        //printing with do while
//        int i = 0;
//        do {
//            System.out.println(x[i]);
//            i++;
//        } while (i < x.length);


    }
}
