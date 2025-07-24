class InvitationCardRunner {

    public static void main(String[] args) {

        InvitationCard i1 = new InvitationCard();
        i1.occasion = "Wedding";
        i1.hostName = "Rahul Sharma";
        i1.venue = "Grand Palace, Delhi";
        i1.date = "10-Oct-2025";
        i1.time = "6:00 PM";
        i1.numberOfGuests = 300;
        i1.isRsvpRequired = true;
        i1.getInfo();

        InvitationCard i2 = new InvitationCard();
        i2.occasion = "Birthday";
        i2.hostName = "Ananya Mehta";
        i2.venue = "Kids Zone, Bangalore";
        i2.date = "15-Aug-2025";
        i2.time = "3:00 PM";
        i2.numberOfGuests = 40;
        i2.isRsvpRequired = false;
        i2.getInfo();

        InvitationCard i3 = new InvitationCard();
        i3.occasion = "Anniversary";
        i3.hostName = "Mr. and Mrs. Iyer";
        i3.venue = "Leela Palace, Chennai";
        i3.date = "25-Dec-2025";
        i3.time = "8:00 PM";
        i3.numberOfGuests = 150;
        i3.isRsvpRequired = true;
        i3.getInfo();

        InvitationCard i4 = new InvitationCard();
        i4.occasion = "Housewarming";
        i4.hostName = "Ramesh Kumar";
        i4.venue = "Whitefield, Bangalore";
        i4.date = "12-Sep-2025";
        i4.time = "10:30 AM";
        i4.numberOfGuests = 100;
        i4.isRsvpRequired = false;
        i4.getInfo();

        InvitationCard i5 = new InvitationCard();
        i5.occasion = "Engagement";
        i5.hostName = "Priya Singh";
        i5.venue = "Club Mahindra, Goa";
        i5.date = "30-Nov-2025";
        i5.time = "5:00 PM";
        i5.numberOfGuests = 200;
        i5.isRsvpRequired = true;
        i5.getInfo();

        InvitationCard i6 = new InvitationCard();
        i6.occasion = "Farewell Party";
        i6.hostName = "IT Department";
        i6.venue = "Company Lawn";
        i6.date = "01-Mar-2025";
        i6.time = "4:00 PM";
        i6.numberOfGuests = 80;
        i6.isRsvpRequired = false;
        i6.getInfo();

        InvitationCard i7 = new InvitationCard();
        i7.occasion = "Baby Shower";
        i7.hostName = "Pooja Verma";
        i7.venue = "Green Villa, Jaipur";
        i7.date = "18-Apr-2025";
        i7.time = "11:00 AM";
        i7.numberOfGuests = 60;
        i7.isRsvpRequired = true;
        i7.getInfo();

        InvitationCard i8 = new InvitationCard();
        i8.occasion = "Graduation Party";
        i8.hostName = "Aakash Jain";
        i8.venue = "Sky Lounge, Mumbai";
        i8.date = "20-May-2025";
        i8.time = "7:30 PM";
        i8.numberOfGuests = 50;
        i8.isRsvpRequired = false;
        i8.getInfo();

        InvitationCard i9 = new InvitationCard();
        i9.occasion = "Retirement";
        i9.hostName = "Mr. Suresh Rao";
        i9.venue = "Town Hall, Udupi";
        i9.date = "10-Jan-2025";
        i9.time = "6:00 PM";
        i9.numberOfGuests = 120;
        i9.isRsvpRequired = true;
        i9.getInfo();

        InvitationCard i10 = new InvitationCard();
        i10.occasion = "Naming Ceremony";
        i10.hostName = "Deepak & Anjali";
        i10.venue = "Shri Mandir Hall";
        i10.date = "05-Jul-2025";
        i10.time = "9:00 AM";
        i10.numberOfGuests = 70;
        i10.isRsvpRequired = false;
        i10.getInfo();

        InvitationCard i11 = new InvitationCard();
        i11.occasion = "Cultural Night";
        i11.hostName = "XYZ University";
        i11.venue = "Auditorium";
        i11.date = "22-Aug-2025";
        i11.time = "6:30 PM";
        i11.numberOfGuests = 500;
        i11.isRsvpRequired = true;
        i11.getInfo();

        InvitationCard i12 = new InvitationCard();
        i12.occasion = "Workshop";
        i12.hostName = "AI Academy";
        i12.venue = "Tech Hub, Pune";
        i12.date = "09-Sep-2025";
        i12.time = "2:00 PM";
        i12.numberOfGuests = 120;
        i12.isRsvpRequired = true;
        i12.getInfo();

        InvitationCard i13 = new InvitationCard();
        i13.occasion = "Book Launch";
        i13.hostName = "Author's Circle";
        i13.venue = "Book Cafe, Delhi";
        i13.date = "12-Oct-2025";
        i13.time = "5:30 PM";
        i13.numberOfGuests = 90;
        i13.isRsvpRequired = false;
        i13.getInfo();

        InvitationCard i14 = new InvitationCard();
        i14.occasion = "Charity Dinner";
        i14.hostName = "Hope Foundation";
        i14.venue = "Star Hotel, Hyderabad";
        i14.date = "25-Nov-2025";
        i14.time = "7:00 PM";
        i14.numberOfGuests = 200;
        i14.isRsvpRequired = true;
        i14.getInfo();

        InvitationCard i15 = new InvitationCard();
        i15.occasion = "Product Launch";
        i15.hostName = "InnoTech";
        i15.venue = "Tech Arena";
        i15.date = "02-Dec-2025";
        i15.time = "3:00 PM";
        i15.numberOfGuests = 300;
        i15.isRsvpRequired = true;
        i15.getInfo();

        InvitationCard i16 = new InvitationCard();
        i16.occasion = "Music Concert";
        i16.hostName = "Live Beats";
        i16.venue = "Stadium Grounds";
        i16.date = "18-Dec-2025";
        i16.time = "8:00 PM";
        i16.numberOfGuests = 1000;
        i16.isRsvpRequired = false;
        i16.getInfo();

        InvitationCard i17 = new InvitationCard();
        i17.occasion = "Art Exhibition";
        i17.hostName = "Canvas Club";
        i17.venue = "Art Gallery";
        i17.date = "14-Jan-2025";
        i17.time = "11:00 AM";
        i17.numberOfGuests = 150;
        i17.isRsvpRequired = false;
        i17.getInfo();

        InvitationCard i18 = new InvitationCard();
        i18.occasion = "Seminar";
        i18.hostName = "EduForum";
        i18.venue = "Convention Center";
        i18.date = "06-Feb-2025";
        i18.time = "10:00 AM";
        i18.numberOfGuests = 250;
        i18.isRsvpRequired = true;
        i18.getInfo();

        InvitationCard i19 = new InvitationCard();
        i19.occasion = "Sports Meet";
        i19.hostName = "City Sports Club";
        i19.venue = "Central Ground";
        i19.date = "03-Mar-2025";
        i19.time = "9:00 AM";
        i19.numberOfGuests = 400;
        i19.isRsvpRequired = false;
        i19.getInfo();

        InvitationCard i20 = new InvitationCard();
        i20.occasion = "Family Reunion";
        i20.hostName = "Patel Family";
        i20.venue = "Farmhouse, Surat";
        i20.date = "28-Apr-2025";
        i20.time = "1:00 PM";
        i20.numberOfGuests = 60;
        i20.isRsvpRequired = true;
        i20.getInfo();

        System.out.println("MAIN ENDED");
    }
}
