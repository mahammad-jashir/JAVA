class GymEquipmentRunner {

    public static void main(String[] args) {

        System.out.println("THE MAIN STARTED");

        GymEquipment equip1 = new GymEquipment();
        equip1.equipmentId = 1;
        equip1.name = "Dumbbell";
        equip1.weight = 10.5;
        equip1.material = "Iron";
        equip1.isAdjustable = false;
        equip1.category = "Strength";
        equip1.brand = "FitPro";
        equip1.GetInfo();

        GymEquipment equip2 = new GymEquipment();
        equip2.equipmentId = 2;
        equip2.name = "Barbell";
        equip2.weight = 20.0;
        equip2.material = "Steel";
        equip2.isAdjustable = true;
        equip2.category = "Strength";
        equip2.brand = "StrongMax";
        equip2.GetInfo();


        GymEquipment equip3 = new GymEquipment();
        equip3.equipmentId = 3;
        equip3.name = "Treadmill";
        equip3.weight = 75.0;
        equip3.material = "Steel";
        equip3.isAdjustable = true;
        equip3.category = "Cardio";
        equip3.brand = "RunWay";
        equip3.GetInfo();


        GymEquipment equip4 = new GymEquipment();
        equip4.equipmentId = 4;
        equip4.name = "Exercise Bike";
        equip4.weight = 60.0;
        equip4.material = "Aluminum";
        equip4.isAdjustable = true;
        equip4.category = "Cardio";
        equip4.brand = "CycleFit";
       equip4.GetInfo();


        GymEquipment equip5 = new GymEquipment();
        equip5.equipmentId = 5;
        equip5.name = "Rowing Machine";
        equip5.weight = 55.5;
        equip5.material = "Steel";
        equip5.isAdjustable = true;
        equip5.category = "Cardio";
        equip5.brand = "RowMaster";
        equip5.GetInfo();


        GymEquipment equip6 = new GymEquipment();
        equip6.equipmentId = 6;
        equip6.name = "Leg Press Machine";
        equip6.weight = 80.0;
        equip6.material = "Iron";
        equip6.isAdjustable = false;
        equip6.category = "Strength";
        equip6.brand = "LegBuild";
        equip6.GetInfo();


        GymEquipment equip7 = new GymEquipment();
        equip7.equipmentId = 7;
        equip7.name = "Chest Press Machine";
        equip7.weight = 85.0;
        equip7.material = "Steel";
        equip7.isAdjustable = true;
        equip7.category = "Strength";
        equip7.brand = "ChestCore";
        equip7.GetInfo();


        GymEquipment equip8 = new GymEquipment();
        equip8.equipmentId = 8;
        equip8.name = "Kettlebell";
        equip8.weight = 12.0;
        equip8.material = "Cast Iron";
        equip8.isAdjustable = false;
        equip8.category = "Strength";
        equip8.brand = "PowerBell";
        equip8.GetInfo();


        GymEquipment equip9 = new GymEquipment();
        equip9.equipmentId = 9;
        equip9.name = "Pull-up Bar";
        equip9.weight = 7.5;
        equip9.material = "Steel";
        equip9.isAdjustable = false;
        equip9.category = "Bodyweight";
        equip9.brand = "FlexBar";
        equip9.GetInfo();

        GymEquipment equip10 = new GymEquipment();
        equip10.equipmentId = 10;
        equip10.name = "Resistance Bands";
        equip10.weight = 0.8;
        equip10.material = "Rubber";
        equip10.isAdjustable = true;
        equip10.category = "Flexibility";
        equip10.brand = "StretchX";
        equip10.GetInfo();



        GymEquipment equip11 = new GymEquipment();
        equip11.equipmentId = 11;
        equip11.name = "Jump Rope";
        equip11.weight = 0.4;
        equip11.material = "Plastic";
        equip11.isAdjustable = true;
        equip11.category = "Cardio";
        equip11.brand = "SpeedRope";
       equip11.GetInfo();


        GymEquipment equip12 = new GymEquipment();
        equip12.equipmentId = 12;
        equip12.name = "Treadmill Desk";
        equip12.weight = 100.0;
        equip12.material = "Steel & Plastic";
        equip12.isAdjustable = true;
        equip12.category = "Cardio";
        equip12.brand = "WalkNWork";
        equip12.GetInfo();


        GymEquipment equip13 = new GymEquipment();
        equip13.equipmentId = 13;
        equip13.name = "Incline Bench";
        equip13.weight = 28.0;
        equip13.material = "Iron";
        equip13.isAdjustable = true;
        equip13.category = "Strength";
        equip13.brand = "BenchPro";
        equip13.GetInfo();


        GymEquipment equip14 = new GymEquipment();
        equip14.equipmentId = 14;
        equip14.name = "Cable Crossover";
        equip14.weight = 150.0;
        equip14.material = "Steel";
        equip14.isAdjustable = true;
        equip14.category = "Strength";
        equip14.brand = "CableKing";
        equip14.GetInfo();


        GymEquipment equip15 = new GymEquipment();
        equip15.equipmentId = 15;
        equip15.name = "Medicine Ball";
        equip15.weight = 6.0;
        equip15.material = "Rubber";
        equip15.isAdjustable = false;
        equip15.category = "Functional";
        equip15.brand = "BallFit";
        equip15.GetInfo();


        GymEquipment equip16 = new GymEquipment();
        equip16.equipmentId = 16;
        equip16.name = "Foam Roller";
        equip16.weight = 1.0;
        equip16.material = "Foam";
        equip16.isAdjustable = false;
        equip16.category = "Recovery";
        equip16.brand = "RollEase";
        equip16.GetInfo();


        GymEquipment equip17 = new GymEquipment();
        equip17.equipmentId = 17;
        equip17.name = "Stepper";
        equip17.weight = 18.5;
        equip17.material = "Plastic & Steel";
        equip17.isAdjustable = true;
        equip17.category = "Cardio";
        equip17.brand = "StepUp";
        equip17.GetInfo();


        GymEquipment equip18 = new GymEquipment();
        equip18.equipmentId = 18;
        equip18.name = "Tricep Bar";
        equip18.weight = 8.0;
        equip18.material = "Steel";
        equip18.isAdjustable = false;
        equip18.category = "Strength";
        equip18.brand = "ArmIron";
        equip18.GetInfo();


        GymEquipment equip19 = new GymEquipment();
        equip19.equipmentId = 19;
        equip19.name = "Battle Ropes";
        equip19.weight = 15.0;
        equip19.material = "Nylon";
        equip19.isAdjustable = false;
        equip19.category = "Conditioning";
        equip19.brand = "RopeX";
        equip19.GetInfo();


        GymEquipment equip20 = new GymEquipment();
        equip20.equipmentId = 20;
        equip20.name = "Ab Roller";
        equip20.weight = 2.0;
        equip20.material = "Plastic & Rubber";
        equip20.isAdjustable = false;
        equip20.category = "Core";
        equip20.brand = "AbPower";
        equip20.GetInfo();


        System.out.println("THE MAIN ENDED");
    }
}


       
