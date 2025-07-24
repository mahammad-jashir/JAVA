class AmusementParkRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        AmusementPark p1 = new AmusementPark();
        p1.parkId = 101;
        p1.name = "WonderLand";
        p1.location = "Mumbai";
        p1.noOfRides = 25;
        p1.hasWaterPark = true;
        p1.entryFee = 799.0;
        p1.openSeason = "Summer";
        p1.getInfo();

        AmusementPark p2 = new AmusementPark();
        p2.parkId = 102;
        p2.name = "AdventureWorld";
        p2.location = "Delhi";
        p2.noOfRides = 30;
        p2.hasWaterPark = true;
        p2.entryFee = 899.0;
        p2.openSeason = "Winter";
        p2.getInfo();

        AmusementPark p3 = new AmusementPark();
        p3.parkId = 103;
        p3.name = "FantasyPark";
        p3.location = "Bangalore";
        p3.noOfRides = 20;
        p3.hasWaterPark = false;
        p3.entryFee = 650.0;
        p3.openSeason = "Spring";
        p3.getInfo();

        AmusementPark p4 = new AmusementPark();
        p4.parkId = 104;
        p4.name = "ThrillZone";
        p4.location = "Pune";
        p4.noOfRides = 35;
        p4.hasWaterPark = true;
        p4.entryFee = 999.0;
        p4.openSeason = "Monsoon";
        p4.getInfo();

        AmusementPark p5 = new AmusementPark();
        p5.parkId = 105;
        p5.name = "JoyLand";
        p5.location = "Hyderabad";
        p5.noOfRides = 18;
        p5.hasWaterPark = false;
        p5.entryFee = 499.0;
        p5.openSeason = "Summer";
        p5.getInfo();

        AmusementPark p6 = new AmusementPark();
        p6.parkId = 106;
        p6.name = "MegaFun";
        p6.location = "Chennai";
        p6.noOfRides = 40;
        p6.hasWaterPark = true;
        p6.entryFee = 1099.0;
        p6.openSeason = "Autumn";
        p6.getInfo();

        AmusementPark p7 = new AmusementPark();
        p7.parkId = 107;
        p7.name = "RideHeaven";
        p7.location = "Kolkata";
        p7.noOfRides = 22;
        p7.hasWaterPark = false;
        p7.entryFee = 699.0;
        p7.openSeason = "Spring";
        p7.getInfo();

        AmusementPark p8 = new AmusementPark();
        p8.parkId = 108;
        p8.name = "MagicPark";
        p8.location = "Goa";
        p8.noOfRides = 28;
        p8.hasWaterPark = true;
        p8.entryFee = 899.0;
        p8.openSeason = "Winter";
        p8.getInfo();

        AmusementPark p9 = new AmusementPark();
        p9.parkId = 109;
        p9.name = "DreamWorld";
        p9.location = "Jaipur";
        p9.noOfRides = 32;
        p9.hasWaterPark = true;
        p9.entryFee = 950.0;
        p9.openSeason = "Summer";
        p9.getInfo();

        AmusementPark p10 = new AmusementPark();
        p10.parkId = 110;
        p10.name = "GalaxyFun";
        p10.location = "Ahmedabad";
        p10.noOfRides = 26;
        p10.hasWaterPark = false;
        p10.entryFee = 775.0;
        p10.openSeason = "Monsoon";
        p10.getInfo();

        AmusementPark p11 = new AmusementPark();
        p11.parkId = 111;
        p11.name = "RollerKingdom";
        p11.location = "Surat";
        p11.noOfRides = 29;
        p11.hasWaterPark = true;
        p11.entryFee = 870.0;
        p11.openSeason = "Spring";
        p11.getInfo();

        AmusementPark p12 = new AmusementPark();
        p12.parkId = 112;
        p12.name = "SplashCity";
        p12.location = "Bhopal";
        p12.noOfRides = 21;
        p12.hasWaterPark = false;
        p12.entryFee = 620.0;
        p12.openSeason = "Winter";
        p12.getInfo();

        AmusementPark p13 = new AmusementPark();
        p13.parkId = 113;
        p13.name = "BounceLand";
        p13.location = "Nagpur";
        p13.noOfRides = 23;
        p13.hasWaterPark = true;
        p13.entryFee = 840.0;
        p13.openSeason = "Summer";
        p13.getInfo();

        AmusementPark p14 = new AmusementPark();
        p14.parkId = 114;
        p14.name = "RideRush";
        p14.location = "Lucknow";
        p14.noOfRides = 33;
        p14.hasWaterPark = false;
        p14.entryFee = 970.0;
        p14.openSeason = "Autumn";
        p14.getInfo();

        AmusementPark p15 = new AmusementPark();
        p15.parkId = 115;
        p15.name = "FunHouse";
        p15.location = "Indore";
        p15.noOfRides = 19;
        p15.hasWaterPark = true;
        p15.entryFee = 680.0;
        p15.openSeason = "Spring";
        p15.getInfo();

        AmusementPark p16 = new AmusementPark();
        p16.parkId = 116;
        p16.name = "SkyZone";
        p16.location = "Coimbatore";
        p16.noOfRides = 27;
        p16.hasWaterPark = true;
        p16.entryFee = 960.0;
        p16.openSeason = "Summer";
        p16.getInfo();

        AmusementPark p17 = new AmusementPark();
        p17.parkId = 117;
        p17.name = "WhirlPark";
        p17.location = "Vishakapatnam";
        p17.noOfRides = 31;
        p17.hasWaterPark = false;
        p17.entryFee = 825.0;
        p17.openSeason = "Winter";
        p17.getInfo();

        AmusementPark p18 = new AmusementPark();
        p18.parkId = 118;
        p18.name = "TwistTown";
        p18.location = "Mysore";
        p18.noOfRides = 24;
        p18.hasWaterPark = true;
        p18.entryFee = 715.0;
        p18.openSeason = "Autumn";
        p18.getInfo();

        AmusementPark p19 = new AmusementPark();
        p19.parkId = 119;
        p19.name = "SpinZone";
        p19.location = "Patna";
        p19.noOfRides = 34;
        p19.hasWaterPark = true;
        p19.entryFee = 990.0;
        p19.openSeason = "Monsoon";
        p19.getInfo();

        AmusementPark p20 = new AmusementPark();
        p20.parkId = 120;
        p20.name = "WildFun";
        p20.location = "Trivandrum";
        p20.noOfRides = 20;
        p20.hasWaterPark = false;
        p20.entryFee = 580.0;
        p20.openSeason = "Spring";
        p20.getInfo();

        System.out.println("MAIN ENDED");
    }
}
