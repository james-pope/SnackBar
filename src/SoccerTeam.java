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
    public int points(){
        int count = 0;
        for (int i =0; i <  wins; i++) count += 3;
        for(int i = 0; i < ties; i++) count++;
        return count;
    }
}
