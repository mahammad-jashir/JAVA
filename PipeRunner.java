class PipeRunner {

    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

        Pipe p1 = new Pipe(1, "PVC", 3.0, 2.5, true, "Prince Pipes", 220.0);
        p1.GetInfo();

        Pipe p2 = new Pipe(2, "Steel", 4.5, 3.0, false, "Tata Steel", 750.0);
        p2.GetInfo();

        Pipe p3 = new Pipe(3, "Copper", 2.0, 1.5, false, "Hindalco", 1200.0);
        p3.GetInfo();

        Pipe p4 = new Pipe(4, "PEX", 6.0, 2.2, true, "Astral", 310.0);
        p4.GetInfo();

        Pipe p5 = new Pipe(5, "HDPE", 5.0, 3.5, true, "Supreme", 480.0);
        p5.GetInfo();

        Pipe p6 = new Pipe(6, "Cast Iron", 3.5, 4.0, false, "Jindal", 1350.0);
        p6.GetInfo();

        Pipe p7 = new Pipe(7, "Galvanized", 4.0, 2.8, false, "JSW", 860.0);
        p7.GetInfo();

        Pipe p8 = new Pipe(8, "Concrete", 5.5, 10.0, false, "UltraTech", 2200.0);
        p8.GetInfo();

        Pipe p9 = new Pipe(9, "ABS", 2.0, 1.2, true, "FlowGuard", 150.0);
        p9.GetInfo();

        Pipe p10 = new Pipe(10, "Lead", 1.5, 0.9, false, "OldMetals", 1800.0);
        p10.GetInfo();

        Pipe p11 = new Pipe(11, "Aluminum", 3.3, 2.4, false, "NALCO", 690.0);
        p11.GetInfo();

        Pipe p12 = new Pipe(12, "Brass", 2.7, 1.8, false, "BrassWorks", 1450.0);
        p12.GetInfo();

        Pipe p13 = new Pipe(13, "Fiberglass", 6.5, 3.1, true, "GlassPro", 510.0);
        p13.GetInfo();

        Pipe p14 = new Pipe(14, "Clay", 4.8, 5.0, false, "EcoPipes", 990.0);
        p14.GetInfo();

        Pipe p15 = new Pipe(15, "Carbon Steel", 3.2, 2.6, false, "Essar", 820.0);
        p15.GetInfo();

        Pipe p16 = new Pipe(16, "Rubber", 2.0, 1.0, true, "Elastic Co.", 300.0);
        p16.GetInfo();

        Pipe p17 = new Pipe(17, "Bamboo", 1.5, 2.0, true, "NaturalCraft", 180.0);
        p17.GetInfo();

        Pipe p18 = new Pipe(18, "Stainless Steel", 5.0, 2.5, false, "Salem Steel", 1350.0);
        p18.GetInfo();

        Pipe p19 = new Pipe(19, "Nylon", 3.0, 1.6, true, "Flexo", 400.0);
        p19.GetInfo();

        Pipe p20 = new Pipe(20, "Acrylic", 4.5, 3.0, true, "ClearFlow", 520.0);
        p20.GetInfo();

        System.out.println("THE MAIN ENDED");
    }
}
