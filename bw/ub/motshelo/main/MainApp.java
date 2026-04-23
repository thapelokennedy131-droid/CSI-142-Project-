package bw.ub.motshelo.model;

public class Main {

    public static void main(String[] args) {
        MotsheloManager manager = new MotsheloManager();
        seedData(manager);

        manager.printAllMembers();
        manager.printMemberHistory("123456789");
    }

    private static void seedData(MotsheloManager manager) {
        // Seed data
        Member m1 = new Member("Thapelo Kennedy", "123456789");
        Member m2 = new Member("Thuto Dikampa", "987654321");

        manager.addMember(m1);
        manager.addMember(m2);

        // Demonstrate a starting contribution and add money to motshelo
        m1.addTransaction(new Contribution(500.00));
    }
}