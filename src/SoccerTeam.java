public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;

    public SoccerTeam(){
        wins = 0;
        losses = 0;
        ties = 0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore) {
        if(myScore == otherScore) ties++; other.ties++;
        if (myScore > otherScore) wins++; other.losses++;
        if (myScore < otherScore) losses++; other.wins++;
    }
}
