abstract class PaymentAbstraction {
    double amount;
    PaymentAbstraction(double amount) {
        this.amount = amount;
    }
    abstract void pay(double amount);
}
class CreditCardPayment extends PaymentAbstraction { 
    CreditCardPayment(double amount) {
        super(amount);
    }
    void pay(double amount) {
        System.out.println("Credit Card: " + amount);
    }
}
class DebitCardPayment extends PaymentAbstraction {
    DebitCardPayment(double amount) {
        super(amount);
    }
    void pay(double amount) {
        System.out.println("Debit Card: " + amount);
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentAbstraction p1 = new CreditCardPayment(100);
        PaymentAbstraction p2 = new DebitCardPayment(200);
        p1.pay(100);
        p2.pay(200);
    }
}