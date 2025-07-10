class FootballRunner{

public static void main (String [] football){

System.out.println("MAIN STARTED");

byte player=Football.getTeamPlayers();
System.out.println("Team Players: " +player );

short capacity=Football.getStadiumCapacity();
System.out.println("Stadium Capacity: " + capacity);

int fans=Football.getTotalFans();
System.out.println("Total Fans: " + fans);

long viewers=Football.getGlobalViewers();
System.out.println("Global Viewers: " + viewers);

float height=Football.getPlayerHeight();
System.out.println("Player Height: " + height + " ft");

double salary=Football.getPlayerSalary();
System.out.println("Player Salary: $" + salary);

char grade=Football.getTeamGrade();
System.out.println("Team Grade: " + grade);

boolean match=Football.getMatchOngoing();
System.out.println("Is Match Ongoing? " + match);

String name=Football.getTeamName();
System.out.println("Team Name: " + name);
}
}