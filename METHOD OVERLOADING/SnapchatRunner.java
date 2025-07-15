class SnapchatRunner{
public static void main(String[] snap){

String email="juvejash@gmail.com";
String password="Juve@000";
long phoneNumber=8088403508L;

String msg=Snapchat.login(email,password);
System.out.println(msg);

 msg=Snapchat.login(phoneNumber,password);
System.out.println(msg);
}
}