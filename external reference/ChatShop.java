class ChatShop {

    // static String paniPuri = "PANI PURI";
    // static String bhelPuri = "BHEL PURI";
    // static String masalaPuri = "MASALA PURI";
    // static String sevPuri = "SEV PURI";
    // static String samosaChat = "SAMOSA CHAT";
    // static String dahiPuri = "DAHI PURI";
    // static String bonda = "BONDA";
    // static String alooTikki = "ALOO TIKKI";
    // static String mirchiBajji = "MIRCHI BAJJI";
    // static String cornChat = "CORN CHAT";

    //static String chats[] = {
       // paniPuri, bhelPuri, masalaPuri, sevPuri, samosaChat,
       // dahiPuri, bonda, alooTikki, mirchiBajji, cornChat
   // };

    public static void main(String args[]) {

        String paniPuri = "PANI PURI";
        String bhelPuri = "BHEL PURI";
        String masalaPuri = "MASALA PURI";
        String sevPuri = "SEV PURI";
        String samosaChat = "SAMOSA CHAT";
        String dahiPuri = "DAHI PURI";
        String bonda = "BONDA";
        String alooTikki = "ALOO TIKKI";
        String mirchiBajji = "MIRCHI BAJJI";
        String cornChat = "CORN CHAT";

        String availableChats[] = {
            paniPuri, bhelPuri, masalaPuri, sevPuri, samosaChat,
            dahiPuri, bonda, alooTikki, mirchiBajji, cornChat
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Chats ===");

        for (String chat : availableChats) {
            System.out.println(chat);
        }

        System.out.println("--------------main ended--------------");
    }
}
