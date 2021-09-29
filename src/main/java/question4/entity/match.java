package question4.entity;

import java.util.Date;

public class match {
    private int matchId;
    private Date matchDate;
    private int stadiumId;
    private int teamHomeId;
    private int teamAwayId;
    private int ballId;
    private int teamHomeGoals;
    private int teamAwayGoals;
    private int refereeId;
    private int teamHomePoints;
    private int teamAwayPoints;

    public match(int matchId, Date matchDate, int stadiumId,
                 int teamHomeId, int teamAwayId, int ballId,
                 int teamHomeGoals, int teamAwayGoals, int refereeId, int teamHomePoints, int teamAwayPoints) {
        this.matchId = matchId;
        this.matchDate = matchDate;
        this.stadiumId = stadiumId;
        this.teamHomeId = teamHomeId;
        this.teamAwayId = teamAwayId;
        this.ballId = ballId;
        this.teamHomeGoals = teamHomeGoals;
        this.teamAwayGoals = teamAwayGoals;
        this.refereeId = refereeId;
        this.teamHomePoints = teamHomePoints;
        this.teamAwayPoints = teamAwayPoints;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public int getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(int stadiumId) {
        this.stadiumId = stadiumId;
    }

    public int getTeamHomeId() {
        return teamHomeId;
    }

    public void setTeamHomeId(int teamHomeId) {
        this.teamHomeId = teamHomeId;
    }

    public int getTeamAwayId() {
        return teamAwayId;
    }

    public void setTeamAwayId(int teamAwayId) {
        this.teamAwayId = teamAwayId;
    }

    public int getBallId() {
        return ballId;
    }

    public void setBallId(int ballId) {
        this.ballId = ballId;
    }

    public int getTeamHomeGoals() {
        return teamHomeGoals;
    }

    public void setTeamHomeGoals(int teamHomeGoals) {
        this.teamHomeGoals = teamHomeGoals;
    }

    public int getTeamAwayGoals() {
        return teamAwayGoals;
    }

    public void setTeamAwayGoals(int teamAwayGoals) {
        this.teamAwayGoals = teamAwayGoals;
    }

    public int getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(int refereeId) {
        this.refereeId = refereeId;
    }

    public int getTeamHomePoints() {
        return teamHomePoints;
    }

    public void setTeamHomePoints(int teamHomePoints) {
        this.teamHomePoints = teamHomePoints;
    }

    public int getTeamAwayPoints() {
        return teamAwayPoints;
    }

    public void setTeamAwayPoints(int teamAwayPoints) {
        this.teamAwayPoints = teamAwayPoints;
    }
}
