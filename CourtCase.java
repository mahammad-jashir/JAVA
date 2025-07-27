class CourtCase {

    int caseId;
    String courtName;
    String judgeName;
    String caseType;
    String status;
    String hearingDate;
    boolean isHighProfile;

    CourtCase() {
        System.out.println("CourtCase Default Constructor Invoked ------------------");
    }

    CourtCase(int caseId, String courtName, String judgeName, String caseType, String status, String hearingDate, boolean isHighProfile) {
        System.out.println("CourtCase Parameterized Constructor Invoked");
        this.caseId = caseId;
        this.courtName = courtName;
        this.judgeName = judgeName;
        this.caseType = caseType;
        this.status = status;
        this.hearingDate = hearingDate;
        this.isHighProfile = isHighProfile;
    }

    public void getInfo() {
        System.out.println("Case ID: " + caseId);
        System.out.println("Court Name: " + courtName);
        System.out.println("Judge Name: " + judgeName);
        System.out.println("Case Type: " + caseType);
        System.out.println("Status: " + status);
        System.out.println("Hearing Date: " + hearingDate);
        System.out.println("Is High Profile: " + isHighProfile);
        System.out.println("---------------------------------------------------");
    }
}
