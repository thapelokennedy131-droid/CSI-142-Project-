package bw.ub.motshelo.model;
import java.util.ArrayList;

public class Member {
    private String name;
    private String omang;
    private double balance;
    private ArrayList<Transaction> history; // Composition

    public Member(String name, String omang) {
        this.name = name;
        this.omang = omang;
        this.balance = 0.0;
        this.history = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        history.add(t);
        this.balance += t.getAmount();
    }

    //Encapsulation
    public String getName() { return name; }
    public String getOmang() { return omang; }
    public double getBalance() { return balance; }
    public ArrayList<Transaction> getHistory() { return history; }
}




