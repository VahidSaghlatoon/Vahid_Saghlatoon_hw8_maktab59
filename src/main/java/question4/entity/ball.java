package question4.entity;

public class ball {
    private int ballId;
    private int ballName ;

    public ball(int ballId, int ballName) {
        this.ballId = ballId;
        this.ballName = ballName;
    }

    public int getBallId() {
        return ballId;
    }

    public void setBallId(int ballId) {
        this.ballId = ballId;
    }

    public int getBallName() {
        return ballName;
    }

    public void setBallName(int ballName) {
        this.ballName = ballName;
    }
}
