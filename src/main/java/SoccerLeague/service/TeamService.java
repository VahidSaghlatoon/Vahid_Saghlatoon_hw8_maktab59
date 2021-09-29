package SoccerLeague.service;

import SoccerLeague.dao.TeamDao;

public class TeamService {
     private TeamDao teamDao = new TeamDao();

     public void cityTeamCount(){
         teamDao.read();
     }
}
