package bw.ub.motshelo.main;
import bw.ub.motshelo.model.Contribution;
import bw.ub.motshelo.model.Withdrawal;
import bw.ub.motshelo.model.Transaction;
import bw.ub.motshelo.model.Members;
import bw.ub.motshelo.model.MotsheloManager;

public class MainApp{

    public static void main(String[] args) {
        MotsheloManager manager = new MotsheloManager();
        seedData(manager);

        manager.printAllMembers();
        manager.printMemberHistory("123456789");
    }

    private static void seedData(MotsheloManager manager) {
        // Seed data
        Members m1 = new Members("Thapelo Kennedy", "123456789");
        Members m2 = new Members("Thuto Dikampa", "987654321");

        manager.addMembers(m1);
        manager.addMembers(m2);

        // Demonstrate a starting contribution and add money to motshelo
        m1.addTransaction(new Contribution(500.00));
    }
}