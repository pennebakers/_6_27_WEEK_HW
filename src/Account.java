public class Account {

    private String id;
    private String name;
    private double balance;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void credit(double amount){
        this.balance += amount;
    }

    public boolean debit(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            return true;
        }
        else{
            System.out.println("Amount exceeded.");
            return false;
        }
    }

    public void transferTo(Account acc, double amount){
        if(debit(amount) == true){
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Transfer Completed");
        }
    }

    public String accountDetails(){
        return this.name + ", the current balance in your account " + this.id + " is " + this.balance;
    }
}
