class FacebookRunner{
public static void main(String[] fb){

String email="juvejash@gmail.com";
String password="Juve@123";
long phoneNumber=8088403508L;

String msg=Facebook.login(email,password);
System.out.println(msg);

 msg=Facebook.login(phoneNumber,password);
System.out.println(msg);
}
}