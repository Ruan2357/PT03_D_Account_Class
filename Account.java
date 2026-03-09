public class Account
{
        // Instance variables
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

    }
    
    public boolean hasSufficientFunds(double amount){

        }
    
    public boolean isValidAccountNumber(){
        
    }
    
    public String toString(){
        
    }
}
