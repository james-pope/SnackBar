public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    public static int totalGames;
    public static int totalGoals;

    public SoccerTeam() {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        if (myScore == otherScore) ties++; other.ties++;
        if (myScore > otherScore) wins++; other.losses++;
        if (myScore < otherScore) losses++; other.wins++;
        totalGames++;
        totalGoals += myScore + otherScore;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public int points() {
        int count = 0;
        for (int i = 0; i < wins; i++) count += 3;
        for (int i = 0; i < ties; i++) count++;
        return count;
    }

    public void reset() {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public static void startTournament() {
        totalGoals = 0;
        totalGames = 0;
    }

    public static void main(String[] args) {
        SoccerTeam s1 = new SoccerTeam();
        SoccerTeam s2 = new SoccerTeam();
        SoccerTeam s3 = new SoccerTeam();
        SoccerTeam s4 = new SoccerTeam();
        for (int i = 1; i <= 2; i++) {
            startTournament();
            s1.played(s2, (int) (Math.random() * 6), (int) (Math.random() * 6)); //makes points random
            s1.played(s3, (int) (Math.random() * 6), (int) (Math.random() * 6));
            s2.played(s3, (int) (Math.random() * 6), (int) (Math.random() * 6));
            s3.played(s4, (int) (Math.random() * 6), (int) (Math.random() * 6));
            s4.played(s2, (int) (Math.random() * 6), (int) (Math.random() * 6));
            s4.played(s1, (int) (Math.random() * 6), (int) (Math.random() * 6));
            System.out.println("Tournament " + i);
            System.out.println("Team 1 points: " + s1.points());
            System.out.println("Team 2 points: " + s2.points());
            System.out.println("Team 3 points: " + s3.points());
            System.out.println("Team 4 points: " + s4.points());
            System.out.println("Total games: " + totalGames);
            System.out.println("Total goals: " + totalGoals);
            System.out.println();

        }
    }
}
/* OUTPUT
Tournament 1
Team 1 points: 4
Team 2 points: 9
Team 3 points: 8
Team 4 points: 5
Total games: 6
Total goals: 36

Tournament 2
Team 1 points: 8
Team 2 points: 17
Team 3 points: 19
Team 4 points: 13
Total games: 6
Total goals: 37


 */