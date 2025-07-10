class BankAccountRunner{
public static void main(String []Bank){
System.out.println("MAIN STARTED");
BankAccount.credit(900);
boolean amountCredited=BankAccount.credit(900);
System.out.println(amountCredited);
BankAccount.credit(0.0);
System.out.println("THE TOTAL AMOUNT IS:"+BankAccount.balance);

BankAccount.debit(600);
boolean amountDebited=BankAccount.debit(2000);
System.out.println(amountDebited);
System.out.println("THE TOTAL AMOUNT IS:"+BankAccount.balance);

System.out.println("MAIN ENDED");
}}
