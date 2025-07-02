class Calculator{

public static void main(String[]calculate){

add(123,32);
sub(123,32);
mult(123,32);
div(30,3);
mod(100,10);

}

public static void add(int num1,int num2){
int total = num1+num2;
System.out.println(total);
}

public static void sub(int sub1,int sub2){
int total = sub1-sub2;
System.out.println(total);
}

public static void mult(int mult1,int mult2){
int total= mult1*mult2;
System.out.println(total);
}

public static void div(int div1,int div2){
int total= div1/div2;
System.out.println(total);
}

public static void mod(int mod1, int mod2){
int total= mod1%mod2;
System.out.println(total);
}
}