class BankAccountRunner{
public static void main(String []Bank){
System.out.println("MAIN STARTED");
BankAccount.credit(900);
BankAccount.credit(0.0);
System.out.println("THE TOTAL AMOUNT IS:"+BankAccount.balance);

BankAccount.debit(600);
System.out.println("THE TOTAL AMOUNT IS:"+BankAccount.balance);

BankAccount.transfer(400);
System.out.println("THE TOTAL AMOUNT IS:"+BankAccount.balance);

System.out.println("MAIN ENDED");
}}
