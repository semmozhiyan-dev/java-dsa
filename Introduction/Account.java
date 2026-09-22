public class Account {
    String Account_user;
    long Account_Number;
    double Balance;
    
    Account(String Account_user,long Account_Number,double Balance){
        this.Account_user=Account_user;
        this.Account_Number=Account_Number;
        this.Balance=Balance;
            System.out.println("account holder name is:"+Account_user);
            System.out.println("account number is:"+Account_Number);
            System.out.println("account balance is:"+Balance);  
        }

    
    public static void main(String[] args){
        Account newAccount=new Account("sem",12345678,10000.00);


    }    
}
