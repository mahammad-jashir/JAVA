class BankAccount{

static double balance;

public static void credit(double amount){
boolean check=amount>0.0;
if(check){
balance=amount+balance;
System.out.println("THE AMOUNT CREDITED IS:"+amount);
}else{
System.out.println("THE AMOUNT CANNOT BE CREDITED\n ");
}
}
public static void debit(double amount){

boolean check=balance>amount;
if(check){
balance=balance-amount;
System.out.println("THE AMOUNT DEBITED IS: "+amount);
}else{
System.out.println("INSUFFICIENT FUND");
}
}
public static void transfer(double amount){
boolean check=balance>=amount;
if(check){
balance=balance-amount;
System.out.println("THE AMOUNT TRANSFER IS"+amount);

}else{
System.out.println("insufficient balance");
 }
}
}
