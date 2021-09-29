package SoccerLeague.service;

import SoccerLeague.dao.BallDao;
import SoccerLeague.entity.Ball;

import java.util.Scanner;

public class BallService {
    private Scanner input = new Scanner(System.in);
    private BallDao ballDao = new BallDao();
    private Ball ball = new Ball();


    public void insert() {
        System.out.print("Enter ball id : ");
        ball.setBallId(input.nextInt());
        System.out.print("Enter ball name : ");
        ball.setBallName(input.next());
        if (ball.getBallId() != 0 && ball.getBallName() != null) {
            ballDao.insert(ball);
            System.out.println("inserted");
        } else
            System.out.println("--> failed");
    }

    public void deleteById() {
        System.out.print("Enter ball id : ");
        ball.setBallId(input.nextInt());
        if (ball.getBallId() > 0 && ball.getBallId() <= 10) {
            ballDao.deleteById(ball.getBallId());
            System.out.println("deleted");
        } else
            System.out.println("--> failed");
    }

    public void modifyById() {
        System.out.print("Enter ball id : ");
        ball.setBallId(input.nextInt());
        System.out.print("Enter ball name : ");
        ball.setBallName(input.next());
        if (ball.getBallId() > 0 && ball.getBallId() <= 10 && ball.getBallName()!=null) {
            ballDao.updateById(ball.getBallId(), ball.getBallName());
            System.out.println("modified");
        } else
            System.out.println("--> failed");

    }

    public void showAll() {
        ballDao.read();
    }

    public void showById() {
        System.out.print("Enter ball id : ");
        ball.setBallId(input.nextInt());
        if (ball.getBallId() > 0 && ball.getBallId() <=10) {
            ballDao.readById(ball.getBallId());
        } else
            System.out.println("--> failed");
    }
}
