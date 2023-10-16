import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        boolean b = true;
        while(b) {
            System.out.println("1.insert\n2.deposit\n3.withdraw\n4.display\n5.exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("enter account number:");
                    int num = sc.nextInt();
                    System.out.println("enter account holder name:");
                    String nam = sc.next();
                    System.out.println("enter the amount:");
                    float amt = sc.nextFloat();
                    a.insert(num, nam , amt);
                    break;
                case 2:
                    System.out.println("enter the amount:");
                    int am = sc.nextInt();
                    a.deposit(am);
                    break;
                case 3:
                    System.out.println("enter the amount:");
                    int amt1 = sc.nextInt();
                    a.withdraw(amt1);
                    break;
                case 4:
                    a.display();
                    break;
                case 5:
                    b = false;
            }
        }
        sc.close();
    }
}

class Account {
    int accno;
    String name;
    float amount;
    void insert(int a, String name, float amt) {
        accno = a;
        this.name = name;
        amount = amt;
    }
    void deposit(float amt) {
        amount = amount + amt;
        System.out.println("deposited");
    }
    void withdraw(float amt) {
        if(amount<amt) {
            System.out.println("Insufficient Balance");
        }
        else {
            amount = amount - amt;
            System.out.println("withdrawn");
        }
    }
    void checkBalance() {

        System.out.println("Balance is:" + amount);
    }
    void display() {
        System.out.println(accno + " " + name + " " + amount);
    }
}