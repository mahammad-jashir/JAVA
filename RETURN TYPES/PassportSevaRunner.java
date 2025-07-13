class PassportSevaRunner {

     public static void main(String seva[]){
	    
		boolean userIsRegistered =   PassportSeva.registerUser("Baba","Das","baba@123","baba@123","Passport office","MANGLORE","babadas123@gmail.com");
	     System.out.println("Is USer Registered "+ userIsRegistered);
		 
		 if(userIsRegistered)
		      PassportSeva.getUserInfo();
	}


}