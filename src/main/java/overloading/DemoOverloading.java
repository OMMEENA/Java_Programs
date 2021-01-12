package overloading;

public class DemoOverloading {
    public void m1(int i) {
        System.out.println("its integer"+i);
    }

    public void m1(float f) {
        System.out.println("its float"+f);
    }
    static class Test {
        public static void main(String[] args) {
            DemoOverloading t = new DemoOverloading();
            t.m1(20.00f);
            t.m1(34);
            t.m1(10.00f);
            t.m1(12);


        }
    }
}
