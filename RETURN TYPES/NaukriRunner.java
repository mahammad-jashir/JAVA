class NaukriRunner {

    public static void main(String[] InstagramRunner) {
        System.out.println("main started");

        boolean userIsRegistered = Naukri.registerUser(
            "juve",
            "jash",
            8088403508L,
            "juvejash@gmail.com4@gmail.com",
            "JuveJash@123"
        );

        if (userIsRegistered) {
            System.out.println("User registered successfully.");
            Naukri.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}