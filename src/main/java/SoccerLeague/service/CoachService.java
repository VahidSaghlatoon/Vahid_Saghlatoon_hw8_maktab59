package SoccerLeague.service;

import SoccerLeague.dao.CoachDao;

public class CoachService {
    private CoachDao coachDao = new CoachDao();

    public void maxPrice(){
        coachDao.read();
    }

}
