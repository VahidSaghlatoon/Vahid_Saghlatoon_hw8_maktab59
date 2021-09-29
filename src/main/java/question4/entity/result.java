package question4.entity;

public class result {
    private int resultId ;
    private int teamId;
    private int matchId;
    private int point ;
    private int goalFor;
    private int goalAgainst;

    public result(int resultId, int teamId, int matchId, int point, int goalFor, int goalAgainst) {
        this.resultId = resultId;
        this.teamId = teamId;
        this.matchId = matchId;
        this.point = point;
        this.goalFor = goalFor;
        this.goalAgainst = goalAgainst;
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getGoalFor() {
        return goalFor;
    }

    public void setGoalFor(int goalFor) {
        this.goalFor = goalFor;
    }

    public int getGoalAgainst() {
        return goalAgainst;
    }

    public void setGoalAgainst(int goalAgainst) {
        this.goalAgainst = goalAgainst;
    }
}
