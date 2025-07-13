class SnapchatRunner {

    public static void main(String[] SnapchatRunner) {
        System.out.println("main started");

        boolean isRegistered = Snapchat.registerUser("juvejash7", "jashir", 8088403508L, "juvejash@gmiail.com", "Snapjuvjash");

        if (isRegistered) {
            System.out.println("User registered successfully.");
            Snapchat.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}