package trycatchBlock;

public class TryCatchBlock {

    public static void main(String[] args) {
        int a = 10, b = 0, c = 0;
        try {
        c = a / b;
        } catch (Exception e) {
            //throw new ArithmeticException(" b can't be zero");
            b=1;
            throw new ArithmeticException("b is changed to 1 ");
        }
        System.out.println(c);
    }
}
