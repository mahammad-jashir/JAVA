class Hospital{
 
 public static void checkUp(String patientName,int age,long phoneNumber,String email,String disease){
System.out.println("Checkup started");
Doctor.treatment(patientName,age,disease);
System.out.println("Checkup ended");
}
}