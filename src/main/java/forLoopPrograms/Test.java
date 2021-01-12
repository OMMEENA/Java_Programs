package forLoopPrograms;

public class Test {
    ////    public static void main(String[] args) {
////        float arr[][]={new float[]{80, 90, 40, 60}new float[]{30}};
////        System.out.println(arr.length);
////        System.out.println(arr[3]);
//
////    }
//public static void main(String[] args) {
//    int[] a={83,45,45,45,45};
//    int[] b={1,2,3};
//    a=b;
//    b=a;
//
//    for (int i = 0; i < a.length; i++) {
//
//        System.out.print(a[i] + " ");
//
//    }
////    for (int i = 0; i < b.length; i++) {
////
////        System.out.print(b[i] + " ");
////
////    }
//
//}
//}


    // var - arg method
    public static void m1(int... x)
    {
        System.out.println("number of aguments: "+ x.length);
    }
    public static void main(String[] args) {
        sum();
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);

        m1();
        m1(10);
        m1(10,20);
        m1(10,20,30,40);
    }
    public static void sum(int... x) {
        int total = 0;
        for (int y : x) {
            total = total + y;
        }
        System.out.println("the sum :" + total + "\n");
    }
    //    public static void main(String[] args) {
//        System.out.println(m1(1)+m1(2)*m1(3)+m1(4)*m1(5)/m1(6) );
//
//    }
//    public static int m1(int i){
//
//        return i;
//    }


//    public static void main(String[] args) {


//        int x = 0;
//        x += ++x + x++;
//        System.out.println(x);
//    }
}

