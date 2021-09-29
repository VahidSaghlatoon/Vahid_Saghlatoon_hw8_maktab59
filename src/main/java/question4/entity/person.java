package question4.entity;

import java.util.Date;

public class person {
    private String name ;
    private int teamId ;
    private double salary ;
    private double price ;
    private Date hireDate;
    private Date hireExpiryDate ;

    public person(String name, int teamId, double salary, double price, Date hireDate, Date hireExpiryDate) {
        this.name = name;
        this.teamId = teamId;
        this.salary = salary;
        this.price = price;
        this.hireDate = hireDate;
        this.hireExpiryDate = hireExpiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getHireExpiryDate() {
        return hireExpiryDate;
    }

    public void setHireExpiryDate(Date hireExpiryDate) {
        this.hireExpiryDate = hireExpiryDate;
    }
}
