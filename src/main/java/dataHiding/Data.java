package dataHiding;

public class Data {
    public static void main(String[] args) {
        System.out.println(balance);
    }
    private static double balance = 2000;
    public void setBalance(double bal) {
        balance = bal;
    }
    public double getBalance(){
        return balance;
    }
}


