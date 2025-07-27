class WeaponRunner {
    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

       Weapon w1 = new Weapon(1, "AK-47", "Rifle", 3.47, 75, true, "Kalashnikov Concern");
        w1.GetInfo();

        Weapon w2 = new Weapon(2, "Desert Eagle", "Pistol", 2.0, 60, false, "Magnum Research");
        w2.GetInfo();

        Weapon w3 = new Weapon(3, "M16", "Assault Rifle", 3.9, 70, true, "Colt's Manufacturing");
        w3.GetInfo();

        Weapon w4 = new Weapon(4, "Glock 17", "Pistol", 0.9, 45, true, "Glock GmbH");
        w4.GetInfo();

        Weapon w5 = new Weapon(5, "MP5", "Submachine Gun", 2.5, 55, true, "Heckler & Koch");
        w5.GetInfo();

        Weapon w6 = new Weapon(6, "Barrett M82", "Sniper Rifle", 14.0, 100, false, "Barrett Firearms");
        w6.GetInfo();

        Weapon w7 = new Weapon(7, "Uzi", "Submachine Gun", 3.5, 50, true, "Israel Military Industries");
        w7.GetInfo();

        Weapon w8 = new Weapon(8, "M1911", "Handgun", 1.1, 40, false, "Colt");
        w8.GetInfo();

        Weapon w9 = new Weapon(9, "FAMAS", "Assault Rifle", 3.6, 65, true, "Nexter Systems");
        w9.GetInfo();

        Weapon w10 = new Weapon(10, "Remington 870", "Shotgun", 3.2, 80, false, "Remington Arms");
        w10.GetInfo();

        Weapon w11 = new Weapon(11, "FN SCAR", "Assault Rifle", 3.5, 68, true, "FN Herstal");
        w11.GetInfo();

        Weapon w12 = new Weapon(12, "M4A1", "Carbine", 3.1, 65, true, "Colt Defense");
        w12.GetInfo();

        Weapon w13 = new Weapon(13, "SPAS-12", "Shotgun", 4.4, 85, false, "Franchi");
        w13.GetInfo();

        Weapon w14 = new Weapon(14, "Beretta 92FS", "Pistol", 0.95, 42, false, "Beretta");
        w14.GetInfo();

        Weapon w15 = new Weapon(15, "MG42", "Machine Gun", 11.5, 90, true, "Mauser");
        w15.GetInfo();

        Weapon w16 = new Weapon(16, "Dragunov", "Sniper Rifle", 4.3, 95, false, "Kalashnikov Concern");
        w16.GetInfo();

        Weapon w17 = new Weapon(17, "Thompson", "Submachine Gun", 4.9, 55, true, "Auto-Ordnance");
        w17.GetInfo();

        Weapon w18 = new Weapon(18, "Winchester 1894", "Rifle", 3.2, 58, false, "Winchester Repeating Arms");
        w18.GetInfo();

        Weapon w19 = new Weapon(19, "MAC-10", "Submachine Gun", 2.8, 53, true, "Military Armament Corp");
        w19.GetInfo();

        Weapon w20 = new Weapon(20, "FN Five-seveN", "Pistol", 0.7, 46, true, "FN Herstal");
        w20.GetInfo();

        System.out.println("THE MAIN ENDED");
    }
}