
class Myntra {

    static String firstName;
    static String lastName;
    static long phnNumber;
    static String emailId;
    static String gender;
    public static boolean registerUser(String fName, String lName, long pNumber, String eId, String gen) {
        boolean isUserRegistered = false;
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean phnNumberValid = false;
        boolean emailIdValid = false;
        boolean genderValid=false; 
        if (fName != null) {
            firstName = fName;
            firstNameValid = true;
        }
         else System.out.println("Give Valid data");



        if (lName != null) {
            lastName = lName;
            lastNameValid = true;
        }
         else System.out.println("Give Valid data");


        if (pNumber != 0 ) {
            phnNumber = pNumber;
            phnNumberValid = true;
            
        }
                 else System.out.println("Give Valid data");
         if(emailId !=null){
         emailId=eId;
         emailIdValid=true;
         }
         else System.out.println("Give Valid data");

        if( gen !=null) {
         gender=gen;
         genderValid=true;
         }
         else System.out.println("Give Valid data");

        if (firstNameValid && lastNameValid && phnNumberValid && emailIdValid && genderValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("The First Name of the Person Is: " + firstName);
        System.out.println("The Last Name of the Person Is: " + lastName);
        System.out.println("The PhoneNumber Is: " + phnNumber);
        System.out.println("The EmailId Is: " + emailId);
        System.out.println("The Gender is: " +gender);
    }
}
