public class Account
{
    private String accNumber;
    private double balance;
    
    public Account(){
        accNumber = "";
        balance = 0.0;
    }
    
    public Account(String aNo, double bal) {
        setAccNumber(aNo);
        setBalance(bal);
    }
    
    public void setAccNumber(String aNo){
        accNumber = aNo;
    }
    
    public void setBalance(double bal){
        balance = bal;
    }
    
    public String getAccNumber() {
        return accNumber;
    }
    
    public double getbalance(){
        return balance;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    public boolean withdraw(double amount){
        if (hasSufficientFunds(amount)){
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public boolean hasSufficientFunds(double amount){
        return balance >= amount;
        }
    
    public boolean isValidAccountNumber(){
        if (accNumber == null || accNumber.length() != 10){
            return false;
        }
        
        // First 3 must be uppercase;
        for (int i = 0; i < 3; i++){
            char ch = accNumber.charAt(i);
            if (ch < 'A' || ch > 'Z'){
                return false;
            }
        }
        // checks if 4th char is '-'
        if (accNumber.charAt(3) != '-'){
            return false;
        }
        // checks if last 6 chars are digits
        for (int i = 4; i < 10; i++){
            char ch = accNumber.charAt(i);
            if (ch <'0' || ch > '9'){
                return false;
            }
        }
        return true;
    }
    
    public String toString(){
        return "Account Number: " + accNumber + "\nBalance: R" + String.format("%.2f", balance);
    }
}
