class CourtCaseRunner {

    public static void main(String[] args) {
        System.out.println("THE MAIN STARTED");

CourtCase c1 = new CourtCase(101, "Supreme Court", "Justice Rao", "Criminal", "Pending", "2025-08-12", true);
        c1.getInfo();

        CourtCase c2 = new CourtCase(102, "High Court Mumbai", "Justice Mehta", "Civil", "Closed", "2025-07-05", false);
        c2.getInfo();

        CourtCase c3 = new CourtCase(103, "District Court", "Justice Nair", "Family", "Hearing", "2025-08-01", false);
        c3.getInfo();

        CourtCase c4 = new CourtCase(104, "High Court Delhi", "Justice Sharma", "Criminal", "Appeal", "2025-08-20", true);
        c4.getInfo();

        CourtCase c5 = new CourtCase(105, "Supreme Court", "Justice Lal", "Corporate", "Pending", "2025-09-01", true);
        c5.getInfo();

        CourtCase c6 = new CourtCase(106, "District Court", "Justice Varma", "Civil", "Verdict Given", "2025-07-15", false);
        c6.getInfo();

        CourtCase c7 = new CourtCase(107, "High Court Kolkata", "Justice Das", "Criminal", "Closed", "2025-06-20", false);
        c7.getInfo();

        CourtCase c8 = new CourtCase(108, "Family Court", "Justice Kapoor", "Family", "Pending", "2025-08-30", false);
        c8.getInfo();

        CourtCase c9 = new CourtCase(109, "High Court Chennai", "Justice Reddy", "Tax", "Appeal", "2025-09-10", true);
        c9.getInfo();

        CourtCase c10 = new CourtCase(110, "District Court", "Justice Joshi", "Property", "On Hold", "2025-08-05", false);
        c10.getInfo();

        CourtCase c11 = new CourtCase(111, "High Court Pune", "Justice Sinha", "Cyber", "Pending", "2025-08-15", true);
        c11.getInfo();

        CourtCase c12 = new CourtCase(112, "Supreme Court", "Justice Menon", "Constitutional", "Final", "2025-09-20", true);
        c12.getInfo();

        CourtCase c13 = new CourtCase(113, "District Court", "Justice Kulkarni", "Civil", "Under Review", "2025-07-30", false);
        c13.getInfo();

        CourtCase c14 = new CourtCase(114, "High Court Hyderabad", "Justice Naidu", "Criminal", "Pending", "2025-08-22", true);
        c14.getInfo();

        CourtCase c15 = new CourtCase(115, "High Court Lucknow", "Justice Ali", "Labour", "Closed", "2025-06-25", false);
        c15.getInfo();

        CourtCase c16 = new CourtCase(116, "District Court", "Justice Gupta", "Family", "Verdict Given", "2025-07-28", false);
        c16.getInfo();

        CourtCase c17 = new CourtCase(117, "High Court Bhopal", "Justice Rao", "Cyber", "Appeal", "2025-08-08", true);
        c17.getInfo();

        CourtCase c18 = new CourtCase(118, "Supreme Court", "Justice Rathi", "Environmental", "Pending", "2025-09-12", true);
        c18.getInfo();

        CourtCase c19 = new CourtCase(119, "District Court", "Justice Dev", "Property", "Hearing", "2025-08-18", false);
        c19.getInfo();

        CourtCase c20 = new CourtCase(120, "High Court Jaipur", "Justice Rawal", "Corporate", "Final", "2025-08-25", true);
        c20.getInfo();
        System.out.println("THE MAIN ENDED");

    }
}
