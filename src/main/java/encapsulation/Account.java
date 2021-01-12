package encapsulation;

//import scanner.Scanner;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    static class balance{
        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
            final int getbalance = 20000;
            System.out.println(getbalance);
        }
    }
}
