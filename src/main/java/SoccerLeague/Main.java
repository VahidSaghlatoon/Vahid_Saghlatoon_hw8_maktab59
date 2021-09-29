package SoccerLeague;

import SoccerLeague.service.TeamService;

public class Main {
    public static void main(String[] args) {
//        CoachService coachService = new CoachService();
//        coachService.maxPrice();

        TeamService teamService = new TeamService();
        teamService.cityTeamCount();
    }
}
