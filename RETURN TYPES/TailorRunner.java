class TailorRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String name = Tailor.getName();
        int years = Tailor.getExperienceYears();
        boolean certified = Tailor.isCertifiedTailor();
        char level = Tailor.getSkillLevel();
        double income = Tailor.getMonthlyIncome();

        System.out.println("Tailor Name: " + name);
        System.out.println("Experience: " + years + " years");
        System.out.println("Certified: " + certified);
        System.out.println("Skill Level: " + level);
        System.out.println("Monthly Income: ₹" + income);
    }
}
