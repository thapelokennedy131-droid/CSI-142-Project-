package bw.ub.motshelo.model;
import java.time.LocalDateTime;
public abstract class Transaction {    
private double amount;    
private LocalDateTime date;    
private String description;    
public Transaction(double amount, String description){        
this.amount = amount;        
this.description = description;        
this.date = LocalDateTime.now();    
}    
public double getAmount() { 
return amount; }   
public LocalDateTime getDate() 
{ return date; }    
public String getDescription() 
{ return description; }    
@Override    
public String toString() {        
return date + " | " + description + " | P" + String.format("%.2f", amount);    
}
}