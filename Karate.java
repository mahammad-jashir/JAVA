class Karate {
   
    Karate() {
        System.out.println("Karate Default Constructor Invoked ------------------");
    }

    Karate(int beltLevel, String style, String practitionerName, int yearsOfTraining, boolean hasBlackBelt, String dojoName, String country) {
        System.out.println("Karate Parameterized Constructor Invoked");
        this.beltLevel = beltLevel;
        this.style = style;
        this.practitionerName = practitionerName;
        this.yearsOfTraining = yearsOfTraining;
        this.hasBlackBelt = hasBlackBelt;
        this.dojoName = dojoName;
        this.country = country;
    }

 int beltLevel;
    String style;
    String practitionerName;
    int yearsOfTraining;
    boolean hasBlackBelt;
    String dojoName;
    String country;

    public void getInfo() {
        System.out.println("Belt Level: " + beltLevel);
        System.out.println("Style: " + style);
        System.out.println("Practitioner Name: " + practitionerName);
        System.out.println("Years Of Training: " + yearsOfTraining);
        System.out.println("Has Black Belt: " + hasBlackBelt);
        System.out.println("Dojo Name: " + dojoName);
        System.out.println("Country: " + country);
        System.out.println("---------------------------------------------------");
    }
}
