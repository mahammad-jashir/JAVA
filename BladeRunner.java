class BladeRunner {

    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

        Blade blade1 = new Blade(1, "Gillette", "Stainless Steel", 9, 4.5, false, "Safety Razor");
        blade1.GetInfo();

        Blade blade2 = new Blade(2, "SuperMax", "Carbon Steel", 8, 4.2, false, "Disposable");
        blade2.GetInfo();

        Blade blade3 = new Blade(3, "Wilkinson", "Titanium", 9, 4.8, true, "Cartridge");
        blade3.GetInfo();

        Blade blade4 = new Blade(4, "Dorco", "Platinum", 7, 4.1, false, "Straight Razor");
        blade4.GetInfo();

        Blade blade5 = new Blade(5, "Feather", "Stainless Steel", 10, 4.3, true, "Straight Razor");
        blade5.GetInfo();

        Blade blade6 = new Blade(6, "Astra", "Carbon Steel", 8, 4.0, false, "Safety Razor");
        blade6.GetInfo();

        Blade blade7 = new Blade(7, "KAI", "Titanium", 9, 4.6, true, "Cartridge");
        blade7.GetInfo();

        Blade blade8 = new Blade(8, "Bic", "Stainless Steel", 7, 4.2, false, "Disposable");
        blade8.GetInfo();

        Blade blade9 = new Blade(9, "Shick", "Platinum Coated", 8, 4.4, true, "Cartridge");
        blade9.GetInfo();

        Blade blade10 = new Blade(10, "Merkur", "Stainless Steel", 9, 4.6, false, "Safety Razor");
        blade10.GetInfo();

        Blade blade11 = new Blade(11, "Persona", "Carbon Steel", 7, 4.1, false, "Disposable");
        blade11.GetInfo();

        Blade blade12 = new Blade(12, "Cloud", "Stainless Steel", 8, 4.0, false, "Safety Razor");
        blade12.GetInfo();

        Blade blade13 = new Blade(13, "Kai Pro", "Titanium", 9, 4.7, true, "Cartridge");
        blade13.GetInfo();

        Blade blade14 = new Blade(14, "Laser Ultra", "Platinum", 7, 4.3, false, "Straight Razor");
        blade14.GetInfo();

        Blade blade15 = new Blade(15, "Gillette Guard", "Carbon Steel", 6, 4.1, true, "Single Blade");
        blade15.GetInfo();

        Blade blade16 = new Blade(16, "Parker", "Stainless Steel", 8, 4.4, false, "Safety Razor");
        blade16.GetInfo();

        Blade blade17 = new Blade(17, "Lord", "Chrome Steel", 6, 4.3, false, "Disposable");
        blade17.GetInfo();

        Blade blade18 = new Blade(18, "Rapira", "Stainless Steel", 7, 4.2, false, "Straight Razor");
        blade18.GetInfo();

        Blade blade19 = new Blade(19, "BigBen", "Carbon Steel", 6, 4.0, false, "Single Edge");
        blade19.GetInfo();

        Blade blade20 = new Blade(20, "Shaving Factory", "Titanium", 9, 4.5, true, "Cartridge");
        blade20.GetInfo();

        System.out.println("THE MAIN ENDED");
    }
}
