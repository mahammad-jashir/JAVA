class CourtCase {

    int caseId;
    String courtName;
    String judgeName;
    String caseType;
    String status;
    String hearingDate;
    boolean isHighProfile;

    public void getInfo() {
        System.out.println("Case ID: " + caseId);
        System.out.println("Court Name: " + courtName);
        System.out.println("Judge Name: " + judgeName);
        System.out.println("Case Type: " + caseType);
        System.out.println("Status: " + status);
        System.out.println("Hearing Date: " + hearingDate);
        System.out.println("Is High Profile: " + isHighProfile);
    }
}
