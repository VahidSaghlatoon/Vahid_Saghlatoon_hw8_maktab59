package SoccerLeague.entity;

public class Referee {
    private int refereeId;
    private String name ;

    public Referee(int refereeId, String name) {
        this.refereeId = refereeId;
        this.name = name;
    }

    public int getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(int refereeId) {
        this.refereeId = refereeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
