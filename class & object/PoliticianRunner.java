class PoliticianRunner {

    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

        Politician p1 = new Politician();
        p1.politicianId = 1;
        p1.name = "Narendra Modi";
        p1.party = "BJP";
        p1.position = "Prime Minister";
        p1.age = 73;
        p1.constituency = "Varanasi";
        p1.isActive = true;
        p1.getInfo();

        Politician p2 = new Politician();
        p2.politicianId = 2;
        p2.name = "Rahul Gandhi";
        p2.party = "INC";
        p2.position = "MP";
        p2.age = 54;
        p2.constituency = "Wayanad";
        p2.isActive = true;
        p2.getInfo();

        Politician p3 = new Politician();
        p3.politicianId = 3;
        p3.name = "Mamata Banerjee";
        p3.party = "TMC";
        p3.position = "CM";
        p3.age = 69;
        p3.constituency = "Bhabanipur";
        p3.isActive = true;
        p3.getInfo();

        Politician p4 = new Politician();
        p4.politicianId = 4;
        p4.name = "Arvind Kejriwal";
        p4.party = "AAP";
        p4.position = "CM";
        p4.age = 56;
        p4.constituency = "New Delhi";
        p4.isActive = true;
        p4.getInfo();

        Politician p5 = new Politician();
        p5.politicianId = 5;
        p5.name = "Yogi Adityanath";
        p5.party = "BJP";
        p5.position = "CM";
        p5.age = 51;
        p5.constituency = "Gorakhpur";
        p5.isActive = true;
        p5.getInfo();

        Politician p6 = new Politician();
        p6.politicianId = 6;
        p6.name = "Akhilesh Yadav";
        p6.party = "SP";
        p6.position = "MP";
        p6.age = 50;
        p6.constituency = "Azamgarh";
        p6.isActive = true;
        p6.getInfo();

        Politician p7 = new Politician();
        p7.politicianId = 7;
        p7.name = "Sharad Pawar";
        p7.party = "NCP";
        p7.position = "President";
        p7.age = 84;
        p7.constituency = "Baramati";
        p7.isActive = false;
        p7.getInfo();

        Politician p8 = new Politician();
        p8.politicianId = 8;
        p8.name = "Nitish Kumar";
        p8.party = "JD(U)";
        p8.position = "CM";
        p8.age = 73;
        p8.constituency = "Nalanda";
        p8.isActive = true;
        p8.getInfo();

        Politician p9 = new Politician();
        p9.politicianId = 9;
        p9.name = "Uddhav Thackeray";
        p9.party = "Shiv Sena (UBT)";
        p9.position = "Leader";
        p9.age = 64;
        p9.constituency = "Mumbai";
        p9.isActive = true;
        p9.getInfo();

        Politician p10 = new Politician();
        p10.politicianId = 10;
        p10.name = "Pinarayi Vijayan";
        p10.party = "CPI(M)";
        p10.position = "CM";
        p10.age = 78;
        p10.constituency = "Dharmadom";
        p10.isActive = true;
        p10.getInfo();

        Politician p11 = new Politician();
        p11.politicianId = 11;
        p11.name = "Sonia Gandhi";
        p11.party = "INC";
        p11.position = "MP";
        p11.age = 77;
        p11.constituency = "Raebareli";
        p11.isActive = false;
        p11.getInfo();

        Politician p12 = new Politician();
        p12.politicianId = 12;
        p12.name = "Shashi Tharoor";
        p12.party = "INC";
        p12.position = "MP";
        p12.age = 68;
        p12.constituency = "Thiruvananthapuram";
        p12.isActive = true;
        p12.getInfo();

        Politician p13 = new Politician();
        p13.politicianId = 13;
        p13.name = "Bhupesh Baghel";
        p13.party = "INC";
        p13.position = "CM";
        p13.age = 63;
        p13.constituency = "Patan";
        p13.isActive = true;
        p13.getInfo();

        Politician p14 = new Politician();
        p14.politicianId = 14;
        p14.name = "Hemant Soren";
        p14.party = "JMM";
        p14.position = "CM";
        p14.age = 49;
        p14.constituency = "Dumka";
        p14.isActive = false;
        p14.getInfo();

        Politician p15 = new Politician();
        p15.politicianId = 15;
        p15.name = "K. Chandrashekar Rao";
        p15.party = "BRS";
        p15.position = "Ex-CM";
        p15.age = 70;
        p15.constituency = "Gajwel";
        p15.isActive = true;
        p15.getInfo();

        Politician p16 = new Politician();
        p16.politicianId = 16;
        p16.name = "M.K. Stalin";
        p16.party = "DMK";
        p16.position = "CM";
        p16.age = 71;
        p16.constituency = "Kolathur";
        p16.isActive = true;
        p16.getInfo();

        Politician p17 = new Politician();
        p17.politicianId = 17;
        p17.name = "Naveen Patnaik";
        p17.party = "BJD";
        p17.position = "CM";
        p17.age = 78;
        p17.constituency = "Hinjili";
        p17.isActive = true;
        p17.getInfo();

        Politician p18 = new Politician();
        p18.politicianId = 18;
        p18.name = "Devendra Fadnavis";
        p18.party = "BJP";
        p18.position = "Deputy CM";
        p18.age = 54;
        p18.constituency = "Nagpur";
        p18.isActive = true;
        p18.getInfo();

        Politician p19 = new Politician();
        p19.politicianId = 19;
        p19.name = "Mayawati";
        p19.party = "BSP";
        p19.position = "Leader";
        p19.age = 68;
        p19.constituency = "Uttar Pradesh";
        p19.isActive = false;
        p19.getInfo();

        Politician p20 = new Politician();
        p20.politicianId = 20;
        p20.name = "Kejal Patel";
        p20.party = "Independent";
        p20.position = "Councillor";
        p20.age = 41;
        p20.constituency = "Ahmedabad West";
        p20.isActive = true;
        p20.getInfo();
    }
}
