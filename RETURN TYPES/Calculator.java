class Calculator{


public static int add(int num1,int num2){
int addition = num1+num2;
System.out.println(addition);
return addition;
}

public static int sub(int sub1,int sub2){
int substraction = sub1-sub2;
System.out.println(substraction);
return substraction;
}

public static int mult(int mult1,int mult2){
int multiplication= mult1*mult2;
System.out.println(multiplication);
return multiplication;
}

public static int div(int div1,int div2){
int division= div1/div2;
System.out.println(division);
return division;
}

public static int mod(int mod1, int mod2){
int modulus= mod1%mod2;
System.out.println(modulus);
return modulus;
}
}