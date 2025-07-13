class XplatformRunner {

    public static void main(String[] XPlatformRunner) {
        System.out.println("main started");

        boolean registered = Xplatform.registerUser("juve", "jashX", 8088403505L, "jash@xplatform.io", "Xpass001");

        if (registered) {
            System.out.println("User registered successfully.");
            Xplatform.getUserInfo();
        } else {
            System.out.println("User registration failed.");
        }

        System.out.println("main ended");
    }
}