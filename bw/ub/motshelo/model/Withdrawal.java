package bw.ub.motshelo.model;

public class Withdrawal extends Transaction {

    public Withdrawal(double amount) {
        super(-amount, "Withdrawal"); // Negative to reduce balance
    }
}