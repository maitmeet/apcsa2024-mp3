public class Scoreboard {
  private String teamName1;
  private String teamName2;
  private String activeTeam;
  private int score1 = 0;
  private int score2 = 0;

  public Scoreboard(String t1, String t2) {
    teamName1 = t1;
    teamName2 = t2;
    activeTeam = teamName1;
  }

  public void recordPlay(int score) {
    if (score >= 1) {
      if (activeTeam.equals(teamName1)) {
        score1 += score;
      } else {
        score2 += score;
      }
    } else {
      if (activeTeam.equals(teamName1)) {
        activeTeam = teamName2;
      } else {
        activeTeam = teamName1;
      }
    }
  }

  public String getScore() {
    return score1 + "-" + score2 + "-" + activeTeam;
  }

}
