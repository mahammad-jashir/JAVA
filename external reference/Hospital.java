class Hospital {

    // static String drHafeez = "DR. HAFEEZ";
    // static String drJvejash = "DR. JVEJASH";
    // static String drSujay = "DR. SUJAY";
    // static String drPrajwal = "DR. PRAJWAL";
    // static String drReddy = "DR. REDDY";
    // static String drMehta = "DR. MEHTA";
    // static String drSingh = "DR. SINGH";
    // static String drGupta = "DR. GUPTA";
    // static String drAgarwal = "DR. AGARWAL";
    // static String drNair = "DR. NAIR";

    //static String doctorNames[] = {
       // drHafeez, drJvejash, drSujay, drPrajwal, drReddy,
       // drMehta, drSingh, drGupta, drAgarwal, drNair
    //};

    public static void main(String args[]) {

        String drHafeez = "DR. HAFEEZ";
        String drJvejash = "DR. JVEJASH";
        String drSujay = "DR. SUJAY";
        String drPrajwal = "DR. PRAJWAL";
        String drReddy = "DR. REDDY";
        String drMehta = "DR. MEHTA";
        String drSingh = "DR. SINGH";
        String drGupta = "DR. GUPTA";
        String drAgarwal = "DR. AGARWAL";
        String drNair = "DR. NAIR";

        String hospitalDoctors[] = {
            drHafeez, drJvejash, drSujay, drPrajwal, drReddy,
            drMehta, drSingh, drGupta, drAgarwal, drNair
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Hospital Doctors ===");

        for (String doctor : hospitalDoctors) {
            System.out.println(doctor);
        }

        System.out.println("--------------main ended--------------");
    }
}
