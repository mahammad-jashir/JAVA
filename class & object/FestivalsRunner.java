class FestivalsRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        Festivals f1 = new Festivals();
        f1.festivalId = 1;
        f1.festivalName = "Diwali";
        f1.country = "India";
        f1.month = "October";
        f1.durationDays = 5;
        f1.isPublicHoliday = true;
        f1.significance = "Festival of Lights";
        f1.getInfo();

        Festivals f2 = new Festivals();
        f2.festivalId = 2;
        f2.festivalName = "Christmas";
        f2.country = "Worldwide";
        f2.month = "December";
        f2.durationDays = 1;
        f2.isPublicHoliday = true;
        f2.significance = "Birth of Jesus Christ";
        f2.getInfo();

        Festivals f3 = new Festivals();
        f3.festivalId = 3;
        f3.festivalName = "Eid al-Fitr";
        f3.country = "Worldwide";
        f3.month = "May";
        f3.durationDays = 1;
        f3.isPublicHoliday = true;
        f3.significance = "End of Ramadan";
        f3.getInfo();

        Festivals f4 = new Festivals();
        f4.festivalId = 4;
        f4.festivalName = "Holi";
        f4.country = "India";
        f4.month = "March";
        f4.durationDays = 2;
        f4.isPublicHoliday = true;
        f4.significance = "Festival of Colors";
        f4.getInfo();

        Festivals f5 = new Festivals();
        f5.festivalId = 5;
        f5.festivalName = "Thanksgiving";
        f5.country = "USA";
        f5.month = "November";
        f5.durationDays = 1;
        f5.isPublicHoliday = true;
        f5.significance = "Giving Thanks";
        f5.getInfo();

        Festivals f6 = new Festivals();
        f6.festivalId = 6;
        f6.festivalName = "Chinese New Year";
        f6.country = "China";
        f6.month = "February";
        f6.durationDays = 15;
        f6.isPublicHoliday = true;
        f6.significance = "Lunar New Year";
        f6.getInfo();

        Festivals f7 = new Festivals();
        f7.festivalId = 7;
        f7.festivalName = "Navratri";
        f7.country = "India";
        f7.month = "October";
        f7.durationDays = 9;
        f7.isPublicHoliday = true;
        f7.significance = "Goddess Durga Worship";
        f7.getInfo();

        Festivals f8 = new Festivals();
        f8.festivalId = 8;
        f8.festivalName = "Ramadan";
        f8.country = "Islamic Nations";
        f8.month = "April";
        f8.durationDays = 30;
        f8.isPublicHoliday = false;
        f8.significance = "Month of Fasting";
        f8.getInfo();

        Festivals f9 = new Festivals();
        f9.festivalId = 9;
        f9.festivalName = "Easter";
        f9.country = "Worldwide";
        f9.month = "April";
        f9.durationDays = 1;
        f9.isPublicHoliday = true;
        f9.significance = "Resurrection of Jesus";
        f9.getInfo();

        Festivals f10 = new Festivals();
        f10.festivalId = 10;
        f10.festivalName = "Hanukkah";
        f10.country = "Israel";
        f10.month = "December";
        f10.durationDays = 8;
        f10.isPublicHoliday = false;
        f10.significance = "Jewish Festival of Lights";
        f10.getInfo();

        Festivals f11 = new Festivals();
        f11.festivalId = 11;
        f11.festivalName = "Vesak";
        f11.country = "Sri Lanka";
        f11.month = "May";
        f11.durationDays = 1;
        f11.isPublicHoliday = true;
        f11.significance = "Birth of Buddha";
        f11.getInfo();

        Festivals f12 = new Festivals();
        f12.festivalId = 12;
        f12.festivalName = "Baisakhi";
        f12.country = "India";
        f12.month = "April";
        f12.durationDays = 1;
        f12.isPublicHoliday = true;
        f12.significance = "Harvest Festival";
        f12.getInfo();

        Festivals f13 = new Festivals();
        f13.festivalId = 13;
        f13.festivalName = "Onam";
        f13.country = "India";
        f13.month = "August";
        f13.durationDays = 10;
        f13.isPublicHoliday = true;
        f13.significance = "Harvest and Homecoming of King Mahabali";
        f13.getInfo();

        Festivals f14 = new Festivals();
        f14.festivalId = 14;
        f14.festivalName = "Halloween";
        f14.country = "USA";
        f14.month = "October";
        f14.durationDays = 1;
        f14.isPublicHoliday = false;
        f14.significance = "All Hallows' Eve";
        f14.getInfo();

        Festivals f15 = new Festivals();
        f15.festivalId = 15;
        f15.festivalName = "Pongal";
        f15.country = "India";
        f15.month = "January";
        f15.durationDays = 4;
        f15.isPublicHoliday = true;
        f15.significance = "Thanksgiving to Sun God";
        f15.getInfo();

        Festivals f16 = new Festivals();
        f16.festivalId = 16;
        f16.festivalName = "Durga Puja";
        f16.country = "India";
        f16.month = "October";
        f16.durationDays = 5;
        f16.isPublicHoliday = true;
        f16.significance = "Victory of Goddess Durga";
        f16.getInfo();

        Festivals f17 = new Festivals();
        f17.festivalId = 17;
        f17.festivalName = "Rosh Hashanah";
        f17.country = "Israel";
        f17.month = "September";
        f17.durationDays = 2;
        f17.isPublicHoliday = false;
        f17.significance = "Jewish New Year";
        f17.getInfo();

        Festivals f18 = new Festivals();
        f18.festivalId = 18;
        f18.festivalName = "Lohri";
        f18.country = "India";
        f18.month = "January";
        f18.durationDays = 1;
        f18.isPublicHoliday = true;
        f18.significance = "End of Winter";
        f18.getInfo();

        Festivals f19 = new Festivals();
        f19.festivalId = 19;
        f19.festivalName = "Raksha Bandhan";
        f19.country = "India";
        f19.month = "August";
        f19.durationDays = 1;
        f19.isPublicHoliday = true;
        f19.significance = "Bond Between Siblings";
        f19.getInfo();

        Festivals f20 = new Festivals();
        f20.festivalId = 20;
        f20.festivalName = "Guru Nanak Jayanti";
        f20.country = "India";
        f20.month = "November";
        f20.durationDays = 1;
        f20.isPublicHoliday = true;
        f20.significance = "Birth of Guru Nanak";
        f20.getInfo();

        System.out.println("MAIN ENDED");
    }
}
