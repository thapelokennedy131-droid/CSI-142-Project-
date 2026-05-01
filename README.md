💰 Motshelo – Finance & Savings Management System
> CSI142 Group Project | University of Botswana

---

## 👥 Group Members

| Name | Student ID |
|------|------------|
| Kennedy Thapelo | 202501315 |
| Thuto Dikampa | 202504450 |
| Boemo Olopeng | 202404392 |
| Junior Moediemang | 202501419 |
| Osiame Robert | 202502301 |

---

## 📌 Domain
**Finance and Savings System**

---

## 📖 Concept Note

**Motshelo** is a traditional Botswana community savings system where a group of people pool money together on a regular basis. Each member contributes a fixed or agreed amount periodically, and the accumulated funds are distributed to members in rotation or used for group needs.

Our system digitalises this concept by providing a Java-based application that:

- **Manages member accounts** — each member is registered with their name and Omang (national ID), and maintains their own financial profile within the system.
- **Records contributions** — when a member deposits money into the Motshelo pool, a `Contribution` transaction is created and linked to their account, automatically updating their balance.
- **Processes withdrawals** — when a member withdraws from the pool, a `Withdrawal` transaction is recorded with a negative amount, reducing their balance accordingly.
- **Tracks financial history** — every transaction (contribution or withdrawal) is stored in the member's personal transaction history, allowing a full audit trail to be printed at any time.
- **Calculates balances** — the system automatically computes each member's current balance by accumulating all transaction amounts, giving an accurate picture of their standing in the group.

The system is designed around real-world financial accuracy and transparency — core values of a trustworthy Motshelo group.

---

## 🗂️ Package Structure

```
src/
└── bw/
    └── ub/
        └── csi142/
            └── motshelo/
                ├── main/
                │       MainApp.java
                └── model/
                        Transaction.java
                        Contribution.java
                        Withdrawal.java
                        Members.java
                        MotsheloManager.java
```

---

## 🧱 OOP Principles Applied

| Principle | Where Applied |
|-----------|--------------|
| **Abstraction** | `Transaction.java` is an abstract class — it defines the blueprint for all transactions without being instantiated directly |
| **Inheritance** | `Contribution` and `Withdrawal` both extend `Transaction`, reusing its fields and constructor via `super()` |
| **Encapsulation** | All fields in `Member` and `Transaction` are `private`, accessed only through public getters |
| **Composition** | `Member` owns an `ArrayList<Transaction>` — the history list lives and dies with the member object |
| **Polymorphism** | `Contribution` and `Withdrawal` objects are stored as `Transaction` references; `toString()` is overridden |
| **Collections** | `ArrayList<Transaction>` in `Member`; `List<Members>` in `MotsheloManager` |
| **Packages** | Code is organised under `bw.ub.csi142.motshelo.model` and `bw.ub.csi142.motshelo.main` |
| **Robustness** | Negative amounts handled automatically in `Withdrawal` via `super(-amount, ...)` |

---

## ⚙️ How to Run

**Requirements:** Java 11 or higher

```bash
# Clone the repository
git clone https://github.com/thapelokennedy131-droid/CSI-142-Project-.git

# Navigate into the project
cd CSI-142-Project-

# Compile
javac -d out src/bw/ub/csi142/motshelo/model/*.java src/bw/ub/csi142/motshelo/main/MainApp.java

# Run
java -cp out bw.ub.csi142.motshelo.main.MainApp
```

---

## 🖥️ Sample Output

```
=== All Members ===
Name: Thapelo Kennedy | ID: 123456789
Name: Thuto Dikampa   | ID: 987654321

=== History for 123456789 ===
2025-04-30T10:15:42 | Contribution | P500.00
```

---

## 🔗 Repository

[https://github.com/thapelokennedy131-droid/CSI-142-Project-.git](https://github.com/thapelokennedy131-droid/CSI-142-Project-.git)

---
