package demoInterface;

import demoInterface.DemoInterface;

public class ImplementationOfInterface implements DemoInterface {
    @Override
    public void m1(int i) {
    }

    @Override
    public void m2(double d) {
    }

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(d);
        float p;
        p = (float) (i+d);
        System.out.println(p);

    }
}
