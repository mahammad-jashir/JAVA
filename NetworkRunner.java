class NetworkRunner {

    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

        Network n1 = new Network(1, "Jio", "India", "4G", 150.0, true, 399.0);
        n1.GetInfo();

        Network n2 = new Network(2, "Airtel", "India", "5G", 200.0, true, 499.0);
        n2.GetInfo();

        Network n3 = new Network(3, "Vi", "India", "4G", 100.0, false, 299.0);
        n3.GetInfo();

        Network n4 = new Network(4, "BSNL", "India", "3G", 40.0, false, 199.0);
        n4.GetInfo();

        Network n5 = new Network(5, "AT&T", "USA", "5G", 300.0, true, 699.0);
        n5.GetInfo();

        Network n6 = new Network(6, "Verizon", "USA", "5G", 320.0, true, 749.0);
        n6.GetInfo();

        Network n7 = new Network(7, "T-Mobile", "USA", "5G", 280.0, true, 699.0);
        n7.GetInfo();

        Network n8 = new Network(8, "O2", "UK", "4G", 100.0, false, 350.0);
        n8.GetInfo();

        Network n9 = new Network(9, "EE", "UK", "5G", 250.0, true, 650.0);
        n9.GetInfo();

        Network n10 = new Network(10, "Vodafone", "Germany", "5G", 270.0, true, 720.0);
        n10.GetInfo();

        Network n11 = new Network(11, "Telstra", "Australia", "4G", 180.0, true, 550.0);
        n11.GetInfo();

        Network n12 = new Network(12, "Optus", "Australia", "5G", 200.0, true, 580.0);
        n12.GetInfo();

        Network n13 = new Network(13, "KDDI", "Japan", "5G", 300.0, true, 690.0);
        n13.GetInfo();

        Network n14 = new Network(14, "NTT Docomo", "Japan", "4G", 150.0, false, 500.0);
        n14.GetInfo();

        Network n15 = new Network(15, "SK Telecom", "South Korea", "5G", 350.0, true, 799.0);
        n15.GetInfo();

        Network n16 = new Network(16, "China Mobile", "China", "5G", 400.0, true, 850.0);
        n16.GetInfo();

        Network n17 = new Network(17, "Orange", "France", "4G", 200.0, true, 600.0);
        n17.GetInfo();

        Network n18 = new Network(18, "Movistar", "Spain", "4G", 180.0, false, 480.0);
        n18.GetInfo();

        Network n19 = new Network(19, "TIM", "Italy", "4G", 170.0, true, 510.0);
        n19.GetInfo();

        Network n20 = new Network(20, "Rogers", "Canada", "5G", 320.0, true, 740.0);
        n20.GetInfo();

           }
}
