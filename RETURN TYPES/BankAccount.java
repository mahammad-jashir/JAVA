class BankAccount{

static double balance=100.00;

public static double  getBalance(){
return balance;
}

public static boolean credit(double amount){
boolean isCredited=false;
boolean check=amount>0.0;

if(check){
balance=amount+balance;
isCredited=true;
System.out.println("THE AMOUNT CREDITED IS:"+amount);
}else{
System.out.println("THE AMOUNT CANNOT BE CREDITED\n ");

}
return isCredited;
}

public static boolean debit(double amount){
boolean isDebited=false;
boolean check=balance>amount;
if(check){
balance=balance-amount;
isDebited=true;
System.out.println("THE AMOUNT DEBITED IS: "+amount);
}else{
System.out.println("INSUFFICIENT FUND");
}
return isDebited;
}

}

