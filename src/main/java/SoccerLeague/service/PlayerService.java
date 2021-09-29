package SoccerLeague.service;

import SoccerLeague.dao.PlayerDao;

public class PlayerService {
    private PlayerDao playerDao = new PlayerDao();

    public void maxPriceBySeason(){
        playerDao.read();
    }

}
