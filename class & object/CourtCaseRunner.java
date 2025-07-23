class CourtCaseRunner {

    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

        CourtCase c1 = new CourtCase();
        c1.caseId = 101;
        c1.courtName = "Supreme Court";
        c1.judgeName = "Justice Rao";
        c1.caseType = "Civil";
        c1.status = "Pending";
        c1.hearingDate = "01-08-2025";
        c1.isHighProfile = true;

        System.out.println("Case ID: " + c1.caseId);
        System.out.println("Court Name: " + c1.courtName);
        System.out.println("Judge Name: " + c1.judgeName);
        System.out.println("Case Type: " + c1.caseType);
        System.out.println("Status: " + c1.status);
        System.out.println("Hearing Date: " + c1.hearingDate);
        System.out.println("High Profile: " + c1.isHighProfile);

        CourtCase c2 = new CourtCase();
        c2.caseId = 102;
        c2.courtName = "High Court";
        c2.judgeName = "Justice Mehra";
        c2.caseType = "Criminal";
        c2.status = "Closed";
        c2.hearingDate = "15-07-2025";
        c2.isHighProfile = false;

        System.out.println("Case ID: " + c2.caseId);
        System.out.println("Court Name: " + c2.courtName);
        System.out.println("Judge Name: " + c2.judgeName);
        System.out.println("Case Type: " + c2.caseType);
        System.out.println("Status: " + c2.status);
        System.out.println("Hearing Date: " + c2.hearingDate);
        System.out.println("High Profile: " + c2.isHighProfile);

        CourtCase c3 = new CourtCase();
        c3.caseId = 103;
        c3.courtName = "District Court";
        c3.judgeName = "Justice Singh";
        c3.caseType = "Family";
        c3.status = "Open";
        c3.hearingDate = "05-09-2025";
        c3.isHighProfile = false;

        System.out.println("Case ID: " + c3.caseId);
        System.out.println("Court Name: " + c3.courtName);
        System.out.println("Judge Name: " + c3.judgeName);
        System.out.println("Case Type: " + c3.caseType);
        System.out.println("Status: " + c3.status);
        System.out.println("Hearing Date: " + c3.hearingDate);
        System.out.println("High Profile: " + c3.isHighProfile);

        CourtCase c4 = new CourtCase();
        c4.caseId = 104;
        c4.courtName = "City Court";
        c4.judgeName = "Justice Iyer";
        c4.caseType = "Land";
        c4.status = "Pending";
        c4.hearingDate = "20-08-2025";
        c4.isHighProfile = false;

        System.out.println("Case ID: " + c4.caseId);
        System.out.println("Court Name: " + c4.courtName);
        System.out.println("Judge Name: " + c4.judgeName);
        System.out.println("Case Type: " + c4.caseType);
        System.out.println("Status: " + c4.status);
        System.out.println("Hearing Date: " + c4.hearingDate);
        System.out.println("High Profile: " + c4.isHighProfile);

                CourtCase c5 = new CourtCase();
        c5.caseId = 105;
        c5.courtName = "District Court";
        c5.judgeName = "Justice Yadav";
        c5.caseType = "Criminal";
        c5.status = "Under Trial";
        c5.hearingDate = "05-09-2025";
        c5.isHighProfile = true;

        System.out.println("Case ID: " + c5.caseId);
        System.out.println("Court Name: " + c5.courtName);
        System.out.println("Judge Name: " + c5.judgeName);
        System.out.println("Case Type: " + c5.caseType);
        System.out.println("Status: " + c5.status);
        System.out.println("Hearing Date: " + c5.hearingDate);
        System.out.println("High Profile: " + c5.isHighProfile);

        CourtCase c6 = new CourtCase();
        c6.caseId = 106;
        c6.courtName = "Family Court";
        c6.judgeName = "Justice Nair";
        c6.caseType = "Family";
        c6.status = "Closed";
        c6.hearingDate = "22-06-2025";
        c6.isHighProfile = false;

        System.out.println("Case ID: " + c6.caseId);
        System.out.println("Court Name: " + c6.courtName);
        System.out.println("Judge Name: " + c6.judgeName);
        System.out.println("Case Type: " + c6.caseType);
        System.out.println("Status: " + c6.status);
        System.out.println("Hearing Date: " + c6.hearingDate);
        System.out.println("High Profile: " + c6.isHighProfile);

        CourtCase c7 = new CourtCase();
        c7.caseId = 107;
        c7.courtName = "High Court";
        c7.judgeName = "Justice Shankar";
        c7.caseType = "Civil";
        c7.status = "Appeal";
        c7.hearingDate = "10-10-2025";
        c7.isHighProfile = true;

        System.out.println("Case ID: " + c7.caseId);
        System.out.println("Court Name: " + c7.courtName);
        System.out.println("Judge Name: " + c7.judgeName);
        System.out.println("Case Type: " + c7.caseType);
        System.out.println("Status: " + c7.status);
        System.out.println("Hearing Date: " + c7.hearingDate);
        System.out.println("High Profile: " + c7.isHighProfile);

        CourtCase c8 = new CourtCase();
        c8.caseId = 108;
        c8.courtName = "Supreme Court";
        c8.judgeName = "Justice Lal";
        c8.caseType = "Criminal";
        c8.status = "Pending";
        c8.hearingDate = "28-08-2025";
        c8.isHighProfile = false;

        System.out.println("Case ID: " + c8.caseId);
        System.out.println("Court Name: " + c8.courtName);
        System.out.println("Judge Name: " + c8.judgeName);
        System.out.println("Case Type: " + c8.caseType);
        System.out.println("Status: " + c8.status);
        System.out.println("Hearing Date: " + c8.hearingDate);
        System.out.println("High Profile: " + c8.isHighProfile);

        CourtCase c9 = new CourtCase();
        c9.caseId = 109;
        c9.courtName = "District Court";
        c9.judgeName = "Justice Rao";
        c9.caseType = "Property";
        c9.status = "Closed";
        c9.hearingDate = "15-09-2025";
        c9.isHighProfile = false;

        System.out.println("Case ID: " + c9.caseId);
        System.out.println("Court Name: " + c9.courtName);
        System.out.println("Judge Name: " + c9.judgeName);
        System.out.println("Case Type: " + c9.caseType);
        System.out.println("Status: " + c9.status);
        System.out.println("Hearing Date: " + c9.hearingDate);
        System.out.println("High Profile: " + c9.isHighProfile);

        CourtCase c10 = new CourtCase();
        c10.caseId = 110;
        c10.courtName = "Consumer Court";
        c10.judgeName = "Justice Patil";
        c10.caseType = "Consumer";
        c10.status = "Open";
        c10.hearingDate = "12-08-2025";
        c10.isHighProfile = false;

        System.out.println("Case ID: " + c10.caseId);
        System.out.println("Court Name: " + c10.courtName);
        System.out.println("Judge Name: " + c10.judgeName);
        System.out.println("Case Type: " + c10.caseType);
        System.out.println("Status: " + c10.status);
        System.out.println("Hearing Date: " + c10.hearingDate);
        System.out.println("High Profile: " + c10.isHighProfile);

               CourtCase c11 = new CourtCase();
        c11.caseId = 111;
        c11.courtName = "Family Court";
        c11.judgeName = "Justice Manjunath";
        c11.caseType = "Divorce";
        c11.status = "Under Review";
        c11.hearingDate = "02-11-2025";
        c11.isHighProfile = false;

        System.out.println("Case ID: " + c11.caseId);
        System.out.println("Court Name: " + c11.courtName);
        System.out.println("Judge Name: " + c11.judgeName);
        System.out.println("Case Type: " + c11.caseType);
        System.out.println("Status: " + c11.status);
        System.out.println("Hearing Date: " + c11.hearingDate);
        System.out.println("High Profile: " + c11.isHighProfile);

        CourtCase c12 = new CourtCase();
        c12.caseId = 112;
        c12.courtName = "High Court";
        c12.judgeName = "Justice Tripathi";
        c12.caseType = "Criminal";
        c12.status = "Open";
        c12.hearingDate = "12-12-2025";
        c12.isHighProfile = true;

        System.out.println("Case ID: " + c12.caseId);
        System.out.println("Court Name: " + c12.courtName);
        System.out.println("Judge Name: " + c12.judgeName);
        System.out.println("Case Type: " + c12.caseType);
        System.out.println("Status: " + c12.status);
        System.out.println("Hearing Date: " + c12.hearingDate);
        System.out.println("High Profile: " + c12.isHighProfile);

        CourtCase c13 = new CourtCase();
        c13.caseId = 113;
        c13.courtName = "Civil Court";
        c13.judgeName = "Justice Thomas";
        c13.caseType = "Property";
        c13.status = "Closed";
        c13.hearingDate = "01-07-2025";
        c13.isHighProfile = false;

        System.out.println("Case ID: " + c13.caseId);
        System.out.println("Court Name: " + c13.courtName);
        System.out.println("Judge Name: " + c13.judgeName);
        System.out.println("Case Type: " + c13.caseType);
        System.out.println("Status: " + c13.status);
        System.out.println("Hearing Date: " + c13.hearingDate);
        System.out.println("High Profile: " + c13.isHighProfile);

        CourtCase c14 = new CourtCase();
        c14.caseId = 114;
        c14.courtName = "District Court";
        c14.judgeName = "Justice Khan";
        c14.caseType = "Fraud";
        c14.status = "Hearing Scheduled";
        c14.hearingDate = "18-09-2025";
        c14.isHighProfile = true;

        System.out.println("Case ID: " + c14.caseId);
        System.out.println("Court Name: " + c14.courtName);
        System.out.println("Judge Name: " + c14.judgeName);
        System.out.println("Case Type: " + c14.caseType);
        System.out.println("Status: " + c14.status);
        System.out.println("Hearing Date: " + c14.hearingDate);
        System.out.println("High Profile: " + c14.isHighProfile);

        CourtCase c15 = new CourtCase();
        c15.caseId = 115;
        c15.courtName = "Consumer Court";
        c15.judgeName = "Justice Desai";
        c15.caseType = "Consumer Dispute";
        c15.status = "Verdict Given";
        c15.hearingDate = "06-08-2025";
        c15.isHighProfile = false;

        System.out.println("Case ID: " + c15.caseId);
        System.out.println("Court Name: " + c15.courtName);
        System.out.println("Judge Name: " + c15.judgeName);
        System.out.println("Case Type: " + c15.caseType);
        System.out.println("Status: " + c15.status);
        System.out.println("Hearing Date: " + c15.hearingDate);
        System.out.println("High Profile: " + c15.isHighProfile);

        CourtCase c16 = new CourtCase();
        c16.caseId = 116;
        c16.courtName = "Special CBI Court";
        c16.judgeName = "Justice Bhalla";
        c16.caseType = "CBI Case";
        c16.status = "Trial";
        c16.hearingDate = "17-10-2025";
        c16.isHighProfile = true;

        System.out.println("Case ID: " + c16.caseId);
        System.out.println("Court Name: " + c16.courtName);
        System.out.println("Judge Name: " + c16.judgeName);
        System.out.println("Case Type: " + c16.caseType);
        System.out.println("Status: " + c16.status);
        System.out.println("Hearing Date: " + c16.hearingDate);
        System.out.println("High Profile: " + c16.isHighProfile);

        CourtCase c17 = new CourtCase();
        c17.caseId = 117;
        c17.courtName = "Lok Adalat";
        c17.judgeName = "Justice Iyer";
        c17.caseType = "Settlement";
        c17.status = "Resolved";
        c17.hearingDate = "03-11-2025";
        c17.isHighProfile = false;

        System.out.println("Case ID: " + c17.caseId);
        System.out.println("Court Name: " + c17.courtName);
        System.out.println("Judge Name: " + c17.judgeName);
        System.out.println("Case Type: " + c17.caseType);
        System.out.println("Status: " + c17.status);
        System.out.println("Hearing Date: " + c17.hearingDate);
        System.out.println("High Profile: " + c17.isHighProfile);

        CourtCase c18 = new CourtCase();
        c18.caseId = 118;
        c18.courtName = "Tribunal Court";
        c18.judgeName = "Justice Reddy";
        c18.caseType = "Tax Dispute";
        c18.status = "Under Appeal";
        c18.hearingDate = "25-09-2025";
        c18.isHighProfile = false;

        System.out.println("Case ID: " + c18.caseId);
        System.out.println("Court Name: " + c18.courtName);
        System.out.println("Judge Name: " + c18.judgeName);
        System.out.println("Case Type: " + c18.caseType);
        System.out.println("Status: " + c18.status);
        System.out.println("Hearing Date: " + c18.hearingDate);
        System.out.println("High Profile: " + c18.isHighProfile);

        CourtCase c19 = new CourtCase();
        c19.caseId = 119;
        c19.courtName = "High Court";
        c19.judgeName = "Justice Bhushan";
        c19.caseType = "Constitutional";
        c19.status = "Pending";
        c19.hearingDate = "30-12-2025";
        c19.isHighProfile = true;

        System.out.println("Case ID: " + c19.caseId);
        System.out.println("Court Name: " + c19.courtName);
        System.out.println("Judge Name: " + c19.judgeName);
        System.out.println("Case Type: " + c19.caseType);
        System.out.println("Status: " + c19.status);
        System.out.println("Hearing Date: " + c19.hearingDate);
        System.out.println("High Profile: " + c19.isHighProfile);

        CourtCase c20 = new CourtCase();
        c20.caseId = 120;
        c20.courtName = "Supreme Court";
        c20.judgeName = "Justice Mehra";
        c20.caseType = "Land Dispute";
        c20.status = "Under Scrutiny";
        c20.hearingDate = "15-10-2025";
        c20.isHighProfile = true;

        System.out.println("Case ID: " + c20.caseId);
        System.out.println("Court Name: " + c20.courtName);
        System.out.println("Judge Name: " + c20.judgeName);
        System.out.println("Case Type: " + c20.caseType);
        System.out.println("Status: " + c20.status);
        System.out.println("Hearing Date: " + c20.hearingDate);
        System.out.println("High Profile: " + c20.isHighProfile);


        System.out.println("THE MAIN ENDED");
    }
}
