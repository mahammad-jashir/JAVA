class AmazonRunner{

public static void main(String[] amazon){

String email="juvejash@gmail.com";
String password="Juve@123";
long phoneNumber=8088403508L;

String msg=Amazon.login(email,password);
System.out.println(msg);

 msg=Amazon.login(phoneNumber,password);
System.out.println(msg);
}
}