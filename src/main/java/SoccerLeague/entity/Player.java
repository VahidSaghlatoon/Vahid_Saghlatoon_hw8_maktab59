package SoccerLeague.entity;

import java.util.Date;

public class Player extends Person {
    private int playerId ;

    public Player(int playerId, String name, int teamId, double salary, double price, Date hireDate, Date hireExpiryDate) {
        super(name, teamId, salary, price, hireDate, hireExpiryDate);
        this.playerId = playerId ;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}
