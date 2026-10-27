import java.util.*;
class Team {
 String name, captain;
 Team(String name, String captain) {
 this.name = name;
 this.captain = captain;
 }
}
class Match {
 String team1, team2, winner;
 String score;
 Match(String t1, String t2) {
 team1 = t1;
 team2 = t2;
 }
}
public class TournamentSystem {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 ArrayList<Team> teams = new ArrayList<>();
 ArrayList<Match> matches = new ArrayList<>();
 int choice;
 do {
 System.out.println("\n1. Register Team\n2. View Teams\n3. Create Match\n4. Enter
Result\n5. View Results\n6. Exit");
 System.out.print("Enter choice: ");
 choice = sc.nextInt()
sc.nextLine();
 if (choice == 1) {
 System.out.print("Team Name: ");
 String name = sc.nextLine();
 System.out.print("Captain Name: ");
 String captain = sc.nextLine();
 teams.add(new Team(name, captain));
 System.out.println("Team Registered!");
 } else if (choice == 2) {
 System.out.println("\n--- Registered Teams ---");
 for (int i = 0; i < teams.size(); i++) {
 System.out.println((i + 1) + ". " + teams.get(i).name + " (Captain: " +
teams.get(i).captain + ")");
 }
 } else if (choice == 3) {
 System.out.print("Enter Team 1 ID: ");
 int t1 = sc.nextInt();
 System.out.print("Enter Team 2 ID: ");
 int t2 = sc.nextInt();
 if (t1 <= teams.size() && t2 <= teams.size() && t1 != t2) {
 matches.add(new Match(teams.get(t1 - 1).name, teams.get(t2 - 1).name));
 System.out.println("Match Created!");
 } else {
 System.out.println("Invalid Team IDs!");
 }
} else if (choice == 4) {
 System.out.print("Enter Match Number: ");
 int m = sc.nextInt();
 sc.nextLine();
 if (m <= matches.size()) {
 Match match = matches.get(m - 1);
 System.out.print("Winner: ");
 match.winner = sc.nextLine();
 System.out.print("Score: ");
 match.score = sc.nextLine();
 System.out.println("Result Updated!");
 } else {
 System.out.println("Invalid Match Number!");
 }
 } else if (choice == 5) {
 System.out.println("\n--- Match Results ---");
 for (int i = 0; i < matches.size(); i++) {
 Match mt = matches.get(i);
 System.out.println((i + 1) + ". " + mt.team1 + " vs " + mt.team2 +
 " | Winner: " + mt.winner + " | Score: " + mt.score);
 }
 }
 } while (choice != 6);
 System.out.println("Exited.");
}
}
