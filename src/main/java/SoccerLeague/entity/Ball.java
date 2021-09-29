package SoccerLeague.entity;

public class Ball {
    private int ballId;
    private String ballName;

    public Ball(int ballId, String ballName) {
        this.ballId = ballId;
        this.ballName = ballName;
    }

    public Ball() {

    }

    public int getBallId() {
        return ballId;
    }

    public void setBallId(int ballId) {
        if (ballId > 0 && ballId <= 10)
            this.ballId = ballId;
        else
            System.out.println("invalid id");
    }

    public String getBallName() {
        return ballName;
    }

    public void setBallName(String ballName) {

        if (ballName.length() >= 4 && ballName.length() <= 10)
            this.ballName = ballName;
        else
            System.out.println("ball name is short or long(must be between 4 to 10 character)");
    }
}
