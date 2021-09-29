package SoccerLeague.service;

import SoccerLeague.dao.ResultDao;
import SoccerLeague.entity.Result;

import java.util.Scanner;

public class ResultService {

    private ResultDao resultDao = new ResultDao();
    private Result result = new Result();
    private Scanner input = new Scanner(System.in);

    public void insert(){
        System.out.print("Enter result id : ");
        result.setResultId(input.nextInt());
        System.out.print("Enter team id : ");
        result.setTeamId(input.nextInt());
        System.out.print("Enter match id : ");
        result.setMatchId(input.nextInt());
        System.out.print("Enter point id : ");
        result.setPoint(input.nextInt());
        System.out.print("Enter goals for id : ");
        result.setGoalFor(input.nextInt());
        System.out.print("Enter goals against id : ");
        result.setGoalAgainst(input.nextInt());
        resultDao.insert(result);

    }

    public void readBypoint(){
        resultDao.read();
    }
}
