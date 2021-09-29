package question4.entity;

public class referee {
    private int refereeId;
    private String name ;

    public referee(int refereeId, String name) {
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
