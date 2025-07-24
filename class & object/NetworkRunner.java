class NetworkRunner {

    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

        Network n1 = new Network();
        n1.networkId = 1;
        n1.providerName = "Jio";
        n1.country = "India";
        n1.networkType = "5G";
        n1.speedMbps = 1000.0;
        n1.isUnlimited = true;
        n1.monthlyCost = 599.0;
        n1.GetInfo();

        Network n2 = new Network();
        n2.networkId = 2;
        n2.providerName = "Airtel";
        n2.country = "India";
        n2.networkType = "5G";
        n2.speedMbps = 950.0;
        n2.isUnlimited = true;
        n2.monthlyCost = 699.0;
        n2.GetInfo();

        Network n3 = new Network();
        n3.networkId = 3;
        n3.providerName = "Vi";
        n3.country = "India";
        n3.networkType = "4G";
        n3.speedMbps = 300.0;
        n3.isUnlimited = false;
        n3.monthlyCost = 449.0;
        n3.GetInfo();

        Network n4 = new Network();
        n4.networkId = 4;
        n4.providerName = "BSNL";
        n4.country = "India";
        n4.networkType = "4G";
        n4.speedMbps = 80.0;
        n4.isUnlimited = false;
        n4.monthlyCost = 399.0;
        n4.GetInfo();

        Network n5 = new Network();
        n5.networkId = 5;
        n5.providerName = "T-Mobile";
        n5.country = "USA";
        n5.networkType = "5G";
        n5.speedMbps = 1200.0;
        n5.isUnlimited = true;
        n5.monthlyCost = 799.0;
        n5.GetInfo();

        Network n6 = new Network();
        n6.networkId = 6;
        n6.providerName = "Verizon";
        n6.country = "USA";
        n6.networkType = "5G";
        n6.speedMbps = 1400.0;
        n6.isUnlimited = true;
        n6.monthlyCost = 999.0;
        n6.GetInfo();

        Network n7 = new Network();
        n7.networkId = 7;
        n7.providerName = "AT&T";
        n7.country = "USA";
        n7.networkType = "5G";
        n7.speedMbps = 1100.0;
        n7.isUnlimited = false;
        n7.monthlyCost = 899.0;
        n7.GetInfo();

        Network n8 = new Network();
        n8.networkId = 8;
        n8.providerName = "Vodafone";
        n8.country = "UK";
        n8.networkType = "5G";
        n8.speedMbps = 900.0;
        n8.isUnlimited = true;
        n8.monthlyCost = 750.0;
        n8.GetInfo();

        Network n9 = new Network();
        n9.networkId = 9;
        n9.providerName = "EE";
        n9.country = "UK";
        n9.networkType = "5G";
        n9.speedMbps = 1050.0;
        n9.isUnlimited = false;
        n9.monthlyCost = 820.0;
       n9.GetInfo();

        Network n10 = new Network();
        n10.networkId = 10;
        n10.providerName = "O2";
        n10.country = "UK";
        n10.networkType = "4G";
        n10.speedMbps = 600.0;
        n10.isUnlimited = true;
        n10.monthlyCost = 680.0;
        n10.GetInfo();

       Network n11 = new Network();
        n11.networkId = 11;
        n11.providerName = "Orange";
        n11.country = "France";
        n11.networkType = "5G";
        n11.speedMbps = 850.0;
        n11.isUnlimited = true;
        n11.monthlyCost = 770.0;
        n11.GetInfo();

        Network n12 = new Network();
        n12.networkId = 12;
        n12.providerName = "SFR";
        n12.country = "France";
        n12.networkType = "4G";
        n12.speedMbps = 700.0;
        n12.isUnlimited = false;
        n12.monthlyCost = 540.0;
        n12.GetInfo();

        Network n13 = new Network();
        n13.networkId = 13;
        n13.providerName = "Bell";
        n13.country = "Canada";
        n13.networkType = "5G";
        n13.speedMbps = 980.0;
        n13.isUnlimited = true;
        n13.monthlyCost = 880.0;
        n13.GetInfo();

        Network n14 = new Network();
        n14.networkId = 14;
        n14.providerName = "Rogers";
        n14.country = "Canada";
        n14.networkType = "4G";
        n14.speedMbps = 750.0;
        n14.isUnlimited = false;
        n14.monthlyCost = 590.0;
        n14.GetInfo();

        Network n15 = new Network();
        n15.networkId = 15;
        n15.providerName = "Telus";
        n15.country = "Canada";
        n15.networkType = "5G";
        n15.speedMbps = 990.0;
        n15.isUnlimited = true;
        n15.monthlyCost = 920.0;
        n15.GetInfo();

        Network n16 = new Network();
        n16.networkId = 16;
        n16.providerName = "Optus";
        n16.country = "Australia";
        n16.networkType = "5G";
        n16.speedMbps = 1020.0;
        n16.isUnlimited = true;
        n16.monthlyCost = 850.0;
        n16.GetInfo();

        Network n17 = new Network();
        n17.networkId = 17;
        n17.providerName = "Telstra";
        n17.country = "Australia";
        n17.networkType = "4G";
        n17.speedMbps = 690.0;
        n17.isUnlimited = false;
        n17.monthlyCost = 580.0;
        n17.GetInfo();

        Network n18 = new Network();
        n18.networkId = 18;
        n18.providerName = "Movistar";
        n18.country = "Spain";
        n18.networkType = "5G";
        n18.speedMbps = 870.0;
        n18.isUnlimited = true;
        n18.monthlyCost = 720.0;
        n18.GetInfo();

        Network n19 = new Network();
        n19.networkId = 19;
        n19.providerName = "Vodafone";
        n19.country = "Germany";
        n19.networkType = "4G";
        n19.speedMbps = 720.0;
        n19.isUnlimited = false;
        n19.monthlyCost = 630.0;
        n19.GetInfo();
      
        Network n20 = new Network();
        n20.networkId = 20;
        n20.providerName = "You Broadband";
        n20.country = "India";
        n20.networkType = "Broadband";
        n20.speedMbps = 800.0;
        n20.isUnlimited = false;
        n20.monthlyCost = 720.0;
        n20.GetInfo();

           }
}
