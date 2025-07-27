class Network {

    Network() {
        System.out.println("Network Default Constructor Invoked ------------------------");
    }

    Network(int networkId, String providerName, String country, String networkType, double speedMbps, boolean isUnlimited, double monthlyCost) {
        System.out.println("Network Parameterized Constructor Invoked");
        this.networkId = networkId;
        this.providerName = providerName;
        this.country = country;
        this.networkType = networkType;
        this.speedMbps = speedMbps;
        this.isUnlimited = isUnlimited;
        this.monthlyCost = monthlyCost;
    }

    int networkId;
    String providerName;
    String country;
    String networkType;  
    double speedMbps;
    boolean isUnlimited;
    double monthlyCost;

    public void GetInfo() {
        System.out.println("Network ID: " + networkId);
        System.out.println("Provider Name: " + providerName);
        System.out.println("Country: " + country);
        System.out.println("Network Type: " + networkType);
        System.out.println("Speed (Mbps): " + speedMbps);
        System.out.println("Is Unlimited: " + isUnlimited);
        System.out.println("Monthly Cost: ₹" + monthlyCost);
        System.out.println("----------------------------------------------------------");
    }
}
