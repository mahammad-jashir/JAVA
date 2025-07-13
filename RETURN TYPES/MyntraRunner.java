class MyntraRunner {

    public static void main(String[] FacebookRunner) {
        System.out.println("main started");

        boolean userIsRegistered = Myntra.registerUser("Juve ", "jash", 8088403508L, "juvejash@gmail.com","M");

        if (userIsRegistered) {
            System.out.println("User registered successfully.");
            Myntra.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}