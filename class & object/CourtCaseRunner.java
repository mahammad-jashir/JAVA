class CourtCaseRunner {

    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

        CourtCase c1 = new CourtCase();
        c1.caseId = 101;
        c1.courtName = "Supreme Court";
        c1.judgeName = "Justice Ramana";
        c1.caseType = "Criminal";
        c1.status = "Pending";
        c1.hearingDate = "2025-08-01";
        c1.isHighProfile = true;
        c1.getInfo();

        CourtCase c2 = new CourtCase();
        c2.caseId = 102;
        c2.courtName = "High Court Mumbai";
        c2.judgeName = "Justice Desai";
        c2.caseType = "Civil";
        c2.status = "Closed";
        c2.hearingDate = "2025-06-15";
        c2.isHighProfile = false;
        c2.getInfo();

        CourtCase c3 = new CourtCase();
        c3.caseId = 103;
        c3.courtName = "High Court Delhi";
        c3.judgeName = "Justice Sharma";
        c3.caseType = "Corporate";
        c3.status = "Ongoing";
        c3.hearingDate = "2025-07-30";
        c3.isHighProfile = true;
        c3.getInfo();

        CourtCase c4 = new CourtCase();
        c4.caseId = 104;
        c4.courtName = "District Court Pune";
        c4.judgeName = "Justice Rao";
        c4.caseType = "Family";
        c4.status = "Pending";
        c4.hearingDate = "2025-09-10";
        c4.isHighProfile = false;
        c4.getInfo();

        CourtCase c5 = new CourtCase();
        c5.caseId = 105;
        c5.courtName = "Consumer Court";
        c5.judgeName = "Justice Kulkarni";
        c5.caseType = "Consumer";
        c5.status = "Closed";
        c5.hearingDate = "2025-05-22";
        c5.isHighProfile = false;
        c5.getInfo();

        CourtCase c6 = new CourtCase();
        c6.caseId = 106;
        c6.courtName = "High Court Chennai";
        c6.judgeName = "Justice Lakshmi";
        c6.caseType = "Property";
        c6.status = "Ongoing";
        c6.hearingDate = "2025-08-11";
        c6.isHighProfile = true;
        c6.getInfo();

        CourtCase c7 = new CourtCase();
        c7.caseId = 107;
        c7.courtName = "District Court Kolkata";
        c7.judgeName = "Justice Banerjee";
        c7.caseType = "Family";
        c7.status = "Pending";
        c7.hearingDate = "2025-08-17";
        c7.isHighProfile = false;
        c7.getInfo();

        CourtCase c8 = new CourtCase();
        c8.caseId = 108;
        c8.courtName = "High Court Hyderabad";
        c8.judgeName = "Justice Reddy";
        c8.caseType = "Corporate";
        c8.status = "Closed";
        c8.hearingDate = "2025-04-03";
        c8.isHighProfile = true;
        c8.getInfo();

        CourtCase c9 = new CourtCase();
        c9.caseId = 109;
        c9.courtName = "Supreme Court";
        c9.judgeName = "Justice Lalit";
        c9.caseType = "Constitutional";
        c9.status = "Ongoing";
        c9.hearingDate = "2025-08-21";
        c9.isHighProfile = true;
        c9.getInfo();

        CourtCase c10 = new CourtCase();
        c10.caseId = 110;
        c10.courtName = "Family Court Delhi";
        c10.judgeName = "Justice Ahuja";
        c10.caseType = "Divorce";
        c10.status = "Closed";
        c10.hearingDate = "2025-02-28";
        c10.isHighProfile = false;
        c10.getInfo();

        CourtCase c11 = new CourtCase();
        c11.caseId = 111;
        c11.courtName = "High Court Kerala";
        c11.judgeName = "Justice Nair";
        c11.caseType = "Criminal";
        c11.status = "Ongoing";
        c11.hearingDate = "2025-09-15";
        c11.isHighProfile = true;
        c11.getInfo();

        CourtCase c12 = new CourtCase();
        c12.caseId = 112;
        c12.courtName = "District Court Ahmedabad";
        c12.judgeName = "Justice Mehta";
        c12.caseType = "Civil";
        c12.status = "Pending";
        c12.hearingDate = "2025-10-01";
        c12.isHighProfile = false;
        c12.getInfo();

        CourtCase c13 = new CourtCase();
        c13.caseId = 113;
        c13.courtName = "Consumer Court Bangalore";
        c13.judgeName = "Justice Thomas";
        c13.caseType = "Consumer";
        c13.status = "Closed";
        c13.hearingDate = "2025-03-16";
        c13.isHighProfile = false;
        c13.getInfo();

        CourtCase c14 = new CourtCase();
        c14.caseId = 114;
        c14.courtName = "High Court Rajasthan";
        c14.judgeName = "Justice Singh";
        c14.caseType = "Property";
        c14.status = "Pending";
        c14.hearingDate = "2025-08-25";
        c14.isHighProfile = true;
        c14.getInfo();

        CourtCase c15 = new CourtCase();
        c15.caseId = 115;
        c15.courtName = "District Court Lucknow";
        c15.judgeName = "Justice Sinha";
        c15.caseType = "Criminal";
        c15.status = "Ongoing";
        c15.hearingDate = "2025-07-29";
        c15.isHighProfile = false;
        c15.getInfo();

        CourtCase c16 = new CourtCase();
        c16.caseId = 116;
        c16.courtName = "Supreme Court";
        c16.judgeName = "Justice Bhushan";
        c16.caseType = "Public Interest";
        c16.status = "Ongoing";
        c16.hearingDate = "2025-09-05";
        c16.isHighProfile = true;
        c16.getInfo();

        CourtCase c17 = new CourtCase();
        c17.caseId = 117;
        c17.courtName = "High Court Patna";
        c17.judgeName = "Justice Verma";
        c17.caseType = "Civil";
        c17.status = "Pending";
        c17.hearingDate = "2025-11-01";
        c17.isHighProfile = false;
        c17.getInfo();

        CourtCase c18 = new CourtCase();
        c18.caseId = 118;
        c18.courtName = "Family Court Chennai";
        c18.judgeName = "Justice Iyer";
        c18.caseType = "Divorce";
        c18.status = "Closed";
        c18.hearingDate = "2025-06-20";
        c18.isHighProfile = false;
        c18.getInfo();

        CourtCase c19 = new CourtCase();
        c19.caseId = 119;
        c19.courtName = "District Court Surat";
        c19.judgeName = "Justice Modi";
        c19.caseType = "Property";
        c19.status = "Ongoing";
        c19.hearingDate = "2025-07-26";
        c19.isHighProfile = false;
        c19.getInfo();

        CourtCase c20 = new CourtCase();
        c20.caseId = 120;
        c20.courtName = "High Court Bhopal";
        c20.judgeName = "Justice Kaushal";
        c20.caseType = "Criminal";
        c20.status = "Pending";
        c20.hearingDate = "2025-09-18";
        c20.isHighProfile = true;
        c20.getInfo();
System.out.println("THE MAIN ENDED");

    }
}
