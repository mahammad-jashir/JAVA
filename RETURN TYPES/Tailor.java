class Tailor {
    static String name;
    static int experienceYears;
    static boolean isCertified;
    static char skillLevel;
    static double monthlyIncome;

    public static String getName() {
        name = "Prajus style";
        return name;
    }
    public static int getExperienceYears() {
        experienceYears = 10;
        return experienceYears;
    }
    public static boolean isCertifiedTailor() {
        isCertified = true;
        return isCertified;
    }
    public static char getSkillLevel() {
        skillLevel = 'S';
        return skillLevel;
    }
    public static double getMonthlyIncome() {
        monthlyIncome = 30000.00;
        return monthlyIncome;
    }
}
