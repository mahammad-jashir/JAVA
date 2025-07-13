
class PassportSeva {

      static String givenName ;
      static String surName ; 
      static String password;
      static String confirmPassword;
      static String regOffice;
      static String passportOffice;
      static String emailId;
      public static boolean  registerUser(String gName , String sName, String pwd,String cPwd,String office, String passOffice, String email){

                   boolean isUserRegistered = false;
                   boolean givenNameValid = false;
		   boolean surNameValid   = false;
                   boolean passwordValid  =false;
                   boolean confirmPasswordValid=false;
                   boolean regOfficeValid=false;
                   boolean passportOfficeValid=false;
                   boolean emailIdValid=false;
		  if( gName != null){
			  
			  givenName     =   gName  ; 
			   givenNameValid        = true ; 
			       
		  }else
                   System.out.println("Give valid Name");	   
				
			if(sName != null){
				surName       = sName;
				surNameValid = true ; 
			}
			else
                        System.out.println("Give valid sur Name");
 
                        if(pwd !=null){
                        password=pwd;
                        passwordValid=true;
                        }
                         else
                          System.out.println("Give Valid Password");
                         
                         if(cPwd !=null && cPwd == pwd){
                         confirmPassword=cPwd;
                          confirmPasswordValid=true;
                          }
                          else 
                           System.out.println("Give valid Confirm Password");
			
                        if(office!=null){
                        regOffice=office;
                        regOfficeValid=true;
                        }
                        else 
                        System.out.println("GIVE PROPER REGISTRATION OFFICE");
                       
                        if(passOffice!=null){
                        passportOffice=office;
                        passportOfficeValid=true;
                        }
                        else 
                        System.out.println("GIVE PROPER PASSPORT OFFICE");

                        if(email !=null){
                        emailId=email;
                        emailIdValid=true;
                        }
                         else
                        System.out.println("GIVE PROPER EMAIL ID");


                        if(	 givenNameValid && surNameValid && passwordValid && confirmPasswordValid && regOfficeValid && passportOfficeValid && emailIdValid){
				isUserRegistered  = true;
			}
                       

					
	    return  isUserRegistered; 
					
	  }
	  
	  
	  public static void getUserInfo(){
	   System.out.println("The given Name is "+ givenName);
	   System.out.println ("The Sur Name is "+ surName);
           System.out.println("The password is "+ password);
           System.out.println("The confirm password is "+confirmPassword);
           System.out.println("The Registration office is "+regOffice);
           System.out.println("The Passport office is "+passportOffice);
           System.out.println("The Email id is "+emailId);
	   }




}
