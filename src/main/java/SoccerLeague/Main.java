package SoccerLeague;

import SoccerLeague.service.CoachService;
import SoccerLeague.service.PlayerService;
import SoccerLeague.service.TeamService;

import java.util.Scanner;

public class Main {

    private  Scanner input = new Scanner(System.in);
    private PlayerService  playerService = new PlayerService();
    private CoachService coachService = new CoachService();
    private TeamService teamService = new TeamService();


    public static void main(String[] args) {

        Main test = new Main();
        test.menu();

    }
    public   void menu(){
        boolean check = true;
        while (check) {
            System.out.print("1--> coach max with max salary\n" +
                    "2--> player max salary by season\n" +
                    "3--> city team count\n" +
                    "0--> exit\n"+
                    "--> ");
            int choice = input.nextInt();

            switch (choice){
                case 1 :
                    coachService.maxPrice();
                    break;
                case 2 :
                    playerService.maxPriceBySeason();
                    break;
                case 3 :
                    teamService.cityTeamCount();
                    break;
                case 0 :
                    check = false ;
                    break;

            }
        }
    }
}
