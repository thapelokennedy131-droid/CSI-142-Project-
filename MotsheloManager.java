package bw.ub.motshelo.model;

import java.util.ArrayList;
import java.util.List;

public class MotsheloManager {

    private List<Members> members;

    // Constructor
    public MotsheloManager() {
        this.members = new ArrayList<>();
    }

    // Add a member to the list
    public void addMembers(Members member) {
        members.add(member);
    }

    // Print all members
    public void printAllMembers() {
        System.out.println("=== All Members ===");
        for (Members m : members) {
            System.out.println("Name: " + m.getName() + 
                               " | ID: " + m.getMemberId());
        }
    }

    // Print a specific member's transaction history
    public void printMemberHistory(String memberId) {
        System.out.println("=== History for " + memberId + " ===");
        for (Members m : members) {
            if (m.getMemberId().equals(memberId)) {
                m.printTransactions();
                return;
            }
        }
        System.out.println("Member not found.");
    }
}
