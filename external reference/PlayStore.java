class PlayStore {

    // static String whatsapp = "WHATSAPP";
    // static String instagram = "INSTAGRAM";
    // static String facebook = "FACEBOOK";
    // static String snapchat = "SNAPCHAT";
    // static String spotify = "SPOTIFY";
    // static String telegram = "TELEGRAM";
    // static String googleMaps = "GOOGLE MAPS";
    // static String youtube = "YOUTUBE";
    // static String twitter = "TWITTER";
    // static String amazon = "AMAZON";

    //static String appNames[] = {
        //whatsapp, instagram, facebook, snapchat, spotify,
       // telegram, googleMaps, youtube, twitter, amazon
    //};

    public static void main(String args[]) {

        String whatsapp = "WHATSAPP";
        String instagram = "INSTAGRAM";
        String facebook = "FACEBOOK";
        String snapchat = "SNAPCHAT";
        String spotify = "SPOTIFY";
        String telegram = "TELEGRAM";
        String googleMaps = "GOOGLE MAPS";
        String youtube = "YOUTUBE";
        String twitter = "TWITTER";
        String amazon = "AMAZON";

        String topApps[] = {
            whatsapp, instagram, facebook, snapchat, spotify,
            telegram, googleMaps, youtube, twitter, amazon
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Play Store Apps ===");

        for (String app : topApps) {
            System.out.println(app);
        }

        System.out.println("--------------main ended--------------");
    }
}
