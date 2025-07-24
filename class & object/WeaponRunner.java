class WeaponRunner {
    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

        Weapon w1 = new Weapon();
        w1.weaponId = 1;
        w1.name = "AK-47";
        w1.type = "Ranged";
        w1.weight = 4.3;
        w1.damage = 90;
        w1.isAutomatic = true;
        w1.manufacturer = "Kalashnikov Concern";
        w1.GetInfo();

        Weapon w2 = new Weapon();
        w2.weaponId = 2;
        w2.name = "Katana";
        w2.type = "Melee";
        w2.weight = 1.2;
        w2.damage = 75;
        w2.isAutomatic = false;
        w2.manufacturer = "Japanese Smiths";
        w2.GetInfo();


        Weapon w3 = new Weapon();
        w3.weaponId = 3;
        w3.name = "Desert Eagle";
        w3.type = "Ranged";
        w3.weight = 2.0;
        w3.damage = 85;
        w3.isAutomatic = false;
        w3.manufacturer = "Magnum Research";
        w3.GetInfo();


        Weapon w4 = new Weapon();
        w4.weaponId = 4;
        w4.name = "Machete";
        w4.type = "Melee";
        w4.weight = 1.5;
        w4.damage = 65;
        w4.isAutomatic = false;
        w4.manufacturer = "Cold Steel";
        w4.GetInfo();


        Weapon w5 = new Weapon();
        w5.weaponId = 5;
        w5.name = "MP5";
        w5.type = "Ranged";
        w5.weight = 2.5;
        w5.damage = 80;
        w5.isAutomatic = true;
        w5.manufacturer = "Heckler & Koch";
        w5.GetInfo();


        Weapon w6 = new Weapon();
        w6.weaponId = 6;
        w6.name = "Crossbow";
        w6.type = "Ranged";
        w6.weight = 3.0;
        w6.damage = 70;
        w6.isAutomatic = false;
        w6.manufacturer = "TenPoint";
        w6.GetInfo();


        Weapon w7 = new Weapon();
        w7.weaponId = 7;
        w7.name = "Rapier";
        w7.type = "Melee";
        w7.weight = 1.0;
        w7.damage = 60;
        w7.isAutomatic = false;
        w7.manufacturer = "Spanish Blades";
        w7.GetInfo();


        Weapon w8 = new Weapon();
        w8.weaponId = 8;
        w8.name = "Glock 17";
        w8.type = "Ranged";
        w8.weight = 0.9;
        w8.damage = 75;
        w8.isAutomatic = false;
        w8.manufacturer = "Glock GmbH";
        w8.GetInfo();


        Weapon w9 = new Weapon();
        w9.weaponId = 9;
        w9.name = "Tomahawk";
        w9.type = "Melee";
        w9.weight = 1.3;
        w9.damage = 70;
        w9.isAutomatic = false;
        w9.manufacturer = "Custom Blades";
        w9.GetInfo();


        Weapon w10 = new Weapon();
        w10.weaponId = 10;
        w10.name = "Uzi";
        w10.type = "Ranged";
        w10.weight = 3.5;
        w10.damage = 85;
        w10.isAutomatic = true;
        w10.manufacturer = "Israel Military Industries";
        w10.GetInfo();


        Weapon w11 = new Weapon();
        w11.weaponId = 11;
        w11.name = "Spear";
        w11.type = "Melee";
        w11.weight = 2.5;
        w11.damage = 65;
        w11.isAutomatic = false;
        w11.manufacturer = "Ancient Weapons Co.";
        w11.GetInfo();


        Weapon w12 = new Weapon();
        w12.weaponId = 12;
        w12.name = "Revolver";
        w12.type = "Ranged";
        w12.weight = 1.1;
        w12.damage = 80;
        w12.isAutomatic = false;
        w12.manufacturer = "Smith & Wesson";
        w12.GetInfo();


        Weapon w13 = new Weapon();
        w13.weaponId = 13;
        w13.name = "Battle Axe";
        w13.type = "Melee";
        w13.weight = 3.2;
        w13.damage = 90;
        w13.isAutomatic = false;
        w13.manufacturer = "Viking Arms";
        w13.GetInfo();


        Weapon w14 = new Weapon();
        w14.weaponId = 14;
        w14.name = "Sniper Rifle";
        w14.type = "Ranged";
        w14.weight = 6.5;
        w14.damage = 95;
        w14.isAutomatic = false;
        w14.manufacturer = "Remington";
        w14.GetInfo();


        Weapon w15 = new Weapon();
        w15.weaponId = 15;
        w15.name = "Flamethrower";
        w15.type = "Ranged";
        w15.weight = 8.0;
        w15.damage = 100;
        w15.isAutomatic = true;
        w15.manufacturer = "Military Tech";
        w15.GetInfo();


        Weapon w16 = new Weapon();
        w16.weaponId = 16;
        w16.name = "Halberd";
        w16.type = "Melee";
        w16.weight = 4.0;
        w16.damage = 85;
        w16.isAutomatic = false;
        w16.manufacturer = "Medieval Weapons Ltd";
       w16.GetInfo();


        Weapon w17 = new Weapon();
        w17.weaponId = 17;
        w17.name = "Crossbow Pistol";
        w17.type = "Ranged";
        w17.weight = 2.2;
        w17.damage = 70;
        w17.isAutomatic = false;
        w17.manufacturer = "PistolTech";
       w17.GetInfo();


        Weapon w18 = new Weapon();
        w18.weaponId = 18;
        w18.name = "Claymore";
        w18.type = "Melee";
        w18.weight = 3.7;
        w18.damage = 90;
        w18.isAutomatic = false;
        w18.manufacturer = "Scottish Arms";
        w18.GetInfo();


        Weapon w19 = new Weapon();
        w19.weaponId = 19;
        w19.name = "Taser";
        w19.type = "Ranged";
        w19.weight = 0.5;
        w19.damage = 40;
        w19.isAutomatic = false;
        w19.manufacturer = "StunTech";
        w19.GetInfo();


        Weapon w20 = new Weapon();
        w20.weaponId = 20;
        w20.name = "Grenade";
        w20.type = "Explosive";
        w20.weight = 0.4;
        w20.damage = 100;
        w20.isAutomatic = false;
        w20.manufacturer = "Ordnance Corp";
        w20.GetInfo();


        System.out.println("THE MAIN ENDED");
    }
}