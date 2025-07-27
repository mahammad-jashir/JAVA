class GymEquipmentRunner {

    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

        GymEquipment g1 = new GymEquipment(1, "Treadmill", 85.0, "Steel", true, "Cardio", "PowerMax");
        g1.GetInfo();

        GymEquipment g2 = new GymEquipment(2, "Dumbbell", 20.0, "Cast Iron", false, "Strength", "Bowflex");
        g2.GetInfo();

        GymEquipment g3 = new GymEquipment(3, "Stationary Bike", 60.0, "Aluminum", true, "Cardio", "Peloton");
        g3.GetInfo();

        GymEquipment g4 = new GymEquipment(4, "Bench Press", 50.0, "Steel", true, "Strength", "Decathlon");
        g4.GetInfo();

        GymEquipment g5 = new GymEquipment(5, "Elliptical Trainer", 70.0, "Steel", true, "Cardio", "NordicTrack");
        g5.GetInfo();

        GymEquipment g6 = new GymEquipment(6, "Pull-Up Bar", 10.0, "Iron", false, "Bodyweight", "Domyos");
        g6.GetInfo();

        GymEquipment g7 = new GymEquipment(7, "Rowing Machine", 80.0, "Aluminum", true, "Cardio", "Concept2");
        g7.GetInfo();

        GymEquipment g8 = new GymEquipment(8, "Kettlebell", 15.0, "Cast Iron", false, "Strength", "Rogue");
        g8.GetInfo();

        GymEquipment g9 = new GymEquipment(9, "Leg Press", 120.0, "Steel", true, "Strength", "Technogym");
        g9.GetInfo();

        GymEquipment g10 = new GymEquipment(10, "Smith Machine", 150.0, "Steel", true, "Strength", "Life Fitness");
        g10.GetInfo();

        GymEquipment g11 = new GymEquipment(11, "Cable Crossover", 200.0, "Steel", true, "Strength", "Matrix");
        g11.GetInfo();

        GymEquipment g12 = new GymEquipment(12, "Lat Pulldown", 90.0, "Steel", true, "Strength", "Hammer Strength");
        g12.GetInfo();

        GymEquipment g13 = new GymEquipment(13, "Bosu Ball", 5.0, "Rubber", false, "Balance", "Reebok");
        g13.GetInfo();

        GymEquipment g14 = new GymEquipment(14, "Yoga Mat", 2.5, "Foam", false, "Flexibility", "Nike");
        g14.GetInfo();

        GymEquipment g15 = new GymEquipment(15, "Resistance Band", 0.5, "Latex", false, "Strength", "TheraBand");
        g15.GetInfo();

        GymEquipment g16 = new GymEquipment(16, "Ab Roller", 3.0, "Plastic", false, "Core", "Domyos");
        g16.GetInfo();

        GymEquipment g17 = new GymEquipment(17, "Barbell", 25.0, "Steel", false, "Strength", "Eleiko");
        g17.GetInfo();

        GymEquipment g18 = new GymEquipment(18, "Jump Rope", 0.3, "PVC", false, "Cardio", "Adidas");
        g18.GetInfo();

        GymEquipment g19 = new GymEquipment(19, "Stepper", 18.0, "Plastic", false, "Cardio", "ProForm");
        g19.GetInfo();

        GymEquipment g20 = new GymEquipment(20, "Foam Roller", 1.2, "EVA Foam", false, "Recovery", "TriggerPoint");
        g20.GetInfo();

        System.out.println("THE MAIN ENDED");
    }
}
