
class LinkedInRunner {

    public static void main(String[] LinkedInRunner) {
        System.out.println("main started");

        boolean userRegistered = LinkedIn.registerUser("Mahammad", "jashir", 8088403508L, "m.jashir@linkedin.com", "juve123");

        if (userRegistered) {
            System.out.println("User registered successfully.");
            LinkedIn.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}
