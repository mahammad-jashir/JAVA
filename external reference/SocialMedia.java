class SocialMedia {

    // static String facebook = "FACEBOOK";
    // static String instagram = "INSTAGRAM";
    // static String twitter = "TWITTER";
    // static String snapchat = "SNAPCHAT";
    // static String linkedin = "LINKEDIN";
    // static String whatsapp = "WHATSAPP";
    // static String telegram = "TELEGRAM";
    // static String reddit = "REDDIT";
    // static String discord = "DISCORD";
    // static String tiktok = "TIKTOK";

    //static String mediaNames[] = {
      //  facebook, instagram, twitter, snapchat, linkedin,
      //  whatsapp, telegram, reddit, discord, tiktok
   // };

    public static void main(String args[]) {

        String facebook = "FACEBOOK";
        String instagram = "INSTAGRAM";
        String twitter = "TWITTER";
        String snapchat = "SNAPCHAT";
        String linkedin = "LINKEDIN";
        String whatsapp = "WHATSAPP";
        String telegram = "TELEGRAM";
        String reddit = "REDDIT";
        String discord = "DISCORD";
        String tiktok = "TIKTOK";

        String platforms[] = {
            facebook, instagram, twitter, snapchat, linkedin,
            whatsapp, telegram, reddit, discord, tiktok
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Social Media Platforms ===");

        for (String platform : platforms) {
            System.out.println(platform);
        }

        System.out.println("--------------main ended--------------");
    }
}
