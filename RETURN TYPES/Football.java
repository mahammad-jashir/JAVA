class Football{

static String firstName;
static int totalFans;
static char teamGrade;
static boolean isMatchOngoing;
static byte teamPlayer;
static short stadiumCapacity;
static long globalViewers;
static double playerSalary;
static float playerHeight;

public static String getTeamName(){
firstName="Real madrid";
return firstName;
}

public static int getTotalFans (){
totalFans=1500000;
return totalFans ;
}

public static char getTeamGrade(){
teamGrade='A';
return teamGrade ;
}

public static Boolean getMatchOngoing(){
isMatchOngoing=true;
return isMatchOngoing;
}

public static byte getTeamPlayers(){
teamPlayer=11;
return teamPlayer;
}

public static short getStadiumCapacity(){
stadiumCapacity=30000;
return stadiumCapacity;
}

public static long getGlobalViewers(){
globalViewers=300000000L;
return globalViewers;
}

public static double getPlayerSalary(){
playerSalary=1250000.50;
return playerSalary;
}

public static float getPlayerHeight(){
playerHeight=5.7f;
return playerHeight;
}
}