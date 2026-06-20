// OCP MEANS OPEN CLOSED PRINCIPLE
// OCP humein yeh batata hai ki agr humney koi class banai hai aur hum koi naya features add krna chahtey hai toh hum apney working code ko na ched kar ek nayi class bna kar usmey code likhtey haii.. 
// class extension ke liye open aur class modification ke liye closed hai...


public interface PaymentMethod {
    void pay(double amount);
}

// Cash payment - apna alag class
public class CashPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

// Card payment - apna alag class
public class CardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

// Kal agar UPI add karna ho - sirf nayi class banao
// CashPayment aur CardPayment ko touch nahi karna padega
public class UPIPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}