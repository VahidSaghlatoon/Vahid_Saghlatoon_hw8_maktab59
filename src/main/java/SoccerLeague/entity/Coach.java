package SoccerLeague.entity;

import java.util.Date;

public class Coach extends Person {
    private int coachId;

    public Coach() {
    }

    public Coach(int coachId, String name, int teamId, double salary, double price, Date hireDate, Date hireExpiryDate) {
        super(name, teamId, salary, price, hireDate, hireExpiryDate);
        this.coachId = coachId;
    }

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }
}
