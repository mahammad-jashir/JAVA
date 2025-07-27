class InvitationCard {

    InvitationCard() {
        System.out.println("Default constructor of InvitationCard called");
    }

    InvitationCard(String occasion, String hostName, String venue, String date,
                   String time, int numberOfGuests, boolean isRsvpRequired) {
        this.occasion = occasion;
        this.hostName = hostName;
        this.venue = venue;
        this.date = date;
        this.time = time;
        this.numberOfGuests = numberOfGuests;
        this.isRsvpRequired = isRsvpRequired;
    }

    String occasion;
    String hostName;
    String venue;
    String date;
    String time;
    int numberOfGuests;
    boolean isRsvpRequired;

    public void getInfo() {
        System.out.println("Occasion: " + occasion);
        System.out.println("Host Name: " + hostName);
        System.out.println("Venue: " + venue);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Number of Guests: " + numberOfGuests);
        System.out.println("RSVP Required: " + isRsvpRequired);
        System.out.println("--------------------------------------------");
    }
}
